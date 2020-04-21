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

@StaticMetamodel(FacAprobador.class)
public abstract class FacAprobador_ {

    // Raw attributes
    public static volatile SingularAttribute<FacAprobador, Integer> id;
    public static volatile SingularAttribute<FacAprobador, String> estado;

    // Many to one
    public static volatile SingularAttribute<FacAprobador, FacFactura> facFactura;
    public static volatile SingularAttribute<FacAprobador, MtrAprobador> mtrAprobador;
}
