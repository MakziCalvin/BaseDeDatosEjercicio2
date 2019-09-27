
package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {
    @Test
    public void testEliminar(){
        System.out.println("TestEliminar");
        String id = "db01";
        Datos datos = new Datos("db01", "Datos");
        BasedeDatos instance = new BasedeDatos();
        instance.agregar(datos);
        Assert.assertTrue(instance.eliminar(id));
    }
}
