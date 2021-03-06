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

@StaticMetamodel(MtrProveedor.class)
public abstract class MtrProveedor_ {

    // Raw attributes
    public static volatile SingularAttribute<MtrProveedor, Integer> id;
    public static volatile SingularAttribute<MtrProveedor, String> ruc;
    public static volatile SingularAttribute<MtrProveedor, String> razonSocial;
    public static volatile SingularAttribute<MtrProveedor, String> direccion;
    public static volatile SingularAttribute<MtrProveedor, String> emailContacto;
    public static volatile SingularAttribute<MtrProveedor, String> codigoIdp;
    public static volatile SingularAttribute<MtrProveedor, String> lifnr;
}
