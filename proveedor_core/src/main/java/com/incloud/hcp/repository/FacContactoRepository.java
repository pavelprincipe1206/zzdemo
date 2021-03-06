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

import com.incloud.hcp.domain.FacContacto;
import com.incloud.hcp.domain.FacContacto_;
import com.incloud.hcp.domain.MtrSector;
import com.incloud.hcp.repository._framework.JPACustomRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@NoRepositoryBean
public interface FacContactoRepository extends JPACustomRepository<FacContacto, Integer> {

    /**
     * Return the persistent instance of {@link FacContacto} with the given unique property value usuario,
     * or null if there is no such persistent instance.
     *
     * @param usuario the unique value
     * @return the corresponding {@link FacContacto} persistent instance or null
     */
    @RestResource(path = "/getByUsuario")
    FacContacto getByUsuario(@Param("usuario") String usuario);

    /**
     * Return the persistent instance of {@link FacContacto} with the given unique property value email,
     * or null if there is no such persistent instance.
     *
     * @param email the unique value
     * @return the corresponding {@link FacContacto} persistent instance or null
     */
    @RestResource(path = "/getByEmail")
    FacContacto getByEmail(@Param("email") String email);

    default List<FacContacto> findCompletePaginated(String query, int maxResults) {
        FacContacto probe = new FacContacto();
        //probe.setUsuario(query);
        probe.setUsuario(null);
        ExampleMatcher matcher = ExampleMatcher.matching() //
                .withMatcher(FacContacto_.usuario.getName(), match -> match.ignoreCase().startsWith());

        Page<FacContacto> page = this.findAll(Example.of(probe, matcher), PageRequest.of(0, maxResults));
        return page.getContent();
    }

    Long countByMtrSector(@Param("mtrSector") MtrSector mtrSector);

}
