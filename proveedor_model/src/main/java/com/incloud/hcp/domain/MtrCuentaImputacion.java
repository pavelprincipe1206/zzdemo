/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/Entity.java.e.vm
 */
package com.incloud.hcp.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "mtr_cuenta_imputacion", uniqueConstraints = {
        @UniqueConstraint(name = "mtr_cuenta_imputacion_ak01", columnNames = { "codigo_cuenta_imputacion", "mtr_tipo_imputacion_id", "mtr_sociedad_id" }) })
//@Audited
//@AuditTable("_audi_mtr_cuenta_imputacion")
public class MtrCuentaImputacion extends BaseDomain implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(MtrCuentaImputacion.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Integer id;
    private String codigoCuentaImputacion;
    private String descripcion;

    // Many to one
    private MtrTipoImputacion mtrTipoImputacion;
    private MtrSociedad mtrSociedad;

    @Override
    public String entityClassName() {
        return MtrCuentaImputacion.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "mtr_cuenta_imputacion_id", precision = 10)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_mtr_cuenta_imputacion")
    @Id
    @SequenceGenerator(name = "seq_mtr_cuenta_imputacion", sequenceName = "seq_mtr_cuenta_imputacion", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public MtrCuentaImputacion id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [codigoCuentaImputacion] ------------------------

    @NotEmpty(message = "{message.mtrCuentaImputacion.codigoCuentaImputacion.requerido}")
    @Size(max = 10, message = "{message.mtrCuentaImputacion.codigoCuentaImputacion.sizeMax} {max} {message.caracter}")
    @Column(name = "codigo_cuenta_imputacion", nullable = false, length = 10)
    public String getCodigoCuentaImputacion() {
        return codigoCuentaImputacion;
    }

    public void setCodigoCuentaImputacion(String codigoCuentaImputacion) {
        this.codigoCuentaImputacion = codigoCuentaImputacion;
    }

    public MtrCuentaImputacion codigoCuentaImputacion(String codigoCuentaImputacion) {
        setCodigoCuentaImputacion(codigoCuentaImputacion);
        return this;
    }
    // -- [descripcion] ------------------------

    @NotEmpty(message = "{message.mtrCuentaImputacion.descripcion.requerido}")
    @Size(max = 100, message = "{message.mtrCuentaImputacion.descripcion.sizeMax} {max} {message.caracter}")
    @Column(name = "descripcion", nullable = false, unique = true, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MtrCuentaImputacion descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: MtrCuentaImputacion.mtrTipoImputacion ==> MtrTipoImputacion.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_tipo_imputacion_id", nullable = false)
    @ManyToOne
    public MtrTipoImputacion getMtrTipoImputacion() {
        return mtrTipoImputacion;
    }

    /**
     * Set the {@link #mtrTipoImputacion} without adding this MtrCuentaImputacion instance on the passed {@link #mtrTipoImputacion}
     */
    public void setMtrTipoImputacion(MtrTipoImputacion mtrTipoImputacion) {
        this.mtrTipoImputacion = mtrTipoImputacion;
    }

    public MtrCuentaImputacion mtrTipoImputacion(MtrTipoImputacion mtrTipoImputacion) {
        setMtrTipoImputacion(mtrTipoImputacion);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: MtrCuentaImputacion.mtrSociedad ==> MtrSociedad.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_sociedad_id")
    @ManyToOne
    public MtrSociedad getMtrSociedad() {
        return mtrSociedad;
    }

    /**
     * Set the {@link #mtrSociedad} without adding this MtrCuentaImputacion instance on the passed {@link #mtrSociedad}
     */
    public void setMtrSociedad(MtrSociedad mtrSociedad) {
        this.mtrSociedad = mtrSociedad;
    }

    public MtrCuentaImputacion mtrSociedad(MtrSociedad mtrSociedad) {
        setMtrSociedad(mtrSociedad);
        return this;
    }

    /**
     * Apply the default values.
     */
    public MtrCuentaImputacion withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof MtrCuentaImputacion && hashCode() == other.hashCode());
    }

    private volatile int previousHashCode = 0;

    @Override
    public int hashCode() {
        int hashCode = Objects.hashCode(getDescripcion());

        if (previousHashCode != 0 && previousHashCode != hashCode) {
            log.warning("DEVELOPER: hashCode has changed!." //
                    + "If you encounter this message you should take the time to carefuly review equals/hashCode for: " //
                    + getClass().getCanonicalName());
        }

        previousHashCode = hashCode;
        return hashCode;
    }

    /**
     * Construct a readable string representation for this MtrCuentaImputacion instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("codigoCuentaImputacion", getCodigoCuentaImputacion()) //
                .add("descripcion", getDescripcion()) //
                .add("mtrTipoImputacion", getMtrTipoImputacion()) //    
                .add("mtrSociedad", getMtrSociedad()) //    
                .toString();
    }
}
