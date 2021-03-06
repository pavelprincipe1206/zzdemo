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

import com.incloud.hcp.domain.MtrUnidadMedida;
import com.incloud.hcp.service.delta.MtrUnidadMedidaDeltaService;
import com.incloud.hcp.service.impl.MtrUnidadMedidaServiceImpl;
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

import java.util.List;

/**
 * A simple DTO Facility for MtrUnidadMedida.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MtrUnidadMedidaDeltaServiceImpl extends MtrUnidadMedidaServiceImpl implements MtrUnidadMedidaDeltaService {

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "codigoSap"),
                new Sort.Order(Sort.Direction.ASC, "descripcion")
        );
        return sort;
    }

    protected Sort setFind(MtrUnidadMedida req, ExampleMatcher matcher, Example<MtrUnidadMedida> example, Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "codigoSap"),
                new Sort.Order(Sort.Direction.ASC, "descripcion")
        );
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<MtrUnidadMedida> req, ExampleMatcher matcher, Example<MtrUnidadMedida> example) {
        return;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(MtrUnidadMedida bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected MtrUnidadMedida setCreate(MtrUnidadMedida bean) throws Exception {
        return bean;
    }

    protected void setSave(MtrUnidadMedida dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrUnidadMedida setUploadExcel(Cell currentCell, MtrUnidadMedida mtrUnidadMedida, int contador) throws Exception {
        mtrUnidadMedida = super.setUploadExcel(currentCell, mtrUnidadMedida, contador);
        return mtrUnidadMedida;
    }

    protected String setSaveMasivo(MtrUnidadMedida dto) throws Exception {
        return "";
    }

    protected List<MtrUnidadMedida> setBeforeDeleteMasivo(List<MtrUnidadMedida> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(MtrUnidadMedida bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
