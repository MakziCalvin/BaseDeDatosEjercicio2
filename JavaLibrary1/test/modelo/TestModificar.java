package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("TestModificar");
        Datos datos = new Datos("db01", "Datos");
        BasedeDatos instance = new BasedeDatos();
        instance.agregar(datos);
        Assert.assertTrue(instance.modificar(datos));
    }
}
