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
import com.incloud.hcp.domain.MtrCondicionPago;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * Simple Interface for MtrCondicionPago.
 */
@Data
@ToString
@EqualsAndHashCode
public class MtrCondicionPagoResponse extends BaseResponseDomain<MtrCondicionPago> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String codigoCondicionPagoSapCondicion;
    private String descripcionCondicion;
    private String estadoCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Integer> idList;
    private List<String> codigoCondicionPagoSapList;
    private List<String> descripcionList;
    private List<String> estadoList;

}