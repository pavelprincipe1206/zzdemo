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
@Table(name = "cer_certificado")
//@Audited
//@AuditTable("_audi_cer_certificado")
public class CerCertificado extends BaseDomain implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CerCertificado.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Integer id;
    private String codigoCertificado;
    private String concepto;
    private String descuentoh;
    private Date fechaAprobacion;
    private Date fechaContabDocument;
    private Date fechaDesde;
    private Date fechaHasta;
    private String grupoCompras;
    private String hojaServicio;
    private String lugarPrestServ;
    private BigDecimal monto;
    private BigDecimal montoTotal;
    private BigDecimal montoTotalAdjustado;
    private String notasRechazo;
    private String observacion;
    private Integer ocurrencia;
    private String respoExterno;
    private String solicitante;
    private String indCreacionAutomatica;

    private Date fechaContabilizacion;
    private String nroGuiaRemision;

    // Many to one
    private CerNotaPedido cerNotaPedido;
    private MtrProveedor mtrProveedor;
    private MtrSociedad mtrSociedad;
    private MtrMoneda mtrMoneda;
    private MtrClaseDocumento mtrClaseDocumento;
    private MtrEstado mtrEstado;
    private String indTieneFactura;

    private MtrCentroAlmacen mtrCentro;
    private MtrCentroAlmacen mtrAlmacen;


    //Transient
    private String fechaCreacion;
    private String fechaCreacionDesde;
    private String fechaCreacionHasta;
    private String fechaDesdeIni;
    private String fechaDesdeFin;
    private String nroDocumentoSap;

    @Transient
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Transient
    public String getFechaCreacionDesde() {
        return fechaCreacionDesde;
    }

    public void setFechaCreacionDesde(String fechaCreacionDesde) {
        this.fechaCreacionDesde = fechaCreacionDesde;
    }

    @Transient
    public String getFechaCreacionHasta() {
        return fechaCreacionHasta;
    }

    public void setFechaCreacionHasta(String fechaCreacionHasta) {
        this.fechaCreacionHasta = fechaCreacionHasta;
    }

    @Transient
    public String getFechaDesdeIni() {
        return fechaDesdeIni;
    }

    public void setFechaDesdeIni(String fechaDesdeIni) {
        this.fechaDesdeIni = fechaDesdeIni;
    }

    @Transient
    public String getFechaDesdeFin() {
        return fechaDesdeFin;
    }

    public void setFechaDesdeFin(String fechaDesdeFin) {
        this.fechaDesdeFin = fechaDesdeFin;
    }

    @Transient
    public String getNroDocumentoSap() {
        return nroDocumentoSap;
    }

    public void setNroDocumentoSap(String nroDocumentoSap) {
        this.nroDocumentoSap = nroDocumentoSap;
    }

    @Override
    public String entityClassName() {
        return CerCertificado.class.getSimpleName();
    }



    // -- [id] ------------------------

    @Override
    @Column(name = "cer_certificado_id", precision = 10)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_cer_certificado")
    @Id
    @SequenceGenerator(name = "seq_cer_certificado", sequenceName = "seq_cer_certificado", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public CerCertificado id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [codigoCertificado] ------------------------

    @Size(max = 30, message = "{message.cerCertificado.codigoCertificado.sizeMax} {max} {message.caracter}")
    @Column(name = "codigo_certificado", length = 30)
    public String getCodigoCertificado() {
        return codigoCertificado;
    }

    public void setCodigoCertificado(String codigoCertificado) {
        this.codigoCertificado = codigoCertificado;
    }

    public CerCertificado codigoCertificado(String codigoCertificado) {
        setCodigoCertificado(codigoCertificado);
        return this;
    }
    // -- [concepto] ------------------------

    @Size(max = 4000, message = "{message.cerCertificado.concepto.sizeMax} {max} {message.caracter}")
    @Column(name = "concepto")
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public CerCertificado concepto(String concepto) {
        setConcepto(concepto);
        return this;
    }
    // -- [descuentoh] ------------------------

    @Size(max = 100, message = "{message.cerCertificado.descuentoh.sizeMax} {max} {message.caracter}")
    @Column(name = "descuentoh", length = 100)
    public String getDescuentoh() {
        return descuentoh;
    }

    public void setDescuentoh(String descuentoh) {
        this.descuentoh = descuentoh;
    }

    public CerCertificado descuentoh(String descuentoh) {
        setDescuentoh(descuentoh);
        return this;
    }
    // -- [fechaAprobacion] ------------------------

    @Column(name = "fecha_aprobacion", length = 22)
    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public CerCertificado fechaAprobacion(Date fechaAprobacion) {
        setFechaAprobacion(fechaAprobacion);
        return this;
    }
    // -- [fechaContabDocument] ------------------------

    @Column(name = "fecha_contab_document", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaContabDocument() {
        return fechaContabDocument;
    }

    public void setFechaContabDocument(Date fechaContabDocument) {
        this.fechaContabDocument = fechaContabDocument;
    }

    public CerCertificado fechaContabDocument(Date fechaContabDocument) {
        setFechaContabDocument(fechaContabDocument);
        return this;
    }
    // -- [fechaDesde] ------------------------

    @Column(name = "fecha_desde", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public CerCertificado fechaDesde(Date fechaDesde) {
        setFechaDesde(fechaDesde);
        return this;
    }
    // -- [fechaHasta] ------------------------

    @Column(name = "fecha_hasta", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public CerCertificado fechaHasta(Date fechaHasta) {
        setFechaHasta(fechaHasta);
        return this;
    }
    // -- [grupoCompras] ------------------------

    @Size(max = 100, message = "{message.cerCertificado.grupoCompras.sizeMax} {max} {message.caracter}")
    @Column(name = "grupo_compras", length = 100)
    public String getGrupoCompras() {
        return grupoCompras;
    }

    public void setGrupoCompras(String grupoCompras) {
        this.grupoCompras = grupoCompras;
    }

    public CerCertificado grupoCompras(String grupoCompras) {
        setGrupoCompras(grupoCompras);
        return this;
    }
    // -- [hojaServicio] ------------------------

    @Size(max = 1000, message = "{message.cerCertificado.hojaServicio.sizeMax} {max} {message.caracter}")
    @Column(name = "hoja_servicio", length = 1000)
    public String getHojaServicio() {
        return hojaServicio;
    }

    public void setHojaServicio(String hojaServicio) {
        this.hojaServicio = hojaServicio;
    }

    public CerCertificado hojaServicio(String hojaServicio) {
        setHojaServicio(hojaServicio);
        return this;
    }
    // -- [lugarPrestServ] ------------------------

    @Size(max = 100, message = "{message.cerCertificado.lugarPrestServ.sizeMax} {max} {message.caracter}")
    @Column(name = "lugar_prest_serv", length = 100)
    public String getLugarPrestServ() {
        return lugarPrestServ;
    }

    public void setLugarPrestServ(String lugarPrestServ) {
        this.lugarPrestServ = lugarPrestServ;
    }

    public CerCertificado lugarPrestServ(String lugarPrestServ) {
        setLugarPrestServ(lugarPrestServ);
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

    public CerCertificado monto(BigDecimal monto) {
        setMonto(monto);
        return this;
    }
    // -- [montoTotal] ------------------------

    @Digits(integer = 17, fraction = 2)
    @Column(name = "monto_total", precision = 19, scale = 2)
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public CerCertificado montoTotal(BigDecimal montoTotal) {
        setMontoTotal(montoTotal);
        return this;
    }
    // -- [montoTotalAdjustado] ------------------------

    @Digits(integer = 17, fraction = 2)
    @Column(name = "monto_total_adjustado", precision = 19, scale = 2)
    public BigDecimal getMontoTotalAdjustado() {
        return montoTotalAdjustado;
    }

    public void setMontoTotalAdjustado(BigDecimal montoTotalAdjustado) {
        this.montoTotalAdjustado = montoTotalAdjustado;
    }

    public CerCertificado montoTotalAdjustado(BigDecimal montoTotalAdjustado) {
        setMontoTotalAdjustado(montoTotalAdjustado);
        return this;
    }
    // -- [notasRechazo] ------------------------

    @Size(max = 20, message = "{message.cerCertificado.notasRechazo.sizeMax} {max} {message.caracter}")
    @Column(name = "notas_rechazo", length = 20)
    public String getNotasRechazo() {
        return notasRechazo;
    }

    public void setNotasRechazo(String notasRechazo) {
        this.notasRechazo = notasRechazo;
    }

    public CerCertificado notasRechazo(String notasRechazo) {
        setNotasRechazo(notasRechazo);
        return this;
    }

    // -- [observacion] ------------------------

    @Size(max = 255, message = "{message.cerCertificado.observacion.sizeMax} {max} {message.caracter}")
    @Column(name = "observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public CerCertificado observacion(String observacion) {
        setObservacion(observacion);
        return this;
    }
    // -- [ocurrencia] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "ocurrencia", precision = 10)
    public Integer getOcurrencia() {
        return ocurrencia;
    }

    public void setOcurrencia(Integer ocurrencia) {
        this.ocurrencia = ocurrencia;
    }

    public CerCertificado ocurrencia(Integer ocurrencia) {
        setOcurrencia(ocurrencia);
        return this;
    }
    // -- [respoExterno] ------------------------

    @Size(max = 40, message = "{message.cerCertificado.respoExterno.sizeMax} {max} {message.caracter}")
    @Column(name = "respo_externo", length = 40)
    public String getRespoExterno() {
        return respoExterno;
    }

    public void setRespoExterno(String respoExterno) {
        this.respoExterno = respoExterno;
    }

    public CerCertificado respoExterno(String respoExterno) {
        setRespoExterno(respoExterno);
        return this;
    }
    // -- [solicitante] ------------------------

    @Size(max = 100, message = "{message.cerCertificado.solicitante.sizeMax} {max} {message.caracter}")
    @Column(name = "solicitante", length = 100)
    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public CerCertificado solicitante(String solicitante) {
        setSolicitante(solicitante);
        return this;
    }

    // -- [indTieneFactura] ------------------------

    @Size(max = 1, message = "{message.cerCertificado.indTieneFactura.sizeMax} {max} {message.caracter}")
    @Column(name = "ind_tiene_factura", length = 1)
    public String getIndTieneFactura() {
        return indTieneFactura;
    }

    public void setIndTieneFactura(String indTieneFactura) {
        this.indTieneFactura = indTieneFactura;
    }

    public CerCertificado indTieneFactura(String indTieneFactura) {
        setIndTieneFactura(indTieneFactura);
        return this;
    }

    // -- [indCreacionAutomatica] ------------------------

    @Size(max = 1, message = "{message.cerCertificado.indCreacionAutomatica.sizeMax} {max} {message.caracter}")
    @Column(name = "ind_creacion_automatica", length = 1)
    public String getIndCreacionAutomatica() {
        return indCreacionAutomatica;
    }

    public void setIndCreacionAutomatica(String indCreacionAutomatica) {
        this.indCreacionAutomatica = indCreacionAutomatica;
    }

    public CerCertificado indCreacionAutomatica(String indCreacionAutomatica) {
        setIndCreacionAutomatica(indCreacionAutomatica);
        return this;
    }

    // -- [fechaContabilizacion] ------------------------

    @Column(name = "fecha_contabilizacion", length = 29)
    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaContabilizacion() {
        return fechaContabilizacion;
    }

    public void setFechaContabilizacion(Date fechaContabilizacion) {
        this.fechaContabilizacion = fechaContabilizacion;
    }

    public CerCertificado fechaContabilizacion(Date fechaContabilizacion) {
        setFechaContabilizacion(fechaContabilizacion);
        return this;
    }
    // -- [nroGuiaRemision] ------------------------

    @Size(max = 25, message = "{message.cerCertificado.nroGuiaRemision.sizeMax} {max} {message.caracter}")
    @Column(name = "nro_guia_remision", length = 25)
    public String getNroGuiaRemision() {
        return nroGuiaRemision;
    }

    public void setNroGuiaRemision(String nroGuiaRemision) {
        this.nroGuiaRemision = nroGuiaRemision;
    }

    public CerCertificado nroGuiaRemision(String nroGuiaRemision) {
        setNroGuiaRemision(nroGuiaRemision);
        return this;
    }


    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.cerNotaPedido ==> CerNotaPedido.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "cer_nota_pedido_id", nullable = false)
    @ManyToOne
    public CerNotaPedido getCerNotaPedido() {
        return cerNotaPedido;
    }

    /**
     * Set the {@link #cerNotaPedido} without adding this CerCertificado instance on the passed {@link #cerNotaPedido}
     */
    public void setCerNotaPedido(CerNotaPedido cerNotaPedido) {
        this.cerNotaPedido = cerNotaPedido;
    }

    public CerCertificado cerNotaPedido(CerNotaPedido cerNotaPedido) {
        setCerNotaPedido(cerNotaPedido);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.mtrProveedor ==> MtrProveedor.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_proveedor_id", nullable = false)
    @ManyToOne
    public MtrProveedor getMtrProveedor() {
        return mtrProveedor;
    }

    /**
     * Set the {@link #mtrProveedor} without adding this CerCertificado instance on the passed {@link #mtrProveedor}
     */
    public void setMtrProveedor(MtrProveedor mtrProveedor) {
        this.mtrProveedor = mtrProveedor;
    }

    public CerCertificado mtrProveedor(MtrProveedor mtrProveedor) {
        setMtrProveedor(mtrProveedor);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.mtrSociedad ==> MtrSociedad.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_sociedad_id", nullable = false)
    @ManyToOne
    public MtrSociedad getMtrSociedad() {
        return mtrSociedad;
    }

    /**
     * Set the {@link #mtrSociedad} without adding this CerCertificado instance on the passed {@link #mtrSociedad}
     */
    public void setMtrSociedad(MtrSociedad mtrSociedad) {
        this.mtrSociedad = mtrSociedad;
    }

    public CerCertificado mtrSociedad(MtrSociedad mtrSociedad) {
        setMtrSociedad(mtrSociedad);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.mtrMoneda ==> MtrMoneda.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_moneda_id", nullable = false)
    @ManyToOne
    public MtrMoneda getMtrMoneda() {
        return mtrMoneda;
    }

    /**
     * Set the {@link #mtrMoneda} without adding this CerCertificado instance on the passed {@link #mtrMoneda}
     */
    public void setMtrMoneda(MtrMoneda mtrMoneda) {
        this.mtrMoneda = mtrMoneda;
    }

    public CerCertificado mtrMoneda(MtrMoneda mtrMoneda) {
        setMtrMoneda(mtrMoneda);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.mtrClaseDocumento ==> MtrClaseDocumento.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_clase_documento_id", nullable = false)
    @ManyToOne
    public MtrClaseDocumento getMtrClaseDocumento() {
        return mtrClaseDocumento;
    }

    /**
     * Set the {@link #mtrClaseDocumento} without adding this CerCertificado instance on the passed {@link #mtrClaseDocumento}
     */
    public void setMtrClaseDocumento(MtrClaseDocumento mtrClaseDocumento) {
        this.mtrClaseDocumento = mtrClaseDocumento;
    }

    public CerCertificado mtrClaseDocumento(MtrClaseDocumento mtrClaseDocumento) {
        setMtrClaseDocumento(mtrClaseDocumento);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.mtrEstado ==> MtrEstado.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "mtr_estado_id", nullable = false)
    @ManyToOne
    public MtrEstado getMtrEstado() {
        return mtrEstado;
    }

    /**
     * Set the {@link #mtrEstado} without adding this CerCertificado instance on the passed {@link #mtrEstado}
     */
    public void setMtrEstado(MtrEstado mtrEstado) {
        this.mtrEstado = mtrEstado;
    }

    public CerCertificado mtrEstado(MtrEstado mtrEstado) {
        setMtrEstado(mtrEstado);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.mtrCentro ==> MtrCentroAlmacen.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_centro_id")
    @ManyToOne
    public MtrCentroAlmacen getMtrCentro() {
        return mtrCentro;
    }

    /**
     * Set the {@link #mtrCentro} without adding this CerCertificado instance on the passed {@link #mtrCentro}
     */
    public void setMtrCentro(MtrCentroAlmacen mtrCentro) {
        this.mtrCentro = mtrCentro;
    }

    public CerCertificado mtrCentro(MtrCentroAlmacen mtrCentro) {
        setMtrCentro(mtrCentro);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerCertificado.mtrAlmacen ==> MtrCentroAlmacen.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_almacen_id")
    @ManyToOne
    public MtrCentroAlmacen getMtrAlmacen() {
        return mtrAlmacen;
    }

    /**
     * Set the {@link #mtrAlmacen} without adding this CerCertificado instance on the passed {@link #mtrAlmacen}
     */
    public void setMtrAlmacen(MtrCentroAlmacen mtrAlmacen) {
        this.mtrAlmacen = mtrAlmacen;
    }

    public CerCertificado mtrAlmacen(MtrCentroAlmacen mtrAlmacen) {
        setMtrAlmacen(mtrAlmacen);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CerCertificado withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CerCertificado && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    @Override
    public String toString() {
        return "CerCertificado{" +
                "id=" + id +
                ", codigoCertificado='" + codigoCertificado + '\'' +
                ", concepto='" + concepto + '\'' +
                ", descuentoh='" + descuentoh + '\'' +
                ", fechaAprobacion=" + fechaAprobacion +
                ", fechaContabDocument=" + fechaContabDocument +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", grupoCompras='" + grupoCompras + '\'' +
                ", hojaServicio='" + hojaServicio + '\'' +
                ", lugarPrestServ='" + lugarPrestServ + '\'' +
                ", monto=" + monto +
                ", montoTotal=" + montoTotal +
                ", montoTotalAdjustado=" + montoTotalAdjustado +
                ", notasRechazo='" + notasRechazo + '\'' +
                ", observacion='" + observacion + '\'' +
                ", ocurrencia=" + ocurrencia +
                ", respoExterno='" + respoExterno + '\'' +
                ", solicitante='" + solicitante + '\'' +
                ", indCreacionAutomatica='" + indCreacionAutomatica + '\'' +
                ", fechaContabilizacion=" + fechaContabilizacion +
                ", nroGuiaRemision='" + nroGuiaRemision + '\'' +
                ", cerNotaPedido=" + cerNotaPedido +
                ", mtrProveedor=" + mtrProveedor +
                ", mtrSociedad=" + mtrSociedad +
                ", mtrMoneda=" + mtrMoneda +
                ", mtrClaseDocumento=" + mtrClaseDocumento +
                ", mtrEstado=" + mtrEstado +
                ", indTieneFactura='" + indTieneFactura + '\'' +
                ", mtrCentro=" + mtrCentro +
                ", mtrAlmacen=" + mtrAlmacen +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", fechaCreacionDesde='" + fechaCreacionDesde + '\'' +
                ", fechaCreacionHasta='" + fechaCreacionHasta + '\'' +
                ", fechaDesdeIni='" + fechaDesdeIni + '\'' +
                ", fechaDesdeFin='" + fechaDesdeFin + '\'' +
                ", identifiableHashBuilder=" + identifiableHashBuilder +
                '}';
    }
}
