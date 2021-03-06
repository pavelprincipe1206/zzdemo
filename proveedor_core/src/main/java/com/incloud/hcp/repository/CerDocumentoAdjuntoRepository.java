/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/repository/EntityRepository.java.e.vm
 */
package com.incloud.hcp.repository;

import com.incloud.hcp.domain.CerCertificado;
import com.incloud.hcp.domain.CerDocumentoAdjunto;
import com.incloud.hcp.domain.CerDocumentoAdjunto_;
import com.incloud.hcp.repository._framework.JPACustomRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

@NoRepositoryBean
public interface CerDocumentoAdjuntoRepository extends JPACustomRepository<CerDocumentoAdjunto, Integer> {

    default List<CerDocumentoAdjunto> findCompletePaginated(String query, int maxResults) {
        CerDocumentoAdjunto probe = new CerDocumentoAdjunto();
        //probe.setCarpetaId(query);
        probe.setCarpetaId(null);
        ExampleMatcher matcher = ExampleMatcher.matching() //
                .withMatcher(CerDocumentoAdjunto_.carpetaId.getName(), match -> match.ignoreCase().startsWith());

        Page<CerDocumentoAdjunto> page = this.findAll(Example.of(probe, matcher), PageRequest.of(0, maxResults));
        return page.getContent();
    }

    Long countByCerCertificado(@Param("cerCertificado") CerCertificado cerCertificado);

}
