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

import com.incloud.hcp.domain.BaseResponseDomain;
import com.incloud.hcp.domain.CerNotaPedido;
import com.incloud.hcp.domain.CerNotaPedidoAdjunto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * Simple Interface for CerNotaPedidoAdjunto.
 */
@Data
@ToString
@EqualsAndHashCode
public class CerNotaPedidoAdjuntoResponse extends BaseResponseDomain<CerNotaPedidoAdjunto> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String carpetaIdCondicion;
    private String archivoIdCondicion;
    private String archivoNombreCondicion;
    private String archivoTipoCondicion;
    private String rutaCatalogoCondicion;
    private String tipoAdjuntoCondicion;
    private String adjuntoAprobadorCondicion;
    private String sizeCondicion;
    //private String cerNotaPedidoCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Integer> idList;
    private List<String> carpetaIdList;
    private List<String> archivoIdList;
    private List<String> archivoNombreList;
    private List<String> archivoTipoList;
    private List<String> rutaCatalogoList;
    private List<String> tipoAdjuntoList;
    private List<String> adjuntoAprobadorList;
    private List<Long> sizeList;
    private List<CerNotaPedido> cerNotaPedidoList;

}
