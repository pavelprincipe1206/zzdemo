/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/EntityMeta_.java.e.vm
 */
package com.incloud.hcp.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;

@StaticMetamodel(FacImputacion.class)
public abstract class FacImputacion_ {

    // Raw attributes
    public static volatile SingularAttribute<FacImputacion, Integer> id;
    public static volatile SingularAttribute<FacImputacion, BigDecimal> valorImputacion;
    public static volatile SingularAttribute<FacImputacion, String> estado;

    // Many to one
    public static volatile SingularAttribute<FacImputacion, MtrCuentaImputacion> mtrCuentaImputacion;
    public static volatile SingularAttribute<FacImputacion, FacFactura> facFactura;
}
