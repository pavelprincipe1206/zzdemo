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
import com.incloud.hcp.common.graph.GraphBarChart;
import com.incloud.hcp.common.graph.GraphBean;
import com.incloud.hcp.common.graph.GraphDataset;
import com.incloud.hcp.common.graph.GraphPieChart;
import com.incloud.hcp.domain.*;
import com.incloud.hcp.domain.response.MtrBienServicioResponse;
import com.incloud.hcp.exception.ServiceException;
import com.incloud.hcp.repository.delta.AppParametriaDeltaRepository;
import com.incloud.hcp.repository.delta.MtrBienServicioDeltaRepository;
import com.incloud.hcp.repository.delta.MtrGrupoArticuloDeltaRepository;
import com.incloud.hcp.repository.delta.MtrUnidadMedidaDeltaRepository;
import com.incloud.hcp.service.MtrBienServicioService;
import com.incloud.hcp.service._framework.bean.BeanCargaMasivoDTO;
import com.incloud.hcp.service._framework.bean.BeanListaMasivoDTO;
import com.incloud.hcp.service._framework.impl.JPACustomServiceImpl;
import com.incloud.hcp.service.delta.MtrGrupoArticuloDeltaService;
import com.incloud.hcp.service.delta.MtrUnidadMedidaDeltaService;
import com.incloud.hcp.service.requireNew.MtrBienServicioRequireNewService;
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
 * A simple DTO Facility for MtrBienServicio.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public abstract class MtrBienServicioServiceImpl extends JPACustomServiceImpl<MtrBienServicioResponse, MtrBienServicio, Integer>
        implements MtrBienServicioService {

    protected final String NAME_SHEET = "MtrBienServicio";
    protected final String CONFIG_TITLE = "com/incloud/hcp/excel/MtrBienServicioExcel.xml";
    private final Integer REGISTROS_COLOR = 10;

    @Autowired
    protected AppParametriaDeltaRepository appParametriaDeltaRepository;

    @Autowired
    protected MtrBienServicioDeltaRepository mtrBienServicioDeltaRepository;

    @Autowired
    protected MtrBienServicioRequireNewService mtrBienServicioRequireNewService;

    @Autowired
    protected MtrGrupoArticuloDeltaService mtrGrupoArticuloDeltaService;

    @Autowired
    protected MtrGrupoArticuloDeltaRepository mtrGrupoArticuloDeltaRepository;

    @Autowired
    protected MtrUnidadMedidaDeltaService mtrUnidadMedidaDeltaService;

    @Autowired
    protected MtrUnidadMedidaDeltaRepository mtrUnidadMedidaDeltaRepository;

    /*****************************/
    /* Metodos de Busqueda       */
    /*****************************/

    protected final ExampleMatcher setAbstractFind(ExampleMatcher matcher) {
        matcher = ExampleMatcher.matching() //
                .withMatcher(MtrBienServicio_.codigoSap.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrBienServicio_.descripcion.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrBienServicio_.tipoItem.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(MtrBienServicio_.descripcionBreve.getName(), match -> match.ignoreCase().startsWith());
        return matcher;
    }

    protected abstract Sort setFindAll(Sort sort);

    protected abstract Sort setFind(MtrBienServicio req, ExampleMatcher matcher, Example<MtrBienServicio> example, Sort sort);

    protected abstract void setFindPaginated(PageRequestByExample<MtrBienServicio> req, ExampleMatcher matcher, Example<MtrBienServicio> example);

    protected final MtrBienServicio setObtenerBeanResponse(MtrBienServicioResponse bean) {
        return bean.getBean();
    }

    protected final Class<MtrBienServicio> setObtenerClassBean() {
        return MtrBienServicio.class;
    }

    protected List<Predicate> setAbstractPredicate(MtrBienServicioResponse bean, CriteriaBuilder cb, Root<MtrBienServicio> root) {
        List<Predicate> predicates = new ArrayList<>();
        MtrBienServicio entity = bean.getBean();
        /* Obtener condiciones */
        PredicateUtils.addPredicates(predicates, bean.getIdCondicion(), "id", entity.getId(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getCodigoSapCondicion(), "codigoSap", entity.getCodigoSap(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getDescripcionCondicion(), "descripcion", entity.getDescripcion(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getTipoItemCondicion(), "tipoItem", entity.getTipoItem(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getDescripcionBreveCondicion(), "descripcionBreve", entity.getDescripcionBreve(), cb, root);
        //PredicateUtils.addPredicates(predicates, bean.getMtrGrupoArticuloCondicion(), "mtrGrupoArticulo", entity.getMtrGrupoArticulo(), cb, root);
        //PredicateUtils.addPredicates(predicates, bean.getMtrUnidadMedidaCondicion(), "mtrUnidadMedida", entity.getMtrUnidadMedida(), cb, root);
        /* Obtener valores de Lista */
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "id", bean.getIdList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "codigoSap", bean.getCodigoSapList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "descripcion", bean.getDescripcionList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "tipoItem", bean.getTipoItemList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "descripcionBreve", bean.getDescripcionBreveList(), cb, root);
        //PredicateUtils.addPredicatesListValorBean(predicates, "mtrGrupoArticulo", bean.getMtrGrupoArticuloList(), cb, root);
        //PredicateUtils.addPredicatesListValorBean(predicates, "mtrUnidadMedida", bean.getMtrUnidadMedidaList(), cb, root);
        return predicates;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected final String validacionesPrevias(MtrBienServicio bean) throws Exception {
        String mensaje = "";
        if (!Optional.of(bean.getCodigoSap()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrBienServicio.codigoSap.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getDescripcion()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrBienServicio.descripcion.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getTipoItem()).isPresent()) {
            String msg = this.messageSource.getMessage("message.mtrBienServicio.tipoItem.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        String msg = this.setValidacionesPrevias(bean);
        if (StringUtils.isNotBlank(msg)) {
            mensaje += "* " + msg + "<br/>";
        }
        return mensaje;
    }

    protected String setValidacionesPrevias(MtrBienServicio bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected String validacionesPreviasCreate(MtrBienServicio bean) throws Exception {
        String msg = null;
        MtrBienServicio validar = null;
        validar = this.mtrBienServicioDeltaRepository.getByCodigoSap(bean.getCodigoSap());
        if (Optional.ofNullable(validar).isPresent()) {
            msg = this.messageSource.getMessage("message.mtrBienServicio.codigoSap.duplicado", null, LocaleContextHolder.getLocale());
            return msg;
        }
        return msg;
    }

    protected String validacionesPreviasSave(MtrBienServicio bean) throws Exception {
        String msg = null;
        MtrBienServicio validar = null;
        validar = this.mtrBienServicioDeltaRepository.getByCodigoSap(bean.getCodigoSap());
        if (Optional.ofNullable(validar).isPresent()) {
            if (bean.getId().intValue() != validar.getId().intValue()) {
                msg = this.messageSource.getMessage("message.mtrBienServicio.codigoSap.duplicado", null, LocaleContextHolder.getLocale());
                return msg;
            }
        }
        return msg;
    }

    protected MtrBienServicio completarDatosBean(MtrBienServicio bean) throws Exception {
        BigDecimal data = new BigDecimal(0.00);
        bean = this.setCompletarDatosBean(bean);
        return bean;
    }

    protected MtrBienServicio setCompletarDatosBean(MtrBienServicio bean) throws Exception {
        return bean;
    }

    protected final MtrBienServicio setAbstractCreate(MtrBienServicio dto) throws Exception {
        MtrBienServicio bean = new MtrBienServicio();
        bean = (MtrBienServicio) BeanUtils.cloneBean(dto);
        return bean;
    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrBienServicio setUploadExcel(Cell currentCell, MtrBienServicio mtrBienServicio, int contador) throws Exception {
        Double valorDouble = new Double(0);
        BigDecimal valorDecimal = new BigDecimal(0);
        Boolean valorBoolean = new Boolean(true);
        String valorCadena = "";
        switch (contador) {
        case 1:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 18) {
                    throw new ServiceException("Valor Campo codigoSap contiene mas de 18 caracter(es)");
                }
                mtrBienServicio.setCodigoSap(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo codigoSap está en formato incorrecto");
            }
            break;
        case 2:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 80) {
                    throw new ServiceException("Valor Campo descripcion contiene mas de 80 caracter(es)");
                }
                mtrBienServicio.setDescripcion(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo descripcion está en formato incorrecto");
            }
            break;
        case 3:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 1) {
                    throw new ServiceException("Valor Campo tipoItem contiene mas de 1 caracter(es)");
                }
                mtrBienServicio.setTipoItem(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo tipoItem está en formato incorrecto");
            }
            break;
        case 4:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 40) {
                    throw new ServiceException("Valor Campo descripcionBreve contiene mas de 40 caracter(es)");
                }
                mtrBienServicio.setDescripcionBreve(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo descripcionBreve está en formato incorrecto");
            }
            break;
        default:
            break;
        }
        return mtrBienServicio;
    }

    protected AppParametria setObtenerRegistroConfiguracionUploadExcel() {
        AppParametria appParametriaData = this.appParametriaDeltaRepository.getByModuloAndLabelAndStatus(AppParametriaModuloEnum.CARGA_EXCEL.getEstado(),
                AppParametriaLabelEnum.INICIO_REGISTRO_DATA.getEstado(), Constants.ESTADO_ACTIVO);
        return appParametriaData;
    }

    protected MtrBienServicio setInicializarBeanUpdateExcel() {
        MtrBienServicio bean = new MtrBienServicio();
        bean.setId(null);
        return bean;
    }

    protected final Integer setObtenerId(MtrBienServicio bean) {
        return bean.getId();
    }

    /************************/
    /* Instancia de Bean    */
    /************************/

    protected final MtrBienServicio createInstance() {
        MtrBienServicio mtrBienServicio = new MtrBienServicio();
        return mtrBienServicio;
    }

    protected final BeanCargaMasivoDTO<MtrBienServicio> createInstanceMasivoDTO() {
        BeanCargaMasivoDTO<MtrBienServicio> beanCargaMasivoDTO = new BeanCargaMasivoDTO<MtrBienServicio>();
        return beanCargaMasivoDTO;

    }

    protected final BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrBienServicio>> createInstanceListaMasivoDTO() {
        BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrBienServicio>> beanCargaMasivoDTOBeanListaMasivoDTO = new BeanListaMasivoDTO<BeanCargaMasivoDTO<MtrBienServicio>>();
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

    protected int setAbstractDownloadExcel(MtrBienServicio bean, HSSFRow dataRow) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoSap(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcion(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getTipoItem(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcionBreve(), dataRow.createCell(contador));
        contador++;
        return contador;
    }

    protected int setAbstractDownloadExcelSXLSX(MtrBienServicio bean, Row dataRow, List<CellStyle> cellStyleList) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador), "I", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoSap(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcion(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getTipoItem(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcionBreve(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        return contador;
    }

    protected String setAbstractGenerateInsertExcelSXLSX(MtrBienServicio bean) {
        String fechaS = "";
        String sqlInsert = "INSERT INTO mtr_bien_servicio(";
        sqlInsert = sqlInsert + "mtr_bien_servicio_id" + ", ";
        sqlInsert = sqlInsert + "codigo_sap" + ", ";
        sqlInsert = sqlInsert + "descripcion" + ", ";
        sqlInsert = sqlInsert + "tipo_item" + ", ";
        sqlInsert = sqlInsert + "descripcion_breve" + ", ";
        sqlInsert = sqlInsert + "mtr_grupo_articulo_id" + ", ";
        sqlInsert = sqlInsert + "mtr_unidad_medida_id" + ")";
        sqlInsert = sqlInsert + " VALUES (";
        sqlInsert = sqlInsert + bean.getId() + ", ";
        if (StringUtils.isBlank(bean.getCodigoSap())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getCodigoSap() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getDescripcion())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getDescripcion() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getTipoItem())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getTipoItem() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getDescripcionBreve())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getDescripcionBreve() + "'" + ", ";
        }
        sqlInsert = sqlInsert + bean.getMtrGrupoArticulo().getId() + ", ";
        sqlInsert = sqlInsert + bean.getMtrUnidadMedida().getId();
        sqlInsert = sqlInsert + " );";
        return sqlInsert;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    public Long countByMtrGrupoArticulo(MtrGrupoArticulo mtrGrupoArticulo) {
        return this.mtrBienServicioDeltaRepository.countByMtrGrupoArticulo(mtrGrupoArticulo);
    }

    public GraphBean graphByMtrGrupoArticulo() {
        List<MtrGrupoArticulo> lista = this.mtrGrupoArticuloDeltaRepository.findAll();
        if (lista == null || lista.size() <= 0) {
            return null;
        }
        GraphBean graphBean = new GraphBean();

        /* Obteniendo Pie Chart */
        GraphPieChart graphPieChart = new GraphPieChart();
        GraphDataset graphDataset = new GraphDataset();
        GraphDataset[] listaGraphDataset = new GraphDataset[1];
        Long[] data = new Long[lista.size()];
        String[] labels = new String[lista.size()];
        String[] backgroundColor = new String[lista.size()];
        String[] hoverBackgroundColor = new String[lista.size()];
        String[] borderColor = new String[lista.size()];
        String[] hoverBorderColor = new String[lista.size()];
        int contador = 0;
        int contadorColor = 0;
        for (MtrGrupoArticulo bean : lista) {
            Long valor = this.mtrBienServicioDeltaRepository.countByMtrGrupoArticulo(bean);
            String descripcion = this.setGraphDescripcionByMtrGrupoArticulo(bean);
            data[contador] = valor;
            labels[contador] = descripcion;
            backgroundColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }
        }
        String titulo = this.setGraphPieChartTituloByMtrGrupoArticulo();
        graphDataset.setLabel(titulo);
        graphDataset.setData(data);
        graphDataset.setBackgroundColor(backgroundColor);
        graphDataset.setHoverBackgroundColor(hoverBackgroundColor);
        listaGraphDataset[0] = graphDataset;
        graphPieChart.setDatasets(listaGraphDataset);
        graphPieChart.setLabels(labels);
        graphBean.setPiechart(graphPieChart);

        GraphBarChart graphBarChart = new GraphBarChart();
        GraphDataset[] listaGraphDatasetBar = new GraphDataset[lista.size()];
        String[] labelsBar = new String[1];
        labelsBar[0] = this.setGraphBarChartTituloByMtrGrupoArticulo();
        contador = 0;
        contadorColor = 0;
        for (MtrGrupoArticulo bean : lista) {
            Long valor = this.mtrBienServicioDeltaRepository.countByMtrGrupoArticulo(bean);
            String descripcion = this.setGraphDescripcionByMtrGrupoArticulo(bean);
            GraphDataset graphDatasetBar = new GraphDataset();
            Long[] dataBar = new Long[1];

            String[] backgroundColorBar = new String[1];
            String[] hoverBackgroundColorBar = new String[1];
            String[] borderColorBar = new String[1];
            String[] hoverBorderColorBar = new String[1];

            dataBar[0] = valor;
            backgroundColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];

            graphDatasetBar.setLabel(descripcion);
            graphDatasetBar.setData(dataBar);
            graphDatasetBar.setBackgroundColor(backgroundColorBar);
            graphDatasetBar.setHoverBackgroundColor(hoverBackgroundColorBar);
            graphDatasetBar.setBorderColor(borderColorBar);
            graphDatasetBar.setHoverBorderColor(hoverBorderColorBar);
            listaGraphDatasetBar[contador] = graphDatasetBar;

            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }

        }
        graphBarChart.setDatasets(listaGraphDatasetBar);
        graphBarChart.setLabels(labelsBar);
        graphBean.setBarchart(graphBarChart);
        return graphBean;
    }

    protected String setGraphDescripcionByMtrGrupoArticulo(MtrGrupoArticulo mtrGrupoArticulo) {
        return mtrGrupoArticulo.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrGrupoArticulo() {
        return "MtrGrupoArticulo";
    }

    protected String setGraphBarChartTituloByMtrGrupoArticulo() {
        return "MtrGrupoArticulo";
    }

    public Long countByMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        return this.mtrBienServicioDeltaRepository.countByMtrUnidadMedida(mtrUnidadMedida);
    }

    public GraphBean graphByMtrUnidadMedida() {
        List<MtrUnidadMedida> lista = this.mtrUnidadMedidaDeltaRepository.findAll();
        if (lista == null || lista.size() <= 0) {
            return null;
        }
        GraphBean graphBean = new GraphBean();

        /* Obteniendo Pie Chart */
        GraphPieChart graphPieChart = new GraphPieChart();
        GraphDataset graphDataset = new GraphDataset();
        GraphDataset[] listaGraphDataset = new GraphDataset[1];
        Long[] data = new Long[lista.size()];
        String[] labels = new String[lista.size()];
        String[] backgroundColor = new String[lista.size()];
        String[] hoverBackgroundColor = new String[lista.size()];
        String[] borderColor = new String[lista.size()];
        String[] hoverBorderColor = new String[lista.size()];
        int contador = 0;
        int contadorColor = 0;
        for (MtrUnidadMedida bean : lista) {
            Long valor = this.mtrBienServicioDeltaRepository.countByMtrUnidadMedida(bean);
            String descripcion = this.setGraphDescripcionByMtrUnidadMedida(bean);
            data[contador] = valor;
            labels[contador] = descripcion;
            backgroundColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }
        }
        String titulo = this.setGraphPieChartTituloByMtrUnidadMedida();
        graphDataset.setLabel(titulo);
        graphDataset.setData(data);
        graphDataset.setBackgroundColor(backgroundColor);
        graphDataset.setHoverBackgroundColor(hoverBackgroundColor);
        listaGraphDataset[0] = graphDataset;
        graphPieChart.setDatasets(listaGraphDataset);
        graphPieChart.setLabels(labels);
        graphBean.setPiechart(graphPieChart);

        GraphBarChart graphBarChart = new GraphBarChart();
        GraphDataset[] listaGraphDatasetBar = new GraphDataset[lista.size()];
        String[] labelsBar = new String[1];
        labelsBar[0] = this.setGraphBarChartTituloByMtrUnidadMedida();
        contador = 0;
        contadorColor = 0;
        for (MtrUnidadMedida bean : lista) {
            Long valor = this.mtrBienServicioDeltaRepository.countByMtrUnidadMedida(bean);
            String descripcion = this.setGraphDescripcionByMtrUnidadMedida(bean);
            GraphDataset graphDatasetBar = new GraphDataset();
            Long[] dataBar = new Long[1];

            String[] backgroundColorBar = new String[1];
            String[] hoverBackgroundColorBar = new String[1];
            String[] borderColorBar = new String[1];
            String[] hoverBorderColorBar = new String[1];

            dataBar[0] = valor;
            backgroundColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];

            graphDatasetBar.setLabel(descripcion);
            graphDatasetBar.setData(dataBar);
            graphDatasetBar.setBackgroundColor(backgroundColorBar);
            graphDatasetBar.setHoverBackgroundColor(hoverBackgroundColorBar);
            graphDatasetBar.setBorderColor(borderColorBar);
            graphDatasetBar.setHoverBorderColor(hoverBorderColorBar);
            listaGraphDatasetBar[contador] = graphDatasetBar;

            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }

        }
        graphBarChart.setDatasets(listaGraphDatasetBar);
        graphBarChart.setLabels(labelsBar);
        graphBean.setBarchart(graphBarChart);
        return graphBean;
    }

    protected String setGraphDescripcionByMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        return mtrUnidadMedida.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrUnidadMedida() {
        return "MtrUnidadMedida";
    }

    protected String setGraphBarChartTituloByMtrUnidadMedida() {
        return "MtrUnidadMedida";
    }

}
