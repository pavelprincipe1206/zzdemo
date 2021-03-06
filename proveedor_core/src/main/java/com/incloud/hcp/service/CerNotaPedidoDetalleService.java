/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntityDTO.java.e.vm
 */
package com.incloud.hcp.service;

import com.incloud.hcp.common.graph.GraphBean;
import com.incloud.hcp.domain.*;
import com.incloud.hcp.domain.response.CerNotaPedidoDetalleResponse;
import com.incloud.hcp.service._framework.JPACustomService;

/**
 * Simple Interface for CerNotaPedidoDetalle.
 */
public interface CerNotaPedidoDetalleService extends JPACustomService<CerNotaPedidoDetalleResponse, CerNotaPedidoDetalle, Integer> {

    Long countByMtrCuentaImputacion(MtrCuentaImputacion mtrCuentaImputacion);

    GraphBean graphByMtrCuentaImputacion();

    Long countByMtrBienServicio(MtrBienServicio mtrBienServicio);

    GraphBean graphByMtrBienServicio();

    Long countByCerNotaPedido(CerNotaPedido cerNotaPedido);

    GraphBean graphByCerNotaPedido();

    Long countByMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida);

    GraphBean graphByMtrUnidadMedida();

    Long countByMtrCuentaMayor(MtrCuentaMayor mtrCuentaMayor);

    GraphBean graphByMtrCuentaMayor();

}
