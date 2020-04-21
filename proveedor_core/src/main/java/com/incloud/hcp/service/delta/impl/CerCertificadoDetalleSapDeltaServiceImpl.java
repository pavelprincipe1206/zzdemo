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

import com.incloud.hcp.domain.CerCertificadoDetalle;
import com.incloud.hcp.domain.CerCertificadoDetalleSap;
import com.incloud.hcp.domain.response.CerCertificadoDetalleSapResponse;
import com.incloud.hcp.service.delta.CerCertificadoDetalleSapDeltaService;
import com.incloud.hcp.service.impl.CerCertificadoDetalleSapServiceImpl;
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
 * A simple DTO Facility for CerCertificadoDetalleSap.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class CerCertificadoDetalleSapDeltaServiceImpl extends CerCertificadoDetalleSapServiceImpl implements CerCertificadoDetalleSapDeltaService {

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        return sort;
    }

    protected Sort setFind(CerCertificadoDetalleSap req, ExampleMatcher matcher, Example<CerCertificadoDetalleSap> example, Sort sort) {
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<CerCertificadoDetalleSap> req, ExampleMatcher matcher, Example<CerCertificadoDetalleSap> example) {
        return;
    }

    protected List<Predicate> setAdicionalDeltaPredicate(List<Predicate> predicates, CerCertificadoDetalleSapResponse bean, CriteriaBuilder cb,
            CriteriaQuery<CerCertificadoDetalleSap> query, Root<CerCertificadoDetalleSap> root) throws Exception {

        CerCertificadoDetalleSap entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            Join<CerCertificadoDetalleSap, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
        
            if (Optional.ofNullable(entity.get<VariableManytoOne>().get<Atributo>()).isPresent()) {
                Join<CerCertificadoDetalleSap, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
                Predicate thirdCondition = cb.equal(from<ClaseManytoOne>.get("<Atributo>"), entity.get<ClaseManytoOne>().get<Atributo>());
                predicates.add(thirdCondition);
            }
            
        }
        query.orderBy(cb.desc(root.get("<campo entity>")));
        */
        return predicates;
    }

    protected Root<CerCertificadoDetalleSap> setAdicionalDeltaTotalPredicate(CerCertificadoDetalleSapResponse bean, Root<CerCertificadoDetalleSap> countRoot)
            throws Exception {
        CerCertificadoDetalleSap entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
                Join<CerCertificadoDetalleSap, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
            }
        }
        */
        return countRoot;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(CerCertificadoDetalleSap bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected CerCertificadoDetalleSap setCreate(CerCertificadoDetalleSap bean) throws Exception {
        return bean;
    }

    protected void setSave(CerCertificadoDetalleSap dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected CerCertificadoDetalleSap setUploadExcel(Cell currentCell, CerCertificadoDetalleSap cerCertificadoDetalleSap, int contador) throws Exception {
        cerCertificadoDetalleSap = super.setUploadExcel(currentCell, cerCertificadoDetalleSap, contador);
        return cerCertificadoDetalleSap;
    }

    protected String setSaveMasivo(CerCertificadoDetalleSap dto) throws Exception {
        return "";
    }

    protected List<CerCertificadoDetalleSap> setBeforeDeleteMasivo(List<CerCertificadoDetalleSap> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(CerCertificadoDetalleSap bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    protected String setGraphDescripcionByCerCertificadoDetalle(CerCertificadoDetalle cerCertificadoDetalle) {
        return cerCertificadoDetalle.getId().toString();
    }

    protected String setGraphPieChartTituloByCerCertificadoDetalle() {
        return "CerCertificadoDetalle";
    }

    protected String setGraphBarChartTituloByCerCertificadoDetalle() {
        return "CerCertificadoDetalle";
    }

}