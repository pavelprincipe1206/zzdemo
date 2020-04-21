/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/rest/EntitydeltaResource.java.e.vm
 */
package com.incloud.hcp.rest.delta;

import com.incloud.hcp._security.SystemLoggedUser;
import com.incloud.hcp._security.UserSession;
import com.incloud.hcp.common.BindingErrorsResponse;
import com.incloud.hcp.domain.CerFirma;
import com.incloud.hcp.rest.CerFirmaRest;
import com.incloud.hcp.service.delta.CerFirmaDeltaService;
import com.incloud.hcp.service.dto.CerFirmaCertificadoSalidaDto;
import com.incloud.hcp.service.dto.CerFirmaEntradaDto;
import com.incloud.hcp.util.Utils;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/cerFirma")
public class CerFirmaDeltaRest extends CerFirmaRest {

    private final Logger log = LoggerFactory.getLogger(CerFirmaDeltaRest.class);

    @Autowired
    private SystemLoggedUser systemLoggedUser;

    @Autowired
    protected  CerFirmaDeltaService cerFirmaDeltaService;


    @ApiOperation(value = "Devuelve lista de Certificados Firma de acuerdo a los parametros ingresados", produces = "application/json")
    @PostMapping(value = "/_findByPorAprobador", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CerFirma>> findByPorAprobador(
            @RequestBody CerFirmaEntradaDto cerFirmaEntradaDto,
            BindingResult bindingResult
    ) throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        log.debug(this.NOMBRE_CLASE + " - Ingresando findByPorAprobador by:" + cerFirmaEntradaDto.toString());

        try {
            UserSession userSession = this.systemLoggedUser.getUserSession();
            cerFirmaEntradaDto.setUserSession(userSession);
            return Optional.ofNullable(this.cerFirmaDeltaService.findByPorAprobador(cerFirmaEntradaDto))
                    .map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        }
        catch (Exception e) {
            if (this.devuelveRuntimeException) {
                String error = Utils.obtieneMensajeErrorExceptionDepurado(e);
                throw new RuntimeException(error);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "Devuelve lista de Certificados Firma de acuerdo a los parametros ingresados", produces = "application/json")
    @PostMapping(value = "/_findByPorAprobadorCertificado", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CerFirmaCertificadoSalidaDto>> findByPorAprobadorCertificado(
            @RequestBody CerFirmaEntradaDto cerFirmaEntradaDto,
            BindingResult bindingResult
    ) throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        log.debug(this.NOMBRE_CLASE + " - Ingresando findByPorAprobadorCertificado by:" + cerFirmaEntradaDto.toString());

        try {
            UserSession userSession = this.systemLoggedUser.getUserSession();
            cerFirmaEntradaDto.setUserSession(userSession);
            return Optional.ofNullable(this.cerFirmaDeltaService.findByPorAprobadorCertificado(cerFirmaEntradaDto))
                    .map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        }
        catch (Exception e) {
            if (this.devuelveRuntimeException) {
                String error = Utils.obtieneMensajeErrorExceptionDepurado(e);
                throw new RuntimeException(error);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }


    @ApiOperation(value = "Listado Criterio CerFirma", produces = "application/json")
    @RequestMapping(value = "/listCriterioCerFirma", method = RequestMethod.POST, headers = "Accept=application/json")
    ResponseEntity<List<CerFirma>> ListCriterioCerFirma(@RequestBody CerFirma cerFirma)
            throws Exception {
        return Optional.of(new ResponseEntity<List<CerFirma>>(
                this.cerFirmaDeltaService.find(cerFirma),
                HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }





}