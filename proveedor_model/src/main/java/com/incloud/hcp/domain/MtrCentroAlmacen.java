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
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "mtr_centro_almacen")
//@Audited
//@AuditTable("_audi_mtr_centro_almacen")
public class MtrCentroAlmacen extends BaseDomain implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(MtrCentroAlmacen.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Integer id;
    private String codigoCentroSap;
    private String descripcion;
    private Integer idPadre;

    // Many to one
    private MtrSociedad mtrSociedad;

    @Override
    public String entityClassName() {
        return MtrCentroAlmacen.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "mtr_centro_id", precision = 10)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_mtr_centro_almacen")
    @Id
    @SequenceGenerator(name = "seq_mtr_centro_almacen", sequenceName = "seq_mtr_centro_almacen", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public MtrCentroAlmacen id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [codigoCentroSap] ------------------------

    @NotEmpty(message = "{message.mtrCentroAlmacen.codigoCentroSap.requerido}")
    @Size(max = 10, message = "{message.mtrCentroAlmacen.codigoCentroSap.sizeMax} {max} {message.caracter}")
    @Column(name = "codigo_centro_sap", nullable = false, length = 10)
    public String getCodigoCentroSap() {
        return codigoCentroSap;
    }

    public void setCodigoCentroSap(String codigoCentroSap) {
        this.codigoCentroSap = codigoCentroSap;
    }

    public MtrCentroAlmacen codigoCentroSap(String codigoCentroSap) {
        setCodigoCentroSap(codigoCentroSap);
        return this;
    }
    // -- [descripcion] ------------------------

    @NotEmpty(message = "{message.mtrCentroAlmacen.descripcion.requerido}")
    @Size(max = 255, message = "{message.mtrCentroAlmacen.descripcion.sizeMax} {max} {message.caracter}")
    @Column(name = "descripcion", nullable = false)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MtrCentroAlmacen descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }
    // -- [idPadre] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "id_padre", precision = 10)
    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    public MtrCentroAlmacen idPadre(Integer idPadre) {
        setIdPadre(idPadre);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: MtrCentroAlmacen.mtrSociedad ==> MtrSociedad.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_sociedad_id", nullable = false)
    @ManyToOne
    public MtrSociedad getMtrSociedad() {
        return mtrSociedad;
    }

    /**
     * Set the {@link #mtrSociedad} without adding this MtrCentroAlmacen instance on the passed {@link #mtrSociedad}
     */
    public void setMtrSociedad(MtrSociedad mtrSociedad) {
        this.mtrSociedad = mtrSociedad;
    }

    public MtrCentroAlmacen mtrSociedad(MtrSociedad mtrSociedad) {
        setMtrSociedad(mtrSociedad);
        return this;
    }

    /**
     * Apply the default values.
     */
    public MtrCentroAlmacen withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof MtrCentroAlmacen && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this MtrCentroAlmacen instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("codigoCentroSap", getCodigoCentroSap()) //
                .add("descripcion", getDescripcion()) //
                .add("idPadre", getIdPadre()) //
                .add("mtrSociedad", getMtrSociedad()) //    
                .toString();
    }
}
