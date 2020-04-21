/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntitydeltaDTOService.java.e.vm
 */
package com.incloud.hcp.service.delta.impl;

import com.incloud.hcp.domain.MtrCuentaMayor;
import com.incloud.hcp.domain.MtrSociedad;
import com.incloud.hcp.domain.MtrTipoImputacion;
import com.incloud.hcp.domain.response.MtrCuentaMayorResponse;
import com.incloud.hcp.service.delta.MtrCuentaMayorDeltaService;
import com.incloud.hcp.service.impl.MtrCuentaMayorServiceImpl;
import com.incloud.hcp.service.support.PageRequestByExample;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A simple DTO Facility for MtrCuentaMayor.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MtrCuentaMayorDeltaServiceImpl extends MtrCuentaMayorServiceImpl implements MtrCuentaMayorDeltaService {

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    @Transactional(readOnly = true)
    public List<MtrCuentaMayor> findSinCero(MtrCuentaMayor req) {
        log.debug("Ingresando find: ", req);
        Example<MtrCuentaMayor> example = null;
        MtrCuentaMayor bean = req;
        ExampleMatcher matcher = null;
        if (bean != null) {
            matcher = this.setAbstractFind(matcher);
            example = Example.of(bean, matcher);
        }
        Sort sort = Sort.by("id");
        sort = this.setFind(req, matcher, example, sort);
        Stream<MtrCuentaMayor> listaStream = this.mainRepository.findAll(example, sort).parallelStream();

        List<MtrCuentaMayor> lista = listaStream.collect(Collectors.toList());
        if (lista != null && lista.size() > 0) {
            for(MtrCuentaMayor beanLista : lista) {
                String codigo = beanLista.getCodigoCuentaMayor();
                try {
                    Integer nuevoCodigo = new Integer(codigo);
                    String sNuevoCodigo = nuevoCodigo.toString().trim();
                    beanLista.setCodigoCuentaMayor(sNuevoCodigo);
                }
                catch(Exception e) {

                }

            }
        }
        return lista;
    }

    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected Sort setFind(MtrCuentaMayor req, ExampleMatcher matcher, Example<MtrCuentaMayor> example, Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<MtrCuentaMayor> req, ExampleMatcher matcher, Example<MtrCuentaMayor> example) {
        return;
    }

    protected List<Predicate> setAdicionalDeltaPredicate(List<Predicate> predicates, MtrCuentaMayorResponse bean, CriteriaBuilder cb,
            CriteriaQuery<MtrCuentaMayor> query, Root<MtrCuentaMayor> root) throws Exception {

        MtrCuentaMayor entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            Join<MtrCuentaMayor, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
        
            if (Optional.ofNullable(entity.get<VariableManytoOne>().get<Atributo>()).isPresent()) {
                Join<MtrCuentaMayor, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
                Predicate thirdCondition = cb.equal(from<ClaseManytoOne>.get("<Atributo>"), entity.get<ClaseManytoOne>().get<Atributo>());
                predicates.add(thirdCondition);
            }
            
        }
        query.orderBy(cb.desc(root.get("<campo entity>")));
        */
        return predicates;
    }

    protected Root<MtrCuentaMayor> setAdicionalDeltaTotalPredicate(MtrCuentaMayorResponse bean, Root<MtrCuentaMayor> countRoot) throws Exception {
        MtrCuentaMayor entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
                Join<MtrCuentaMayor, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
            }
        }
        */
        return countRoot;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(MtrCuentaMayor bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected MtrCuentaMayor setCreate(MtrCuentaMayor bean) throws Exception {
        return bean;
    }

    protected void setSave(MtrCuentaMayor dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrCuentaMayor setUploadExcel(Cell currentCell, MtrCuentaMayor mtrCuentaMayor, int contador) throws Exception {
        mtrCuentaMayor = super.setUploadExcel(currentCell, mtrCuentaMayor, contador);
        return mtrCuentaMayor;
    }

    protected String setSaveMasivo(MtrCuentaMayor dto) throws Exception {
        return "";
    }

    protected List<MtrCuentaMayor> setBeforeDeleteMasivo(List<MtrCuentaMayor> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(MtrCuentaMayor bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    protected String setGraphDescripcionByMtrTipoImputacion(MtrTipoImputacion mtrTipoImputacion) {
        return mtrTipoImputacion.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrTipoImputacion() {
        return "MtrTipoImputacion";
    }

    protected String setGraphBarChartTituloByMtrTipoImputacion() {
        return "MtrTipoImputacion";
    }

    protected String setGraphDescripcionByMtrSociedad(MtrSociedad mtrSociedad) {
        return mtrSociedad.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrSociedad() {
        return "MtrSociedad";
    }

    protected String setGraphBarChartTituloByMtrSociedad() {
        return "MtrSociedad";
    }

}
