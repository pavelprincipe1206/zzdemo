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

import com.incloud.hcp.domain.MtrCentroAlmacen;
import com.incloud.hcp.domain.response.MtrCentroAlmacenResponse;
import com.incloud.hcp.repository.delta.MtrCentroAlmacenDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MtrCentroAlmacenRest extends JPACustomRest<MtrCentroAlmacenResponse, MtrCentroAlmacen, Integer> {

    @Autowired
    protected MtrCentroAlmacenDeltaRepository mtrCentroAlmacenDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "MtrCentroAlmacen";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final MtrCentroAlmacen createInstance() {
        MtrCentroAlmacen mtrCentroAlmacen = new MtrCentroAlmacen();
        return mtrCentroAlmacen;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
