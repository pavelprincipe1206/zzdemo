/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/EntityResponse.java.e.vm
 */
package com.incloud.hcp.domain.response;

import com.incloud.hcp.domain.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * Simple Interface for CerCertificadoDetalle.
 */
@Data
@ToString
@EqualsAndHashCode
public class CerCertificadoDetalleResponse extends BaseResponseDomain<CerCertificadoDetalle> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String subpacknoCondicion;
    private String rangoCondicion;
    private String numOrdenCondicion;
    private String nivelEstructuraCondicion;
    private String indicadorItemAdiciCondicion;
    private String ctaContableCondicion;
    private String precioUnitarioCondicion;
    private String descuentoCondicion;
    private String cantidadTotalCondicion;
    private String cantidadPendienteCondicion;
    private String cantidadAprobadaCondicion;
    private String totalLineaCondicion;
    private String totalLineaAjustadoCondicion;
    private String asignServicioCondicion;
    private String auxiliarCondicion;
    //private String mtrCuentaMayorCondicion;
    //private String mtrCuentaImputacionCondicion;
    //private String cerNotaPedidoDetalleCondicion;
    //private String cerCertificadoCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Integer> idList;
    private List<String> subpacknoList;
    private List<String> rangoList;
    private List<String> numOrdenList;
    private List<String> nivelEstructuraList;
    private List<String> indicadorItemAdiciList;
    private List<String> ctaContableList;
    private List<BigDecimal> precioUnitarioList;
    private List<BigDecimal> descuentoList;
    private List<BigDecimal> cantidadTotalList;
    private List<BigDecimal> cantidadPendienteList;
    private List<BigDecimal> cantidadAprobadaList;
    private List<BigDecimal> totalLineaList;
    private List<BigDecimal> totalLineaAjustadoList;
    private List<String> asignServicioList;
    private List<String> auxiliarList;
    private List<MtrCuentaMayor> mtrCuentaMayorList;
    private List<MtrCuentaImputacion> mtrCuentaImputacionList;
    private List<CerNotaPedidoDetalle> cerNotaPedidoDetalleList;
    private List<CerCertificado> cerCertificadoList;

}