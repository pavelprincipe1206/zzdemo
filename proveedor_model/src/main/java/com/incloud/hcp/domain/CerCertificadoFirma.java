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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.MoreObjects;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "cer_certificado_firma")
//@Audited
//@AuditTable("_audi_cer_certificado_firma")
public class CerCertificadoFirma extends BaseDomain implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CerCertificadoFirma.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Integer id;
    private String descripcion;
    private Date fechaAprobacion;
    private String indAprobacionRechazo;

    // Many to one
    private CerCertificado cerCertificado;
    private CerFirma cerFirma;

    @Override
    public String entityClassName() {
        return CerCertificadoFirma.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "cer_certificado_firma_id", precision = 10)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_cer_certificado_firma")
    @Id
    @SequenceGenerator(name = "seq_cer_certificado_firma", sequenceName = "seq_cer_certificado_firma", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public CerCertificadoFirma id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [descripcion] ------------------------

    @Size(max = 50, message = "{message.cerCertificadoFirma.descripcion.sizeMax} {max} {message.caracter}")
    @Column(name = "descripcion", length = 50)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CerCertificadoFirma descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }
    // -- [fechaAprobacion] ------------------------

    @NotNull
    @Column(name = "fecha_aprobacion", nullable = false, length = 29)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public CerCertificadoFirma fechaAprobacion(Date fechaAprobacion) {
        setFechaAprobacion(fechaAprobacion);
        return this;
    }
    // -- [indAprobacionRechazo] ------------------------

    @NotEmpty(message = "{message.cerCertificadoFirma.indAprobacionRechazo.requerido}")
    @Size(max = 1, message = "{message.cerCertificadoFirma.indAprobacionRechazo.sizeMax} {max} {message.caracter}")
    @Column(name = "ind_aprobacion_rechazo", nullable = false, length = 1)
    public String getIndAprobacionRechazo() {
        return indAprobacionRechazo;
    }

    public void setIndAprobacionRechazo(String indAprobacionRechazo) {
        this.indAprobacionRechazo = indAprobacionRechazo;
    }

    public CerCertificadoFirma indAprobacionRechazo(String indAprobacionRechazo) {
        setIndAprobacionRechazo(indAprobacionRechazo);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificadoFirma.cerCertificado ==> CerCertificado.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "cer_certificado_id", nullable = false)
    @ManyToOne
    public CerCertificado getCerCertificado() {
        return cerCertificado;
    }

    /**
     * Set the {@link #cerCertificado} without adding this CerCertificadoFirma instance on the passed {@link #cerCertificado}
     */
    public void setCerCertificado(CerCertificado cerCertificado) {
        this.cerCertificado = cerCertificado;
    }

    public CerCertificadoFirma cerCertificado(CerCertificado cerCertificado) {
        setCerCertificado(cerCertificado);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificadoFirma.cerFirma ==> CerFirma.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "cer_firma_id", nullable = false)
    @ManyToOne
    public CerFirma getCerFirma() {
        return cerFirma;
    }

    /**
     * Set the {@link #cerFirma} without adding this CerCertificadoFirma instance on the passed {@link #cerFirma}
     */
    public void setCerFirma(CerFirma cerFirma) {
        this.cerFirma = cerFirma;
    }

    public CerCertificadoFirma cerFirma(CerFirma cerFirma) {
        setCerFirma(cerFirma);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CerCertificadoFirma withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CerCertificadoFirma && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this CerCertificadoFirma instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("cerFirma", getCerFirma()) //    
                .add("cerCertificado", getCerCertificado()) //    
                .add("descripcion", getDescripcion()) //
                .add("fechaAprobacion", getFechaAprobacion()) //
                .add("indAprobacionRechazo", getIndAprobacionRechazo()) //
                .toString();
    }
}
