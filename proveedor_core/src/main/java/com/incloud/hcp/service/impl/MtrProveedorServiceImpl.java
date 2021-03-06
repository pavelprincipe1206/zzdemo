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
import com.incloud.hcp.domain.MtrProveedor;
import com.incloud.hcp.domain.MtrProveedor_;
import com.incloud.hcp.domain.response.MtrProveedorResponse;
import com.incloud.hcp.exception.ServiceException;
import com.incloud.hcp.repository.delta.AppParametriaDeltaRepository;
import com.incloud.hcp.repository.delta.MtrProveedorDeltaRepository;
import com.incloud.hcp.service.MtrProveedorService;
import com.incloud.hcp.service._framework.bean.BeanCargaMasivoDTO;
import com.incloud.hcp.service._framework.bean.BeanListaMasivoDTO;
import com.incloud.hcp.service._framework.impl.JPACustomServiceImpl;
import com.incloud.hcp.service.requireNew.MtrProveedorRequireNewService;
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
 * A simple DTO Facility for MtrProveedor.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public abstract class MtrProveedorServiceImpl extends JPACustomServiceImpl<MtrProveedorResponse, MtrProveedor, Integer> implements MtrProveedorService {

    protected final String NAME_SHEET = "MtrProveedor";
    protected final String CONFIG_TITLE = "com/incloud/hcp/excel/MtrProveedorExcel.xml";
    private final Integer REGISTROS_COLOR = 10;

    @Autowired
    protected AppParametriaDeltaRepository appParametriaDeltaRepository;

    @Autowired
    protected MtrProveedorDeltaRepository mtrProveedorDeltaRepository;

    @Autowired
    protected MtrProveedorRequireNewService mtrProveedorRequireNewService;

    /*****************************/
    /* Metodos de Busqueda       */
    /*****************************/

    protected final ExampleMatcher setAbstractFind(ExampleMatcher matcher) {
        matcher = ExampleMatcher.matching() //
                .withMatcher(MtrProveedor_.ruc.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrProveedor_.razonSocial.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrProveedor_.direccion.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrProveedor_.emailContacto.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrProveedor_.codigoIdp.getName(), match -> match.ignoreCase().startsWith());
        return matcher;
    }

    protected abstract Sort setFindAll(Sort sort);

    protected abstract Sort setFind(MtrProveedor req, ExampleMatcher matcher, Example<MtrProveedor> example, Sort sort);

    protected abstract void setFindPaginated(PageRequestByExample<MtrProveedor> req, ExampleMatcher matcher, Example<MtrProveedor> example);

    protected final MtrProveedor setObtenerBeanResponse(MtrProveedorResponse bean) {
        return bean.getBean();
    }

    protected final Class<MtrProveedor> setObtenerClassBean() {
        return MtrProveedor.class;
    }

    protected List<Predicate> setAbstractPredicate(MtrProveedorResponse bean, CriteriaBuilder cb, Root<MtrProveedor> root) {
        List<Predicate> predicates = new ArrayList<>();
        MtrProveedor entity = bean.getBean();
        /* Obtener condiciones */
        PredicateUtils.addPredicates(predicates, bean.getIdCondicion(), "id", entity.getId(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getRucCondicion(), "ruc", entity.getRuc(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getRazonSocialCondicion(), "razonSocial", entity.getRazonSocial(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getDireccionCondicion(), "direccion", entity.getDireccion(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getEmailContactoCondicion(), "emailContacto", entity.getEmailContacto(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getCodigoIdpCondicion(), "codigoIdp", entity.getCodigoIdp(), cb, root);
        /* Obtener valores de Lista */
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "id", bean.getIdList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "ruc", bean.getRucList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "razonSocial", bean.getRazonSocialList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "direccion", bean.getDireccionList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "emailContacto", bean.getEmailContactoList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "codigoIdp", bean.getCodigoIdpList(), cb, root);
        return predicates;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected final String validacionesPrevias(MtrProveedor bean) throws Exception {
        String mensaje = "";
        if (!Optional.of(bean.getRuc()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrProveedor.ruc.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getRazonSocial()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrProveedor.razonSocial.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getDireccion()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrProveedor.direccion.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        String msg = this.setValidacionesPrevias(bean);
        if (StringUtils.isNotBlank(msg)) {
            mensaje += "* " + msg + "<br/>";
        }
        return mensaje;
    }

    protected String setValidacionesPrevias(MtrProveedor bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected String validacionesPreviasCreate(MtrProveedor bean) throws Exception {
        String msg = null;
        MtrProveedor validar = null;
        validar = this.mtrProveedorDeltaRepository.getByRuc(bean.getRuc());
        if (Optional.ofNullable(validar).isPresent()) {
            msg = this.messageSource.getMessage("message.mtrProveedor.ruc.duplicado", null, LocaleContextHolder.getLocale());
            return msg;
        }
        return msg;
    }

    protected String validacionesPreviasSave(MtrProveedor bean) throws Exception {
        String msg = null;
        MtrProveedor validar = null;
        validar = this.mtrProveedorDeltaRepository.getByRuc(bean.getRuc());
        if (Optional.ofNullable(validar).isPresent()) {
            if (bean.getId().intValue() != validar.getId().intValue()) {
                msg = this.messageSource.getMessage("message.mtrProveedor.ruc.duplicado", null, LocaleContextHolder.getLocale());
                return msg;
            }
        }
        return msg;
    }

    protected MtrProveedor completarDatosBean(MtrProveedor bean) throws Exception {
        BigDecimal data = new BigDecimal(0.00);
        bean = this.setCompletarDatosBean(bean);
        return bean;
    }

    protected MtrProveedor setCompletarDatosBean(MtrProveedor bean) throws Exception {
        return bean;
    }

    protected final MtrProveedor setAbstractCreate(MtrProveedor dto) throws Exception {
        MtrProveedor bean = new MtrProveedor();
        bean = (MtrProveedor) BeanUtils.cloneBean(dto);
        return bean;
    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrProveedor setUploadExcel(Cell currentCell, MtrProveedor mtrProveedor, int contador) throws Exception {
        Double valorDouble = new Double(0);
        BigDecimal valorDecimal = new BigDecimal(0);
        Boolean valorBoolean = new Boolean(true);
        String valorCadena = "";
        switch (contador) {
        case 1:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 20) {
                    throw new ServiceException("Valor Campo ruc contiene mas de 20 caracter(es)");
                }
                mtrProveedor.setRuc(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo ruc está en formato incorrecto");
            }
            break;
        case 2:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 255) {
                    throw new ServiceException("Valor Campo razonSocial contiene mas de 255 caracter(es)");
                }
                mtrProveedor.setRazonSocial(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo razonSocial está en formato incorrecto");
            }
            break;
        case 3:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 255) {
                    throw new ServiceException("Valor Campo direccion contiene mas de 255 caracter(es)");
                }
                mtrProveedor.setDireccion(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo direccion está en formato incorrecto");
            }
            break;
        case 4:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 150) {
                    throw new ServiceException("Valor Campo emailContacto contiene mas de 150 caracter(es)");
                }
                mtrProveedor.setEmailContacto(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo emailContacto está en formato incorrecto");
            }
            break;
        case 5:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 20) {
                    throw new ServiceException("Valor Campo codigoIdp contiene mas de 20 caracter(es)");
                }
                mtrProveedor.setCodigoIdp(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo codigoIdp está en formato incorrecto");
            }
            break;
        default:
            break;
        }
        return mtrProveedor;
    }

    protected AppParametria setObtenerRegistroConfiguracionUploadExcel() {
        AppParametria appParametriaData = this.appParametriaDeltaRepository.getByModuloAndLabelAndStatus(AppParametriaModuloEnum.CARGA_EXCEL.getEstado(),
                AppParametriaLabelEnum.INICIO_REGISTRO_DATA.getEstado(), Constants.ESTADO_ACTIVO);
        return appParametriaData;
    }

    protected MtrProveedor setInicializarBeanUpdateExcel() {
        MtrProveedor bean = new MtrProveedor();
        bean.setId(null);
        return bean;
    }

    protected final Integer setObtenerId(MtrProveedor bean) {
        return bean.getId();
    }

    /************************/
    /* Instancia de Bean    */
    /************************/

    protected final MtrProveedor createInstance() {
        MtrProveedor mtrProveedor = new MtrProveedor();
        return mtrProveedor;
    }

    protected final BeanCargaMasivoDTO<MtrProveedor> createInstanceMasivoDTO() {
        BeanCargaMasivoDTO<MtrProveedor> beanCargaMasivoDTO = new BeanCargaMasivoDTO<MtrProveedor>();
        return beanCargaMasivoDTO;

    }

    protected final BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrProveedor>> createInstanceListaMasivoDTO() {
        BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrProveedor>> beanCargaMasivoDTOBeanListaMasivoDTO = new BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrProveedor>>();
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

    protected int setAbstractDownloadExcel(MtrProveedor bean, HSSFRow dataRow) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getRuc(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getRazonSocial(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getDireccion(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getEmailContacto(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoIdp(), dataRow.createCell(contador));
        contador++;
        return contador;
    }

    protected int setAbstractDownloadExcelSXLSX(MtrProveedor bean, Row dataRow, List<CellStyle> cellStyleList) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador), "I", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getRuc(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getRazonSocial(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getDireccion(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getEmailContacto(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoIdp(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        return contador;
    }

    protected String setAbstractGenerateInsertExcelSXLSX(MtrProveedor bean) {
        String fechaS = "";
        String sqlInsert = "INSERT INTO mtr_proveedor(";
        sqlInsert = sqlInsert + "mtr_proveedor_id" + ", ";
        sqlInsert = sqlInsert + "ruc" + ", ";
        sqlInsert = sqlInsert + "razon_social" + ", ";
        sqlInsert = sqlInsert + "direccion" + ", ";
        sqlInsert = sqlInsert + "email_contacto" + ", ";
        sqlInsert = sqlInsert + "codigo_idp" + ")";
        sqlInsert = sqlInsert + " VALUES (";
        sqlInsert = sqlInsert + bean.getId() + ", ";
        if (StringUtils.isBlank(bean.getRuc())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getRuc() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getRazonSocial())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getRazonSocial() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getDireccion())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getDireccion() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getEmailContacto())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getEmailContacto() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getCodigoIdp())) {
            sqlInsert = sqlInsert + "null";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getCodigoIdp() + "'";
        }
        sqlInsert = sqlInsert + " );";
        return sqlInsert;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
