/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/repository/EntitydeltaRepository.java.e.vm
 */
package com.incloud.hcp.repository.delta;

import com.incloud.hcp.domain.CerCertificado;
import com.incloud.hcp.domain.CerCertificadoDetalleSap;
import com.incloud.hcp.repository.CerCertificadoDetalleSapRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CerCertificadoDetalleSapDeltaRepository extends CerCertificadoDetalleSapRepository {

    @Query("select u from CerCertificadoDetalleSap u " +
            "where u.cerCertificadoDetalle.cerCertificado.id = ?1 order by u.cerCertificadoDetalle.cerNotaPedidoDetalle.posicionSap" )
    List<CerCertificadoDetalleSap> findByCerCertificado(Integer cerCertificadoId);

    @Query("select u.cerCertificadoDetalle.cerCertificado from CerCertificadoDetalleSap u " +
            "where u.cerCertificadoDetalle.cerCertificado.id in ?1 and " +
            " u.documentoGenerado = ?2 " +
            " order by u.cerCertificadoDetalle.cerCertificado.createdDate desc" )
    List<CerCertificado> findByCerCertificadoNroDocumento(List<Integer> cerCertificadoId, String nroDocumentoSap);
}
