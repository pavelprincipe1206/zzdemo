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

import com.incloud.hcp._security.SystemLoggedUser;
import com.incloud.hcp._security.UserSession;
import com.incloud.hcp.domain.MtrProveedor;
import com.incloud.hcp.service.delta.MtrProveedorDeltaService;
import com.incloud.hcp.service.impl.MtrProveedorServiceImpl;
import com.incloud.hcp.service.support.PageRequestByExample;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * A simple DTO Facility for MtrProveedor.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MtrProveedorDeltaServiceImpl extends MtrProveedorServiceImpl implements MtrProveedorDeltaService {

    @Autowired
    private SystemLoggedUser systemLoggedUser;

    /**************************/
    /* Metodos Personalizados */
    /**************************/
    public MtrProveedor devuelveProveedorLogueado() throws Exception {
        UserSession userSession = this.systemLoggedUser.getUserSession();
        String idp = userSession.getId();
        MtrProveedor mtrProveedor = this.mtrProveedorDeltaRepository.findByCodigoIdp(idp);
        if (!Optional.ofNullable(mtrProveedor).isPresent()) {
            throw new Exception("No existe Proveedor asociado al IDP con Código: " + idp);
        }
        return mtrProveedor;
    }


    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "razonSocial")
        );
        return sort;
    }

    protected Sort setFind(MtrProveedor req, ExampleMatcher matcher, Example<MtrProveedor> example, Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "razonSocial")
        );
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<MtrProveedor> req, ExampleMatcher matcher, Example<MtrProveedor> example) {
        return;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(MtrProveedor bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected MtrProveedor setCreate(MtrProveedor bean) throws Exception {
        return bean;
    }

    protected void setSave(MtrProveedor dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrProveedor setUploadExcel(Cell currentCell, MtrProveedor mtrProveedor, int contador) throws Exception {
        mtrProveedor = super.setUploadExcel(currentCell, mtrProveedor, contador);
        return mtrProveedor;
    }

    protected String setSaveMasivo(MtrProveedor dto) throws Exception {
        return "";
    }

    protected List<MtrProveedor> setBeforeDeleteMasivo(List<MtrProveedor> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(MtrProveedor bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
