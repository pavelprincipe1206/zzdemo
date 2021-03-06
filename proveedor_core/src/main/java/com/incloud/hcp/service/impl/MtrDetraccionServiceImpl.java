/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntityDTOService.java.e.vm
 */
package com.incloud.hcp.service.impl;

import com.incloud.hcp.common.enums.AppParametriaLabelEnum;
import com.incloud.hcp.common.enums.AppParametriaModuloEnum;
import com.incloud.hcp.common.excel.ExcelDefault;
import com.incloud.hcp.domain.AppParametria;
import com.incloud.hcp.domain.MtrDetraccion;
import com.incloud.hcp.domain.MtrDetraccion_;
import com.incloud.hcp.domain.response.MtrDetraccionResponse;
import com.incloud.hcp.exception.ServiceException;
import com.incloud.hcp.repository.delta.AppParametriaDeltaRepository;
import com.incloud.hcp.repository.delta.MtrDetraccionDeltaRepository;
import com.incloud.hcp.service.MtrDetraccionService;
import com.incloud.hcp.service._framework.bean.BeanCargaMasivoDTO;
import com.incloud.hcp.service._framework.bean.BeanListaMasivoDTO;
import com.incloud.hcp.service._framework.impl.JPACustomServiceImpl;
import com.incloud.hcp.service.requireNew.MtrDetraccionRequireNewService;
import com.incloud.hcp.service.support.PageRequestByExample;
import com.incloud.hcp.utils.Constants;
import com.incloud.hcp.utils.PredicateUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * A simple DTO Facility for MtrDetraccion.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public abstract class MtrDetraccionServiceImpl extends JPACustomServiceImpl<MtrDetraccionResponse, MtrDetraccion, Integer> implements MtrDetraccionService {

    protected final String NAME_SHEET = "MtrDetraccion";
    protected final String CONFIG_TITLE = "com/incloud/hcp/excel/MtrDetraccionExcel.xml";
    private final Integer REGISTROS_COLOR = 10;

    @Autowired
    protected AppParametriaDeltaRepository appParametriaDeltaRepository;

    @Autowired
    protected MtrDetraccionDeltaRepository mtrDetraccionDeltaRepository;

    @Autowired
    protected MtrDetraccionRequireNewService mtrDetraccionRequireNewService;

    /*****************************/
    /* Metodos de Busqueda       */
    /*****************************/

    protected final ExampleMatcher setAbstractFind(ExampleMatcher matcher) {
        matcher = ExampleMatcher.matching() //
                .withMatcher(MtrDetraccion_.codigo.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrDetraccion_.descripcion.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrDetraccion_.estado.getName(), match -> match.ignoreCase().startsWith());
        return matcher;
    }

    protected abstract Sort setFindAll(Sort sort);

    protected abstract Sort setFind(MtrDetraccion req, ExampleMatcher matcher, Example<MtrDetraccion> example, Sort sort);

    protected abstract void setFindPaginated(PageRequestByExample<MtrDetraccion> req, ExampleMatcher matcher, Example<MtrDetraccion> example);

    protected final MtrDetraccion setObtenerBeanResponse(MtrDetraccionResponse bean) {
        return bean.getBean();
    }

    protected final Class<MtrDetraccion> setObtenerClassBean() {
        return MtrDetraccion.class;
    }

    protected List<Predicate> setAbstractPredicate(MtrDetraccionResponse bean, CriteriaBuilder cb, Root<MtrDetraccion> root) {
        List<Predicate> predicates = new ArrayList<>();
        MtrDetraccion entity = bean.getBean();
        /* Obtener condiciones */
        PredicateUtils.addPredicates(predicates, bean.getIdCondicion(), "id", entity.getId(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getCodigoCondicion(), "codigo", entity.getCodigo(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getDescripcionCondicion(), "descripcion", entity.getDescripcion(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getEstadoCondicion(), "estado", entity.getEstado(), cb, root);
        /* Obtener valores de Lista */
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "id", bean.getIdList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "codigo", bean.getCodigoList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "descripcion", bean.getDescripcionList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "estado", bean.getEstadoList(), cb, root);
        return predicates;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected final String validacionesPrevias(MtrDetraccion bean) throws Exception {
        String mensaje = "";
        if (!Optional.of(bean.getCodigo()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrDetraccion.codigo.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getDescripcion()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrDetraccion.descripcion.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getEstado()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrDetraccion.estado.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        String msg = this.setValidacionesPrevias(bean);
        if (StringUtils.isNotBlank(msg)) {
            mensaje += "* " + msg + "<br/>";
        }
        return mensaje;
    }

    protected String setValidacionesPrevias(MtrDetraccion bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected String validacionesPreviasCreate(MtrDetraccion bean) throws Exception {
        String msg = null;
        MtrDetraccion validar = null;
        return msg;
    }

    protected String validacionesPreviasSave(MtrDetraccion bean) throws Exception {
        String msg = null;
        MtrDetraccion validar = null;
        return msg;
    }

    protected MtrDetraccion completarDatosBean(MtrDetraccion bean) throws Exception {
        BigDecimal data = new BigDecimal(0.00);
        bean = this.setCompletarDatosBean(bean);
        return bean;
    }

    protected MtrDetraccion setCompletarDatosBean(MtrDetraccion bean) throws Exception {
        return bean;
    }

    protected final MtrDetraccion setAbstractCreate(MtrDetraccion dto) throws Exception {
        MtrDetraccion bean = new MtrDetraccion();
        bean = (MtrDetraccion) BeanUtils.cloneBean(dto);
        return bean;
    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrDetraccion setUploadExcel(Cell currentCell, MtrDetraccion mtrDetraccion, int contador) throws Exception {
        Double valorDouble = new Double(0);
        BigDecimal valorDecimal = new BigDecimal(0);
        Boolean valorBoolean = new Boolean(true);
        String valorCadena = "";
        switch (contador) {
        case 1:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 10) {
                    throw new ServiceException("Valor Campo codigo contiene mas de 10 caracter(es)");
                }
                mtrDetraccion.setCodigo(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo codigo está en formato incorrecto");
            }
            break;
        case 2:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 60) {
                    throw new ServiceException("Valor Campo descripcion contiene mas de 60 caracter(es)");
                }
                mtrDetraccion.setDescripcion(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo descripcion está en formato incorrecto");
            }
            break;
        case 3:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 1) {
                    throw new ServiceException("Valor Campo estado contiene mas de 1 caracter(es)");
                }
                mtrDetraccion.setEstado(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo estado está en formato incorrecto");
            }
            break;
        default:
            break;
        }
        return mtrDetraccion;
    }

    protected AppParametria setObtenerRegistroConfiguracionUploadExcel() {
        AppParametria appParametriaData = this.appParametriaDeltaRepository.getByModuloAndLabelAndStatus(AppParametriaModuloEnum.CARGA_EXCEL.getEstado(),
                AppParametriaLabelEnum.INICIO_REGISTRO_DATA.getEstado(), Constants.ESTADO_ACTIVO);
        return appParametriaData;
    }

    protected MtrDetraccion setInicializarBeanUpdateExcel() {
        MtrDetraccion bean = new MtrDetraccion();
        bean.setId(null);
        return bean;
    }

    protected final Integer setObtenerId(MtrDetraccion bean) {
        return bean.getId();
    }

    /************************/
    /* Instancia de Bean    */
    /************************/

    protected final MtrDetraccion createInstance() {
        MtrDetraccion mtrDetraccion = new MtrDetraccion();
        return mtrDetraccion;
    }

    protected final BeanCargaMasivoDTO<MtrDetraccion> createInstanceMasivoDTO() {
        BeanCargaMasivoDTO<MtrDetraccion> beanCargaMasivoDTO = new BeanCargaMasivoDTO<MtrDetraccion>();
        return beanCargaMasivoDTO;

    }

    protected final BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrDetraccion>> createInstanceListaMasivoDTO() {
        BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrDetraccion>> beanCargaMasivoDTOBeanListaMasivoDTO = new BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrDetraccion>>();
        return beanCargaMasivoDTOBeanListaMasivoDTO;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected String devuelveNombreSheet() {
        return this.NAME_SHEET;
    }

    protected String devuelveListaHeaderExcelXML() {
        return this.CONFIG_TITLE;
    }

    protected int setAbstractDownloadExcel(MtrDetraccion bean, HSSFRow dataRow) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getCodigo(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcion(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getEstado(), dataRow.createCell(contador));
        contador++;
        return contador;
    }

    protected int setAbstractDownloadExcelSXLSX(MtrDetraccion bean, Row dataRow, List<CellStyle> cellStyleList) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador), "I", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getCodigo(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcion(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getEstado(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        return contador;
    }

    protected String setAbstractGenerateInsertExcelSXLSX(MtrDetraccion bean) {
        String fechaS = "";
        String sqlInsert = "INSERT INTO mtr_detraccion(";
        sqlInsert = sqlInsert + "mtr_detraccion_id" + ", ";
        sqlInsert = sqlInsert + "codigo" + ", ";
        sqlInsert = sqlInsert + "descripcion" + ", ";
        sqlInsert = sqlInsert + "estado" + ")";
        sqlInsert = sqlInsert + " VALUES (";
        sqlInsert = sqlInsert + bean.getId() + ", ";
        if (StringUtils.isBlank(bean.getCodigo())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getCodigo() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getDescripcion())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getDescripcion() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getEstado())) {
            sqlInsert = sqlInsert + "null";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getEstado() + "'";
        }
        sqlInsert = sqlInsert + " );";
        return sqlInsert;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
