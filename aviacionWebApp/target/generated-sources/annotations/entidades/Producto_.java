package entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-11T13:04:24", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Double> precio_producto;
    public static volatile SingularAttribute<Producto, String> descripcion_producto;
    public static volatile SingularAttribute<Producto, Integer> stockDisponible_producto;
    public static volatile SingularAttribute<Producto, Integer> id_categoria;
    public static volatile SingularAttribute<Producto, String> nombre_producto;
    public static volatile SingularAttribute<Producto, Integer> id_producto;
    public static volatile SingularAttribute<Producto, Integer> uds_vendidas;

}