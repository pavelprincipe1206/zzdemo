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

import com.incloud.hcp.domain.MtrAreaTrabajo;
import com.incloud.hcp.domain.response.MtrAreaTrabajoResponse;
import com.incloud.hcp.repository.delta.MtrAreaTrabajoDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URISyntaxException;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public abstract class MtrAreaTrabajoRest extends JPACustomRest<MtrAreaTrabajoResponse, MtrAreaTrabajo, Integer> {

    @Autowired
    protected MtrAreaTrabajoDeltaRepository mtrAreaTrabajoDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "MtrAreaTrabajo";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final MtrAreaTrabajo createInstance() {
        MtrAreaTrabajo mtrAreaTrabajo = new MtrAreaTrabajo();
        return mtrAreaTrabajo;
    }

    /**
     * Find by por codigoAreaTrabajo
     */
    @ApiOperation(value = "Busca registro de tipo <T> en base a codigoAreaTrabajo", produces = "application/json")
    @GetMapping(value = "/_getByCodigoAreaTrabajo/{codigoAreaTrabajo}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<MtrAreaTrabajo> getByCodigoAreaTrabajo(@PathVariable String codigoAreaTrabajo) throws URISyntaxException {
        log.debug(this.NOMBRE_CLASE + " - Ingresando getByCodigoAreaTrabajo: " + codigoAreaTrabajo);
        try {
            return Optional.ofNullable(this.mtrAreaTrabajoDeltaRepository.getByCodigoAreaTrabajo(codigoAreaTrabajo))
                    .map(bean -> new ResponseEntity<>(bean, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Find by por descripcion
     */
    @ApiOperation(value = "Busca registro de tipo <T> en base a descripcion", produces = "application/json")
    @GetMapping(value = "/_getByDescripcion/{descripcion}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<MtrAreaTrabajo> getByDescripcion(@PathVariable String descripcion) throws URISyntaxException {
        log.debug(this.NOMBRE_CLASE + " - Ingresando getByDescripcion: " + descripcion);
        try {
            return Optional.ofNullable(this.mtrAreaTrabajoDeltaRepository.getByDescripcion(descripcion)).map(bean -> new ResponseEntity<>(bean, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
