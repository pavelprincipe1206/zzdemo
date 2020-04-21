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
@Table(name = "cer_nota_pedido_detalle")
//@Audited
//@AuditTable("_audi_cer_nota_pedido_detalle")
public class CerNotaPedidoDetalle extends BaseDomain implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CerNotaPedidoDetalle.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Integer id;
    private String posicionSap;
    private BigDecimal precioUnitario;
    private BigDecimal cantidadRequerida;
    private BigDecimal cantidadEntregada;
    private String cerCuentaMayor;
    private Date fechaEntrega;
    private Integer idPadre;
    private String auxiliar;
    private String ebeln;
    private String extrow;
    private String textoItem;
    private String unidadTextoItem;
    private String introw;
    private String plazoEntrega;
    private Date nuevaFechaEntrega;

    // Many to one
    private MtrCuentaImputacion mtrCuentaImputacion;
    private MtrBienServicio mtrBienServicio;
    private CerNotaPedido cerNotaPedido;
    private MtrCentroAlmacen mtrCentro;
    private MtrCentroAlmacen mtrAlmacen;
    private MtrCuentaMayor mtrCuentaMayor;
    private MtrUnidadMedida mtrUnidadMedida;

    @Override
    public String entityClassName() {
        return CerNotaPedidoDetalle.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "cer_nota_pedido_detalle_id", precision = 10)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_cer_nota_pedido_detalle")
    @Id
    @SequenceGenerator(name = "seq_cer_nota_pedido_detalle", sequenceName = "seq_cer_nota_pedido_detalle", allocationSize = 1)
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public CerNotaPedidoDetalle id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [posicionSap] ------------------------

    @NotEmpty(message = "{message.cerNotaPedidoDetalle.posicionSap.requerido}")
    @Size(max = 20, message = "{message.cerNotaPedidoDetalle.posicionSap.sizeMax} {max} {message.caracter}")
    @Column(name = "posicion_sap", nullable = false, length = 20)
    public String getPosicionSap() {
        return posicionSap;
    }

    public void setPosicionSap(String posicionSap) {
        this.posicionSap = posicionSap;
    }

    public CerNotaPedidoDetalle posicionSap(String posicionSap) {
        setPosicionSap(posicionSap);
        return this;
    }
    // -- [precioUnitario] ------------------------

    @Digits(integer = 17, fraction = 2)
    @NotNull
    @Column(name = "precio_unitario", nullable = false, precision = 19, scale = 2)
    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public CerNotaPedidoDetalle precioUnitario(BigDecimal precioUnitario) {
        setPrecioUnitario(precioUnitario);
        return this;
    }
    // -- [cantidadRequerida] ------------------------

    @Digits(integer = 15, fraction = 4)
    @NotNull
    @Column(name = "cantidad_requerida", nullable = false, precision = 19, scale = 4)
    public BigDecimal getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void setCantidadRequerida(BigDecimal cantidadRequerida) {
        this.cantidadRequerida = cantidadRequerida;
    }

    public CerNotaPedidoDetalle cantidadRequerida(BigDecimal cantidadRequerida) {
        setCantidadRequerida(cantidadRequerida);
        return this;
    }
    // -- [cantidadEntregada] ------------------------

    @Digits(integer = 15, fraction = 4)
    @Column(name = "cantidad_entregada", precision = 19, scale = 4)
    public BigDecimal getCantidadEntregada() {
        return cantidadEntregada;
    }

    public void setCantidadEntregada(BigDecimal cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
    }

    public CerNotaPedidoDetalle cantidadEntregada(BigDecimal cantidadEntregada) {
        setCantidadEntregada(cantidadEntregada);
        return this;
    }
    // -- [cerCuentaMayor] ------------------------

    @Size(max = 100, message = "{message.cerNotaPedidoDetalle.cerCuentaMayor.sizeMax} {max} {message.caracter}")
    @Column(name = "cer_cuenta_mayor", length = 100)
    public String getCerCuentaMayor() {
        return cerCuentaMayor;
    }

    public void setCerCuentaMayor(String cerCuentaMayor) {
        this.cerCuentaMayor = cerCuentaMayor;
    }

    public CerNotaPedidoDetalle cerCuentaMayor(String cerCuentaMayor) {
        setCerCuentaMayor(cerCuentaMayor);
        return this;
    }
    // -- [fechaEntrega] ------------------------

    @Column(name = "fecha_entrega", length = 22)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public CerNotaPedidoDetalle fechaEntrega(Date fechaEntrega) {
        setFechaEntrega(fechaEntrega);
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

    public CerNotaPedidoDetalle idPadre(Integer idPadre) {
        setIdPadre(idPadre);
        return this;
    }
    // -- [auxiliar] ------------------------

    @Size(max = 100, message = "{message.cerNotaPedidoDetalle.auxiliar.sizeMax} {max} {message.caracter}")
    @Column(name = "auxiliar", length = 100)
    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }

    public CerNotaPedidoDetalle auxiliar(String auxiliar) {
        setAuxiliar(auxiliar);
        return this;
    }
    // -- [ebeln] ------------------------

    @Size(max = 20, message = "{message.cerNotaPedidoDetalle.ebeln.sizeMax} {max} {message.caracter}")
    @Column(name = "ebeln", length = 20)
    public String getEbeln() {
        return ebeln;
    }

    public void setEbeln(String ebeln) {
        this.ebeln = ebeln;
    }

    public CerNotaPedidoDetalle ebeln(String ebeln) {
        setEbeln(ebeln);
        return this;
    }
    // -- [extrow] ------------------------

    @Size(max = 10, message = "{message.cerNotaPedidoDetalle.extrow.sizeMax} {max} {message.caracter}")
    @Column(name = "extrow", length = 10)
    public String getExtrow() {
        return extrow;
    }

    public void setExtrow(String extrow) {
        this.extrow = extrow;
    }

    public CerNotaPedidoDetalle extrow(String extrow) {
        setExtrow(extrow);
        return this;
    }
    // -- [textoItem] ------------------------

    @Size(max = 100, message = "{message.cerNotaPedidoDetalle.textoItem.sizeMax} {max} {message.caracter}")
    @Column(name = "texto_item", length = 100)
    public String getTextoItem() {
        return textoItem;
    }

    public void setTextoItem(String textoItem) {
        this.textoItem = textoItem;
    }

    public CerNotaPedidoDetalle textoItem(String textoItem) {
        setTextoItem(textoItem);
        return this;
    }
    // -- [unidadTextoItem] ------------------------

    @Size(max = 10, message = "{message.cerNotaPedidoDetalle.unidadTextoItem.sizeMax} {max} {message.caracter}")
    @Column(name = "unidad_texto_item", length = 10)
    public String getUnidadTextoItem() {
        return unidadTextoItem;
    }

    public void setUnidadTextoItem(String unidadTextoItem) {
        this.unidadTextoItem = unidadTextoItem;
    }

    public CerNotaPedidoDetalle unidadTextoItem(String unidadTextoItem) {
        setUnidadTextoItem(unidadTextoItem);
        return this;
    }
    // -- [introw] ------------------------

    @Size(max = 10, message = "{message.cerNotaPedidoDetalle.introw.sizeMax} {max} {message.caracter}")
    @Column(name = "introw", length = 10)
    public String getIntrow() {
        return introw;
    }

    public void setIntrow(String introw) {
        this.introw = introw;
    }

    public CerNotaPedidoDetalle introw(String introw) {
        setIntrow(introw);
        return this;
    }
    // -- [plazoEntrega] ------------------------

    @Size(max = 3, message = "{message.cerNotaPedidoDetalle.plazoEntrega.sizeMax} {max} {message.caracter}")
    @Column(name = "plazo_entrega", length = 3)
    public String getPlazoEntrega() {
        return plazoEntrega;
    }

    public void setPlazoEntrega(String plazoEntrega) {
        this.plazoEntrega = plazoEntrega;
    }

    public CerNotaPedidoDetalle plazoEntrega(String plazoEntrega) {
        setPlazoEntrega(plazoEntrega);
        return this;
    }
    // -- [nuevaFechaEntrega] ------------------------

    @Column(name = "nueva_fecha_entrega", length = 29)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getNuevaFechaEntrega() {
        return nuevaFechaEntrega;
    }

    public void setNuevaFechaEntrega(Date nuevaFechaEntrega) {
        this.nuevaFechaEntrega = nuevaFechaEntrega;
    }

    public CerNotaPedidoDetalle nuevaFechaEntrega(Date nuevaFechaEntrega) {
        setNuevaFechaEntrega(nuevaFechaEntrega);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedidoDetalle.mtrCuentaImputacion ==> MtrCuentaImputacion.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_cuenta_imputacion_id")
    @ManyToOne
    public MtrCuentaImputacion getMtrCuentaImputacion() {
        return mtrCuentaImputacion;
    }

    /**
     * Set the {@link #mtrCuentaImputacion} without adding this CerNotaPedidoDetalle instance on the passed {@link #mtrCuentaImputacion}
     */
    public void setMtrCuentaImputacion(MtrCuentaImputacion mtrCuentaImputacion) {
        this.mtrCuentaImputacion = mtrCuentaImputacion;
    }

    public CerNotaPedidoDetalle mtrCuentaImputacion(MtrCuentaImputacion mtrCuentaImputacion) {
        setMtrCuentaImputacion(mtrCuentaImputacion);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedidoDetalle.mtrBienServicio ==> MtrBienServicio.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_bien_servicio_id")
    @ManyToOne
    public MtrBienServicio getMtrBienServicio() {
        return mtrBienServicio;
    }

    /**
     * Set the {@link #mtrBienServicio} without adding this CerNotaPedidoDetalle instance on the passed {@link #mtrBienServicio}
     */
    public void setMtrBienServicio(MtrBienServicio mtrBienServicio) {
        this.mtrBienServicio = mtrBienServicio;
    }

    public CerNotaPedidoDetalle mtrBienServicio(MtrBienServicio mtrBienServicio) {
        setMtrBienServicio(mtrBienServicio);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedidoDetalle.cerNotaPedido ==> CerNotaPedido.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "cer_nota_pedido_id", nullable = false)
    @ManyToOne
    public CerNotaPedido getCerNotaPedido() {
        return cerNotaPedido;
    }

    /**
     * Set the {@link #cerNotaPedido} without adding this CerNotaPedidoDetalle instance on the passed {@link #cerNotaPedido}
     */
    public void setCerNotaPedido(CerNotaPedido cerNotaPedido) {
        this.cerNotaPedido = cerNotaPedido;
    }

    public CerNotaPedidoDetalle cerNotaPedido(CerNotaPedido cerNotaPedido) {
        setCerNotaPedido(cerNotaPedido);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedidoDetalle.mtrCentro ==> MtrCentroAlmacen.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_centro_id")
    @ManyToOne
    public MtrCentroAlmacen getMtrCentro() {
        return mtrCentro;
    }

    /**
     * Set the {@link #mtrCentro} without adding this CerNotaPedidoDetalle instance on the passed {@link #mtrCentro}
     */
    public void setMtrCentro(MtrCentroAlmacen mtrCentro) {
        this.mtrCentro = mtrCentro;
    }

    public CerNotaPedidoDetalle mtrCentro(MtrCentroAlmacen mtrCentro) {
        setMtrCentro(mtrCentro);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedidoDetalle.mtrAlmacen ==> MtrCentroAlmacen.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_almacen_id")
    @ManyToOne
    public MtrCentroAlmacen getMtrAlmacen() {
        return mtrAlmacen;
    }

    /**
     * Set the {@link #mtrAlmacen} without adding this CerNotaPedidoDetalle instance on the passed {@link #mtrAlmacen}
     */
    public void setMtrAlmacen(MtrCentroAlmacen mtrAlmacen) {
        this.mtrAlmacen = mtrAlmacen;
    }

    public CerNotaPedidoDetalle mtrAlmacen(MtrCentroAlmacen mtrAlmacen) {
        setMtrAlmacen(mtrAlmacen);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CerNotaPedidoDetalle.mtrCuentaMayor ==> MtrCuentaMayor.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_cuenta_mayor_id")
    @ManyToOne
    public MtrCuentaMayor getMtrCuentaMayor() {
        return mtrCuentaMayor;
    }

    /**
     * Set the {@link #mtrCuentaMayor} without adding this CerNotaPedidoDetalle instance on the passed {@link #mtrCuentaMayor}
     */
    public void setMtrCuentaMayor(MtrCuentaMayor mtrCuentaMayor) {
        this.mtrCuentaMayor = mtrCuentaMayor;
    }

    public CerNotaPedidoDetalle mtrCuentaMayor(MtrCuentaMayor mtrCuentaMayor) {
        setMtrCuentaMayor(mtrCuentaMayor);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: MtrBienServicio.mtrUnidadMedida ==> MtrUnidadMedida.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "mtr_unidad_medida_id", nullable = true)
    @ManyToOne
    public MtrUnidadMedida getMtrUnidadMedida() {
        return mtrUnidadMedida;
    }

    /**
     * Set the {@link #mtrUnidadMedida} without adding this MtrBienServicio instance on the passed {@link #mtrUnidadMedida}
     */
    public void setMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        this.mtrUnidadMedida = mtrUnidadMedida;
    }

    public CerNotaPedidoDetalle mtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        setMtrUnidadMedida(mtrUnidadMedida);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CerNotaPedidoDetalle withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CerNotaPedidoDetalle && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this CerNotaPedidoDetalle instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "CerNotaPedidoDetalle{" +
                "id=" + id +
                ", posicionSap='" + posicionSap + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidadRequerida=" + cantidadRequerida +
                ", cantidadEntregada=" + cantidadEntregada +
                ", cerCuentaMayor='" + cerCuentaMayor + '\'' +
                ", fechaEntrega=" + fechaEntrega +
                ", idPadre=" + idPadre +
                ", auxiliar='" + auxiliar + '\'' +
                ", ebeln='" + ebeln + '\'' +
                ", extrow='" + extrow + '\'' +
                ", textoItem='" + textoItem + '\'' +
                ", unidadTextoItem='" + unidadTextoItem + '\'' +
                ", introw='" + introw + '\'' +
                ", plazoEntrega='" + plazoEntrega + '\'' +
                ", nuevaFechaEntrega=" + nuevaFechaEntrega +
                ", mtrCuentaImputacion=" + mtrCuentaImputacion +
                ", mtrBienServicio=" + mtrBienServicio +
                ", cerNotaPedido=" + cerNotaPedido +
                ", mtrCentro=" + mtrCentro +
                ", mtrAlmacen=" + mtrAlmacen +
                ", mtrCuentaMayor=" + mtrCuentaMayor +
                ", mtrUnidadMedida=" + mtrUnidadMedida +
                ", identifiableHashBuilder=" + identifiableHashBuilder +
                '}';
    }
}
