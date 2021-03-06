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

import com.incloud.hcp.domain.MtrDetraccion;
import com.incloud.hcp.domain.response.MtrDetraccionResponse;
import com.incloud.hcp.repository.delta.MtrDetraccionDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MtrDetraccionRest extends JPACustomRest<MtrDetraccionResponse, MtrDetraccion, Integer> {

    @Autowired
    protected MtrDetraccionDeltaRepository mtrDetraccionDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "MtrDetraccion";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final MtrDetraccion createInstance() {
        MtrDetraccion mtrDetraccion = new MtrDetraccion();
        return mtrDetraccion;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
