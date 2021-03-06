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

import com.incloud.hcp.domain.MtrAreaTrabajo;
import com.incloud.hcp.domain.response.MtrAreaTrabajoResponse;
import com.incloud.hcp.service.delta.MtrAreaTrabajoDeltaService;
import com.incloud.hcp.service.impl.MtrAreaTrabajoServiceImpl;
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

/**
 * A simple DTO Facility for MtrAreaTrabajo.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MtrAreaTrabajoDeltaServiceImpl extends MtrAreaTrabajoServiceImpl implements MtrAreaTrabajoDeltaService {

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected Sort setFind(MtrAreaTrabajo req, ExampleMatcher matcher, Example<MtrAreaTrabajo> example, Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<MtrAreaTrabajo> req, ExampleMatcher matcher, Example<MtrAreaTrabajo> example) {
        return;
    }

    protected List<Predicate> setAdicionalDeltaPredicate(List<Predicate> predicates, MtrAreaTrabajoResponse bean, CriteriaBuilder cb,
            CriteriaQuery<MtrAreaTrabajo> query, Root<MtrAreaTrabajo> root) throws Exception {

        MtrAreaTrabajo entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            Join<MtrAreaTrabajo, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
        
            if (Optional.ofNullable(entity.get<VariableManytoOne>().get<Atributo>()).isPresent()) {
                Join<MtrAreaTrabajo, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
                Predicate thirdCondition = cb.equal(from<ClaseManytoOne>.get("<Atributo>"), entity.get<ClaseManytoOne>().get<Atributo>());
                predicates.add(thirdCondition);
            }
            
        }
        query.orderBy(cb.desc(root.get("<campo entity>")));
        */
        return predicates;
    }

    protected Root<MtrAreaTrabajo> setAdicionalDeltaTotalPredicate(MtrAreaTrabajoResponse bean, Root<MtrAreaTrabajo> countRoot) throws Exception {
        MtrAreaTrabajo entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
                Join<MtrAreaTrabajo, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
            }
        }
        */
        return countRoot;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(MtrAreaTrabajo bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected MtrAreaTrabajo setCreate(MtrAreaTrabajo bean) throws Exception {
        return bean;
    }

    protected void setSave(MtrAreaTrabajo dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrAreaTrabajo setUploadExcel(Cell currentCell, MtrAreaTrabajo mtrAreaTrabajo, int contador) throws Exception {
        mtrAreaTrabajo = super.setUploadExcel(currentCell, mtrAreaTrabajo, contador);
        return mtrAreaTrabajo;
    }

    protected String setSaveMasivo(MtrAreaTrabajo dto) throws Exception {
        return "";
    }

    protected List<MtrAreaTrabajo> setBeforeDeleteMasivo(List<MtrAreaTrabajo> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(MtrAreaTrabajo bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
