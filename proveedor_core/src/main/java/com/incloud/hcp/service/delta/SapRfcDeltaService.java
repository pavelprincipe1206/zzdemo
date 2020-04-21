/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntitydeltaDTO.java.e.vm
 */
package com.incloud.hcp.service.delta;

import com.incloud.hcp.bean.custom.*;
import com.incloud.hcp.service.SapRfcService;

import java.util.List;

/**
 * Simple Interface for AppParametria.
 */
public interface SapRfcDeltaService extends SapRfcService {
   List<DescargaServicioSap> listaDescarga(List<RangeSap> rangeDoc, List<RangeSap> rangeFecha);
   List<DescargaServicioSap> listaDescargaDetalle(List<RangeSap> rangeDoc, List<RangeSap> rangeFecha);
   List<RemitoOutSap> creacionHes(List<RemitoInSap> listaIn);
   List<RemitoOutSap> crearHes(List<RemitoInSap> listaIn);
   List<TextClaseDocSap> listaClaseDocumentos();
   List<CentroSap> listaCentroSap(String bukrs);
   List<CentroAlmacenSap> listaCentroAlmacen(String sociedad);
    List<MensajeSap> integrarUnidadMedida();
   List<MensajeSap> integrarGrupoArticulos(String piMatkl);
   List<MensajeSap> integrarServicios(String fechaInicial, String fechaFinal);
   List<MensajeSap> integrarMateriales(String fechaInicial, String fechaFinal);
   List<MensajeSap> integrarProveedor(String fechaInicial, String fechaFinal, String lifnr);
   MensajeSap integrarAprobadores();
   List<DescargaServicioSap> integraTextosPedido(List<RangeSap> rangeDoc, List<RangeSap> rangeFecha);

   List<MensajeSap> integrarCuentaImputacion(Integer rangoMenor, Integer rangoMayor, String tipoImputacion, String codigoSap);

   List<MensajeSap> integrarCuentaMayor(Integer rangoMenor, Integer rangoMayor, String codigoSap);
   MensajeSap integrarNotaPedido(List<RangeSap> rangeDoc, List<RangeSap> rangeFecha);
}
