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

import com.incloud.hcp.domain.AppProcesoLog;
import com.incloud.hcp.domain.response.AppProcesoLogResponse;
import com.incloud.hcp.repository.delta.AppProcesoLogDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AppProcesoLogRest extends JPACustomRest<AppProcesoLogResponse, AppProcesoLog, Integer> {

    @Autowired
    protected AppProcesoLogDeltaRepository appProcesoLogDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "AppProcesoLog";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final AppProcesoLog createInstance() {
        AppProcesoLog appProcesoLog = new AppProcesoLog();
        return appProcesoLog;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
