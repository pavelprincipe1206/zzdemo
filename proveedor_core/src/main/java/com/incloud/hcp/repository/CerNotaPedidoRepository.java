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

import com.incloud.hcp.domain.*;
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
public interface CerNotaPedidoRepository extends JPACustomRepository<CerNotaPedido, Integer> {

    /**
     * Return the persistent instance of {@link CerNotaPedido} with the given unique property value codigoNotaPedidoSap,
     * or null if there is no such persistent instance.
     *
     * @param codigoNotaPedidoSap the unique value
     * @return the corresponding {@link CerNotaPedido} persistent instance or null
     */
    @RestResource(path = "/getByCodigoNotaPedidoSap")
    CerNotaPedido getByCodigoNotaPedidoSap(@Param("codigoNotaPedidoSap") String codigoNotaPedidoSap);

    default List<CerNotaPedido> findCompletePaginated(String query, int maxResults) {
        CerNotaPedido probe = new CerNotaPedido();
        //probe.setCodigoNotaPedidoSap(query);
        probe.setCodigoNotaPedidoSap(null);
        ExampleMatcher matcher = ExampleMatcher.matching() //
                .withMatcher(CerNotaPedido_.codigoNotaPedidoSap.getName(), match -> match.ignoreCase().startsWith());

        Page<CerNotaPedido> page = this.findAll(Example.of(probe, matcher), PageRequest.of(0, maxResults));
        return page.getContent();
    }

    Long countByMtrEstado(@Param("mtrEstado") MtrEstado mtrEstado);

    Long countByMtrOrgCompra(@Param("mtrOrgCompra") MtrOrgCompra mtrOrgCompra);

    Long countByMtrSociedad(@Param("mtrSociedad") MtrSociedad mtrSociedad);

    Long countByMtrClaseDocumento(@Param("mtrClaseDocumento") MtrClaseDocumento mtrClaseDocumento);

    Long countByMtrMoneda(@Param("mtrMoneda") MtrMoneda mtrMoneda);

    Long countByMtrCondicionPago(@Param("mtrCondicionPago") MtrCondicionPago mtrCondicionPago);

    Long countByMtrProveedor(@Param("mtrProveedor") MtrProveedor mtrProveedor);

}
