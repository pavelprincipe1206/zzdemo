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
import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "cer_nota_pedido")
//@Audited
//@AuditTable("_audi_cer_nota_pedido")
public class CerNotaPedido extends BaseDomain implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CerNotaPedido.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Integer id;
    private String codigoNotaPedidoSap;
    private String userCompra;
    private String tnotasAclaratorias;
    private String tlugarPago;
    private String tformaPago;
    private String tdocParticulares;
    private String tconcepto;
    private Integer plazo;
    private String nroPedidoOriginal;
    private String nroBid;
    private BigDecimal monto;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaDocumento;
    private Date fechaCierre;
    private Date fechaAcuseRecibo;
    private String descripcion;
    private String concepto;
    private Date fechaFinVigencia;
    private String emailUserCompra;
    private String tipo;
    private String nombreCompletoCompra;

    // Many to one
    private MtrEstado mtrEstado;
    private MtrOrgCompra mtrOrgCompra;
    private MtrSociedad mtrSociedad;
    private MtrClaseDocumento mtrClaseDocumento;
    private MtrMoneda mtrMoneda;
    private MtrCondicionPago mtrCondicionPago;
    private MtrProveedor mtrProveedor;

    //Transient
    private String fechaInicioIni;
    private String fechaInicioFin;
    private String fechaDocumentoIni;
    private String fechaDocumentoFin;
    private String fechaFinVigenciaIni;
    private String fechaFinVigenciaFin;
    private Integer mtrAprobadorId;
    private BigDecimal saldoPendiente;

    @Transient
    public String getFechaInicioIni() {
        return fechaInicioIni;
    }

    public void setFechaInicioIni(String fechaInicioIni) {
        this.fechaInicioIni = fechaInicioIni;
    }

    @Transient
    public String getFechaInicioFin() {
        return fechaInicioFin;
    }

    public void setFechaInicioFin(String fechaInicioFin) {
        this.fechaInicioFin = fechaInicioFin;
    }

    @Transient
    public String getFechaDocumentoIni() {
        return fechaDocumentoIni;
    }

    public void setFechaDocumentoIni(String fechaDocumentoIni) {
        this.fechaDocumentoIni = fechaDocumentoIni;
    }

    @Transient
    public String getFechaDocumentoFin() {
        return fechaDocumentoFin;
    }

    public void setFechaDocumentoFin(String fechaDocumentoFin) {
        this.fechaDocumentoFin = fechaDocumentoFin;
    }

    @Transient
    public String getFechaFinVigenciaIni() {
        return fechaFinVigenciaIni;
    }

    public void setFechaFinVigenciaIni(String fechaFinVigenciaIni) {
        this.fechaFinVigenciaIni = fechaFinVigenciaIni;
    }

    @Transient
    public String getFechaFinVigenciaFin() {
        return fechaFinVigenciaFin;
    }

    public void setFechaFinVigenciaFin(String fechaFinVigenciaFin) {
        this.fechaFinVigenciaFin = fechaFinVigenciaFin;
    }

    @Transient
    public Integer getMtrAprobadorId() {
        return mtrAprobadorId;
    }

    public void setMtrAprobadorId(Integer mtrAprobadorId) {
        this.mtrAprobadorId = mtrAprobadorId;
    }

    @Transient
    public BigDecimal getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(BigDecimal saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }




    @Override
    public String entityClassName() {
        return CerNotaPedido.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "cer_nota_pedido_id", precision = 10)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_cer_nota_pedido")
    @Id
    @SequenceGenerator(name = "seq_cer_nota_pedido", sequenceName = "seq_cer_nota_pedido", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public CerNotaPedido id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [codigoNotaPedidoSap] ------------------------

    @NotEmpty(message = "{message.cerNotaPedido.codigoNotaPedidoSap.requerido}")
    @Size(max = 20, message = "{message.cerNotaPedido.codigoNotaPedidoSap.sizeMax} {max} {message.caracter}")
    @Column(name = "codigo_nota_pedido_sap", nullable = false, unique = true, length = 20)
    public String getCodigoNotaPedidoSap() {
        return codigoNotaPedidoSap;
    }

    public void setCodigoNotaPedidoSap(String codigoNotaPedidoSap) {
        this.codigoNotaPedidoSap = codigoNotaPedidoSap;
    }

    public CerNotaPedido codigoNotaPedidoSap(String codigoNotaPedidoSap) {
        setCodigoNotaPedidoSap(codigoNotaPedidoSap);
        return this;
    }
    // -- [userCompra] ------------------------

    @Size(max = 20, message = "{message.cerNotaPedido.userCompra.sizeMax} {max} {message.caracter}")
    @Column(name = "user_compra", length = 20)
    public String getUserCompra() {
        return userCompra;
    }

    public void setUserCompra(String userCompra) {
        this.userCompra = userCompra;
    }

    public CerNotaPedido userCompra(String userCompra) {
        setUserCompra(userCompra);
        return this;
    }
    // -- [tnotasAclaratorias] ------------------------

    @Size(max = 4000, message = "{message.cerNotaPedido.tnotasAclaratorias.sizeMax} {max} {message.caracter}")
    @Column(name = "tnotas_aclaratorias", length = 4000)
    public String getTnotasAclaratorias() {
        return tnotasAclaratorias;
    }

    public void setTnotasAclaratorias(String tnotasAclaratorias) {
        this.tnotasAclaratorias = tnotasAclaratorias;
    }

    public CerNotaPedido tnotasAclaratorias(String tnotasAclaratorias) {
        setTnotasAclaratorias(tnotasAclaratorias);
        return this;
    }
    // -- [tlugarPago] ------------------------

    @Size(max = 4000, message = "{message.cerNotaPedido.tlugarPago.sizeMax} {max} {message.caracter}")
    @Column(name = "tlugar_pago", length = 4000)
    public String getTlugarPago() {
        return tlugarPago;
    }

    public void setTlugarPago(String tlugarPago) {
        this.tlugarPago = tlugarPago;
    }

    public CerNotaPedido tlugarPago(String tlugarPago) {
        setTlugarPago(tlugarPago);
        return this;
    }
    // -- [tformaPago] ------------------------

    @Size(max = 4000, message = "{message.cerNotaPedido.tformaPago.sizeMax} {max} {message.caracter}")
    @Column(name = "tforma_pago", length = 4000)
    public String getTformaPago() {
        return tformaPago;
    }

    public void setTformaPago(String tformaPago) {
        this.tformaPago = tformaPago;
    }

    public CerNotaPedido tformaPago(String tformaPago) {
        setTformaPago(tformaPago);
        return this;
    }
    // -- [tdocParticulares] ------------------------

    @Size(max = 4000, message = "{message.cerNotaPedido.tdocParticulares.sizeMax} {max} {message.caracter}")
    @Column(name = "tdoc_particulares", length = 4000)
    public String getTdocParticulares() {
        return tdocParticulares;
    }

    public void setTdocParticulares(String tdocParticulares) {
        this.tdocParticulares = tdocParticulares;
    }

    public CerNotaPedido tdocParticulares(String tdocParticulares) {
        setTdocParticulares(tdocParticulares);
        return this;
    }
    // -- [tconcepto] ------------------------

    @Size(max = 4000, message = "{message.cerNotaPedido.tconcepto.sizeMax} {max} {message.caracter}")
    @Column(name = "tconcepto", length = 4000)
    public String getTconcepto() {
        return tconcepto;
    }

    public void setTconcepto(String tconcepto) {
        this.tconcepto = tconcepto;
    }

    public CerNotaPedido tconcepto(String tconcepto) {
        setTconcepto(tconcepto);
        return this;
    }
    // -- [plazo] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "plazo", precision = 10)
    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public CerNotaPedido plazo(Integer plazo) {
        setPlazo(plazo);
        return this;
    }
    // -- [nroPedidoOriginal] ------------------------

    @Size(max = 100, message = "{message.cerNotaPedido.nroPedidoOriginal.sizeMax} {max} {message.caracter}")
    @Column(name = "nro_pedido_original", length = 100)
    public String getNroPedidoOriginal() {
        return nroPedidoOriginal;
    }

    public void setNroPedidoOriginal(String nroPedidoOriginal) {
        this.nroPedidoOriginal = nroPedidoOriginal;
    }

    public CerNotaPedido nroPedidoOriginal(String nroPedidoOriginal) {
        setNroPedidoOriginal(nroPedidoOriginal);
        return this;
    }
    // -- [nroBid] ------------------------

    @Size(max = 10, message = "{message.cerNotaPedido.nroBid.sizeMax} {max} {message.caracter}")
    @Column(name = "nro_bid", length = 10)
    public String getNroBid() {
        return nroBid;
    }

    public void setNroBid(String nroBid) {
        this.nroBid = nroBid;
    }

    public CerNotaPedido nroBid(String nroBid) {
        setNroBid(nroBid);
        return this;
    }
    // -- [monto] ------------------------

    @Digits(integer = 17, fraction = 2)
    @Column(name = "monto", precision = 19, scale = 2)
    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public CerNotaPedido monto(BigDecimal monto) {
        setMonto(monto);
        return this;
    }
    // -- [fechaInicio] ------------------------

    @Column(name = "fecha_inicio", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public CerNotaPedido fechaInicio(Date fechaInicio) {
        setFechaInicio(fechaInicio);
        return this;
    }
    // -- [fechaFin] ------------------------

    @Column(name = "fecha_fin", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public CerNotaPedido fechaFin(Date fechaFin) {
        setFechaFin(fechaFin);
        return this;
    }
    // -- [fechaDocumento] ------------------------

    @Column(name = "fecha_documento", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public CerNotaPedido fechaDocumento(Date fechaDocumento) {
        setFechaDocumento(fechaDocumento);
        return this;
    }
    // -- [fechaCierre] ------------------------

    @Column(name = "fecha_cierre", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public CerNotaPedido fechaCierre(Date fechaCierre) {
        setFechaCierre(fechaCierre);
        return this;
    }
    // -- [fechaAcuseRecibo] ------------------------

    @Column(name = "fecha_acuse_recibo", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaAcuseRecibo() {
        return fechaAcuseRecibo;
    }

    public void setFechaAcuseRecibo(Date fechaAcuseRecibo) {
        this.fechaAcuseRecibo = fechaAcuseRecibo;
    }

    public CerNotaPedido fechaAcuseRecibo(Date fechaAcuseRecibo) {
        setFechaAcuseRecibo(fechaAcuseRecibo);
        return this;
    }
    // -- [descripcion] ------------------------

    @Size(max = 255, message = "{message.cerNotaPedido.descripcion.sizeMax} {max} {message.caracter}")
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CerNotaPedido descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }
    // -- [concepto] ------------------------

    @Size(max = 4000, message = "{message.cerNotaPedido.concepto.sizeMax} {max} {message.caracter}")
    @Column(name = "concepto", length = 4000)
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public CerNotaPedido concepto(String concepto) {
        setConcepto(concepto);
        return this;
    }
    // -- [fechaFinVigencia] ------------------------

    @Column(name = "fecha_fin_vigencia", length = 29)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public CerNotaPedido fechaFinVigencia(Date fechaFinVigencia) {
        setFechaFinVigencia(fechaFinVigencia);
        return this;
    }
    // -- [emailUserCompra] ------------------------

    @Size(max = 100, message = "{message.cerNotaPedido.emailUserCompra.sizeMax} {max} {message.caracter}")
    @Column(name = "email_user_compra", length = 100)
    public String getEmailUserCompra() {
        return emailUserCompra;
    }

    public void setEmailUserCompra(String emailUserCompra) {
        this.emailUserCompra = emailUserCompra;
    }

    public CerNotaPedido emailUserCompra(String emailUserCompra) {
        setEmailUserCompra(emailUserCompra);
        return this;
    }
    // -- [tipo] ------------------------

    @Size(max = 1, message = "{message.cerNotaPedido.tipo.sizeMax} {max} {message.caracter}")
    @Column(name = "tipo", length = 1)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CerNotaPedido tipo(String tipo) {
        setTipo(tipo);
        return this;
    }
    // -- [nombreCompletoCompra] ------------------------

    @Size(max = 200, message = "{message.cerNotaPedido.nombreCompletoCompra.sizeMax} {max} {message.caracter}")
    @Column(name = "nombre_completo_compra", length = 200)
    public String getNombreCompletoCompra() {
        return nombreCompletoCompra;
    }

    public void setNombreCompletoCompra(String nombreCompletoCompra) {
        this.nombreCompletoCompra = nombreCompletoCompra;
    }

    public CerNotaPedido nombreCompletoCompra(String nombreCompletoCompra) {
        setNombreCompletoCompra(nombreCompletoCompra);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedido.mtrEstado ==> MtrEstado.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_estado_id", nullable = false)
    @ManyToOne
    public MtrEstado getMtrEstado() {
        return mtrEstado;
    }

    /**
     * Set the {@link #mtrEstado} without adding this CerNotaPedido instance on the passed {@link #mtrEstado}
     */
    public void setMtrEstado(MtrEstado mtrEstado) {
        this.mtrEstado = mtrEstado;
    }

    public CerNotaPedido mtrEstado(MtrEstado mtrEstado) {
        setMtrEstado(mtrEstado);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedido.mtrOrgCompra ==> MtrOrgCompra.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_org_compra_id", nullable = false)
    @ManyToOne
    public MtrOrgCompra getMtrOrgCompra() {
        return mtrOrgCompra;
    }

    /**
     * Set the {@link #mtrOrgCompra} without adding this CerNotaPedido instance on the passed {@link #mtrOrgCompra}
     */
    public void setMtrOrgCompra(MtrOrgCompra mtrOrgCompra) {
        this.mtrOrgCompra = mtrOrgCompra;
    }

    public CerNotaPedido mtrOrgCompra(MtrOrgCompra mtrOrgCompra) {
        setMtrOrgCompra(mtrOrgCompra);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedido.mtrSociedad ==> MtrSociedad.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_sociedad_id", nullable = false)
    @ManyToOne
    public MtrSociedad getMtrSociedad() {
        return mtrSociedad;
    }

    /**
     * Set the {@link #mtrSociedad} without adding this CerNotaPedido instance on the passed {@link #mtrSociedad}
     */
    public void setMtrSociedad(MtrSociedad mtrSociedad) {
        this.mtrSociedad = mtrSociedad;
    }

    public CerNotaPedido mtrSociedad(MtrSociedad mtrSociedad) {
        setMtrSociedad(mtrSociedad);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedido.mtrClaseDocumento ==> MtrClaseDocumento.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_clase_documento_id", nullable = false)
    @ManyToOne
    public MtrClaseDocumento getMtrClaseDocumento() {
        return mtrClaseDocumento;
    }

    /**
     * Set the {@link #mtrClaseDocumento} without adding this CerNotaPedido instance on the passed {@link #mtrClaseDocumento}
     */
    public void setMtrClaseDocumento(MtrClaseDocumento mtrClaseDocumento) {
        this.mtrClaseDocumento = mtrClaseDocumento;
    }

    public CerNotaPedido mtrClaseDocumento(MtrClaseDocumento mtrClaseDocumento) {
        setMtrClaseDocumento(mtrClaseDocumento);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedido.mtrMoneda ==> MtrMoneda.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_moneda_id", nullable = false)
    @ManyToOne
    public MtrMoneda getMtrMoneda() {
        return mtrMoneda;
    }

    /**
     * Set the {@link #mtrMoneda} without adding this CerNotaPedido instance on the passed {@link #mtrMoneda}
     */
    public void setMtrMoneda(MtrMoneda mtrMoneda) {
        this.mtrMoneda = mtrMoneda;
    }

    public CerNotaPedido mtrMoneda(MtrMoneda mtrMoneda) {
        setMtrMoneda(mtrMoneda);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedido.mtrCondicionPago ==> MtrCondicionPago.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_condicion_pago_id", nullable = false)
    @ManyToOne
    public MtrCondicionPago getMtrCondicionPago() {
        return mtrCondicionPago;
    }

    /**
     * Set the {@link #mtrCondicionPago} without adding this CerNotaPedido instance on the passed {@link #mtrCondicionPago}
     */
    public void setMtrCondicionPago(MtrCondicionPago mtrCondicionPago) {
        this.mtrCondicionPago = mtrCondicionPago;
    }

    public CerNotaPedido mtrCondicionPago(MtrCondicionPago mtrCondicionPago) {
        setMtrCondicionPago(mtrCondicionPago);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedido.mtrProveedor ==> MtrProveedor.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_proveedor_id", nullable = false)
    @ManyToOne
    public MtrProveedor getMtrProveedor() {
        return mtrProveedor;
    }

    /**
     * Set the {@link #mtrProveedor} without adding this CerNotaPedido instance on the passed {@link #mtrProveedor}
     */
    public void setMtrProveedor(MtrProveedor mtrProveedor) {
        this.mtrProveedor = mtrProveedor;
    }

    public CerNotaPedido mtrProveedor(MtrProveedor mtrProveedor) {
        setMtrProveedor(mtrProveedor);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CerNotaPedido withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CerNotaPedido && hashCode() == other.hashCode());
    }

    private volatile int previousHashCode = 0;

    @Override
    public int hashCode() {
        int hashCode = Objects.hashCode(getCodigoNotaPedidoSap());

        if (previousHashCode != 0 && previousHashCode != hashCode) {
            log.warning("DEVELOPER: hashCode has changed!." //
                    + "If you encounter this message you should take the time to carefuly review equals/hashCode for: " //
                    + getClass().getCanonicalName());
        }

        previousHashCode = hashCode;
        return hashCode;
    }

    /**
     * Construct a readable string representation for this CerNotaPedido instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "CerNotaPedido{" +
                "id=" + id +
                ", codigoNotaPedidoSap='" + codigoNotaPedidoSap + '\'' +
                ", userCompra='" + userCompra + '\'' +
                ", tnotasAclaratorias='" + tnotasAclaratorias + '\'' +
                ", tlugarPago='" + tlugarPago + '\'' +
                ", tformaPago='" + tformaPago + '\'' +
                ", tdocParticulares='" + tdocParticulares + '\'' +
                ", tconcepto='" + tconcepto + '\'' +
                ", plazo=" + plazo +
                ", nroPedidoOriginal='" + nroPedidoOriginal + '\'' +
                ", nroBid='" + nroBid + '\'' +
                ", monto=" + monto +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", fechaDocumento=" + fechaDocumento +
                ", fechaCierre=" + fechaCierre +
                ", fechaAcuseRecibo=" + fechaAcuseRecibo +
                ", descripcion='" + descripcion + '\'' +
                ", concepto='" + concepto + '\'' +
                ", fechaFinVigencia=" + fechaFinVigencia +
                ", emailUserCompra='" + emailUserCompra + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nombreCompletoCompra='" + nombreCompletoCompra + '\'' +
                ", mtrEstado=" + mtrEstado +
                ", mtrOrgCompra=" + mtrOrgCompra +
                ", mtrSociedad=" + mtrSociedad +
                ", mtrClaseDocumento=" + mtrClaseDocumento +
                ", mtrMoneda=" + mtrMoneda +
                ", mtrCondicionPago=" + mtrCondicionPago +
                ", mtrProveedor=" + mtrProveedor +
                ", fechaInicioIni='" + fechaInicioIni + '\'' +
                ", fechaInicioFin='" + fechaInicioFin + '\'' +
                ", fechaDocumentoIni='" + fechaDocumentoIni + '\'' +
                ", fechaDocumentoFin='" + fechaDocumentoFin + '\'' +
                ", fechaFinVigenciaIni='" + fechaFinVigenciaIni + '\'' +
                ", fechaFinVigenciaFin='" + fechaFinVigenciaFin + '\'' +
                ", previousHashCode=" + previousHashCode +
                '}';
    }
}
