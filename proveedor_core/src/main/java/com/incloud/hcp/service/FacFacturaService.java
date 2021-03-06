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
import com.incloud.hcp.domain.response.FacFacturaResponse;
import com.incloud.hcp.service._framework.JPACustomService;

/**
 * Simple Interface for FacFactura.
 */
public interface FacFacturaService extends JPACustomService<FacFacturaResponse, FacFactura, Integer> {

    Long countByMtrEstado(MtrEstado mtrEstado);

    GraphBean graphByMtrEstado();

    Long countByMtrMoneda(MtrMoneda mtrMoneda);

    GraphBean graphByMtrMoneda();

    Long countByMtrDetraccion(MtrDetraccion mtrDetraccion);

    GraphBean graphByMtrDetraccion();

    Long countByMtrProveedor(MtrProveedor mtrProveedor);

    GraphBean graphByMtrProveedor();

    Long countByFacContacto(FacContacto facContacto);

    GraphBean graphByFacContacto();

    Long countByMtrSociedad(MtrSociedad mtrSociedad);

    GraphBean graphByMtrSociedad();

}
