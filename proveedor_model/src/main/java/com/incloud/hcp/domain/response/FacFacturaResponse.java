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
import java.util.Date;
import java.util.List;

/**
 * Simple Interface for FacFactura.
 */
@Data
@ToString
@EqualsAndHashCode
public class FacFacturaResponse extends BaseResponseDomain<FacFactura> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String serieFacturaCondicion;
    private String numeroFacturaCondicion;
    private String tipoFacturaCondicion;
    private String tipoComprobanteFacturaCondicion;
    private String montoCondicion;
    private String montoOtrosCargosCondicion;
    private String montoIgvCondicion;
    private String montoFinalCondicion;
    private String glosaCondicion;
    private String fechaFacturaCondicion;
    private String fechaEmisionCondicion;
    private String fechaCreacionCondicion;
    private String existeContratoCondicion;
    private String estadoRetornoSunatCondicion;
    private String detalleServicioCondicion;
    private String indicadorConCertificadoCondicion;
    private String conceptoCondicion;
    private String codigoCorrelativoAdjuntoCondicion;
    private String estadoCondicion;
    private String fechaEstimadaPagoCondicion;
    private String fechaPagoCondicion;
    private String fechaAprobacionCondicion;
    //private String mtrEstadoCondicion;
    //private String mtrMonedaCondicion;
    //private String mtrDetraccionCondicion;
    //private String mtrProveedorCondicion;
    //private String facContactoCondicion;
    //private String mtrSociedadCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Integer> idList;
    private List<String> serieFacturaList;
    private List<String> numeroFacturaList;
    private List<String> tipoFacturaList;
    private List<String> tipoComprobanteFacturaList;
    private List<BigDecimal> montoList;
    private List<BigDecimal> montoOtrosCargosList;
    private List<BigDecimal> montoIgvList;
    private List<BigDecimal> montoFinalList;
    private List<String> glosaList;
    private List<Date> fechaFacturaList;
    private List<Date> fechaEmisionList;
    private List<Date> fechaCreacionList;
    private List<String> existeContratoList;
    private List<String> estadoRetornoSunatList;
    private List<String> detalleServicioList;
    private List<String> indicadorConCertificadoList;
    private List<String> conceptoList;
    private List<String> codigoCorrelativoAdjuntoList;
    private List<String> estadoList;
    private List<Date> fechaEstimadaPagoList;
    private List<Date> fechaPagoList;
    private List<Date> fechaAprobacionList;
    private List<MtrEstado> mtrEstadoList;
    private List<MtrMoneda> mtrMonedaList;
    private List<MtrDetraccion> mtrDetraccionList;
    private List<MtrProveedor> mtrProveedorList;
    private List<FacContacto> facContactoList;
    private List<MtrSociedad> mtrSociedadList;

}
