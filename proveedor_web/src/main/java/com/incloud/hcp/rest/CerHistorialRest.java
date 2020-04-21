/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/rest/EntityResource.java.e.vm
 */
package com.incloud.hcp.rest;

import com.incloud.hcp.common.BindingErrorsResponse;
import com.incloud.hcp.common.graph.GraphBean;
import com.incloud.hcp.domain.CerCertificado;
import com.incloud.hcp.domain.CerHistorial;
import com.incloud.hcp.domain.MtrEstado;
import com.incloud.hcp.domain.response.CerHistorialResponse;
import com.incloud.hcp.repository.delta.CerHistorialDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import com.incloud.hcp.service.delta.CerHistorialDeltaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public abstract class CerHistorialRest extends JPACustomRest<CerHistorialResponse, CerHistorial, Integer> {

    @Autowired
    protected CerHistorialDeltaService cerHistorialDeltaService;

    @Autowired
    protected CerHistorialDeltaRepository cerHistorialDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "CerHistorial";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final CerHistorial createInstance() {
        CerHistorial cerHistorial = new CerHistorial();
        return cerHistorial;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    /**
    * Contador de registros para el atributo mtrEstado.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrEstado", produces = "application/json")
    @PostMapping(value = "/countByMtrEstado", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrEstado(@RequestBody @Valid MtrEstado mtrEstado, BindingResult bindingResult) throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrEstado");
        try {
            return Optional.ofNullable(this.cerHistorialDeltaService.countByMtrEstado(mtrEstado)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrEstado.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrEstado", produces = "application/json")
    @GetMapping(value = "/graphByMtrEstado", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrEstado() throws URISyntaxException {
        log.debug("Ingresando graphByMtrEstado");
        try {
            return Optional.ofNullable(this.cerHistorialDeltaService.graphByMtrEstado()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo cerCertificado.
    */
    @ApiOperation(value = "Contador de registros para el atributo cerCertificado", produces = "application/json")
    @PostMapping(value = "/countByCerCertificado", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByCerCertificado(@RequestBody @Valid CerCertificado cerCertificado, BindingResult bindingResult)
            throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByCerCertificado");
        try {
            return Optional.ofNullable(this.cerHistorialDeltaService.countByCerCertificado(cerCertificado)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo cerCertificado.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo cerCertificado", produces = "application/json")
    @GetMapping(value = "/graphByCerCertificado", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByCerCertificado() throws URISyntaxException {
        log.debug("Ingresando graphByCerCertificado");
        try {
            return Optional.ofNullable(this.cerHistorialDeltaService.graphByCerCertificado()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

}
