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
import com.incloud.hcp.domain.CerFirma;
import com.incloud.hcp.domain.CerNotaPedido;
import com.incloud.hcp.domain.MtrAprobador;
import com.incloud.hcp.domain.MtrTipoFirma;
import com.incloud.hcp.domain.response.CerFirmaResponse;
import com.incloud.hcp.repository.delta.CerFirmaDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import com.incloud.hcp.service.delta.CerFirmaDeltaService;
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

public abstract class CerFirmaRest extends JPACustomRest<CerFirmaResponse, CerFirma, Integer> {

    @Autowired
    protected CerFirmaDeltaService cerFirmaDeltaService;

    @Autowired
    protected CerFirmaDeltaRepository cerFirmaDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "CerFirma";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final CerFirma createInstance() {
        CerFirma cerFirma = new CerFirma();
        return cerFirma;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    /**
    * Contador de registros para el atributo cerNotaPedido.
    */
    @ApiOperation(value = "Contador de registros para el atributo cerNotaPedido", produces = "application/json")
    @PostMapping(value = "/countByCerNotaPedido", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByCerNotaPedido(@RequestBody @Valid CerNotaPedido cerNotaPedido, BindingResult bindingResult) throws URISyntaxException {
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
        log.debug("Ingresando countByCerNotaPedido");
        try {
            return Optional.ofNullable(this.cerFirmaDeltaService.countByCerNotaPedido(cerNotaPedido)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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
    * Genera Grafico de registros para el atributo cerNotaPedido.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo cerNotaPedido", produces = "application/json")
    @GetMapping(value = "/graphByCerNotaPedido", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByCerNotaPedido() throws URISyntaxException {
        log.debug("Ingresando graphByCerNotaPedido");
        try {
            return Optional.ofNullable(this.cerFirmaDeltaService.graphByCerNotaPedido()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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
    * Contador de registros para el atributo mtrAprobador.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrAprobador", produces = "application/json")
    @PostMapping(value = "/countByMtrAprobador", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrAprobador(@RequestBody @Valid MtrAprobador mtrAprobador, BindingResult bindingResult) throws URISyntaxException {
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
        log.debug("Ingresando countByMtrAprobador");
        try {
            return Optional.ofNullable(this.cerFirmaDeltaService.countByMtrAprobador(mtrAprobador)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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
    * Genera Grafico de registros para el atributo mtrAprobador.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrAprobador", produces = "application/json")
    @GetMapping(value = "/graphByMtrAprobador", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrAprobador() throws URISyntaxException {
        log.debug("Ingresando graphByMtrAprobador");
        try {
            return Optional.ofNullable(this.cerFirmaDeltaService.graphByMtrAprobador()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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
    * Contador de registros para el atributo mtrTipoFirma.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrTipoFirma", produces = "application/json")
    @PostMapping(value = "/countByMtrTipoFirma", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrTipoFirma(@RequestBody @Valid MtrTipoFirma mtrTipoFirma, BindingResult bindingResult) throws URISyntaxException {
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
        log.debug("Ingresando countByMtrTipoFirma");
        try {
            return Optional.ofNullable(this.cerFirmaDeltaService.countByMtrTipoFirma(mtrTipoFirma)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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
    * Genera Grafico de registros para el atributo mtrTipoFirma.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrTipoFirma", produces = "application/json")
    @GetMapping(value = "/graphByMtrTipoFirma", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrTipoFirma() throws URISyntaxException {
        log.debug("Ingresando graphByMtrTipoFirma");
        try {
            return Optional.ofNullable(this.cerFirmaDeltaService.graphByMtrTipoFirma()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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
