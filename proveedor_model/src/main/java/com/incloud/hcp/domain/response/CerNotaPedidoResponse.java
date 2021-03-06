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
 * Simple Interface for CerNotaPedido.
 */
@Data
@ToString
@EqualsAndHashCode
public class CerNotaPedidoResponse extends BaseResponseDomain<CerNotaPedido> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String codigoNotaPedidoSapCondicion;
    private String userCompraCondicion;
    private String tnotasAclaratoriasCondicion;
    private String tlugarPagoCondicion;
    private String tformaPagoCondicion;
    private String tdocParticularesCondicion;
    private String tconceptoCondicion;
    private String plazoCondicion;
    private String nroPedidoOriginalCondicion;
    private String nroBidCondicion;
    private String montoCondicion;
    private String fechaInicioCondicion;
    private String fechaFinCondicion;
    private String fechaDocumentoCondicion;
    private String fechaCierreCondicion;
    private String fechaAcuseReciboCondicion;
    private String descripcionCondicion;
    private String conceptoCondicion;
    private String fechaFinVigenciaCondicion;
    private String emailUserCompraCondicion;
    private String tipoCondicion;
    private String nombreCompletoCompraCondicion;
    //private String mtrEstadoCondicion;
    //private String mtrOrgCompraCondicion;
    //private String mtrSociedadCondicion;
    //private String mtrClaseDocumentoCondicion;
    //private String mtrMonedaCondicion;
    //private String mtrCondicionPagoCondicion;
    //private String mtrProveedorCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Integer> idList;
    private List<String> codigoNotaPedidoSapList;
    private List<String> userCompraList;
    private List<String> tnotasAclaratoriasList;
    private List<String> tlugarPagoList;
    private List<String> tformaPagoList;
    private List<String> tdocParticularesList;
    private List<String> tconceptoList;
    private List<Integer> plazoList;
    private List<String> nroPedidoOriginalList;
    private List<String> nroBidList;
    private List<BigDecimal> montoList;
    private List<Date> fechaInicioList;
    private List<Date> fechaFinList;
    private List<Date> fechaDocumentoList;
    private List<Date> fechaCierreList;
    private List<Date> fechaAcuseReciboList;
    private List<String> descripcionList;
    private List<String> conceptoList;
    private List<Date> fechaFinVigenciaList;
    private List<String> emailUserCompraList;
    private List<String> tipoList;
    private List<String> nombreCompletoCompraList;
    private List<MtrEstado> mtrEstadoList;
    private List<MtrOrgCompra> mtrOrgCompraList;
    private List<MtrSociedad> mtrSociedadList;
    private List<MtrClaseDocumento> mtrClaseDocumentoList;
    private List<MtrMoneda> mtrMonedaList;
    private List<MtrCondicionPago> mtrCondicionPagoList;
    private List<MtrProveedor> mtrProveedorList;

}
