package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }
   
    @Test
    public void testAgregar(){
        System.out.println("TestAgregar");
        Datos datos = new Datos("db01", "Datos");
        BasedeDatos instance = new BasedeDatos();
        Assert.assertTrue(instance.agregar(datos));
        
    }
    
}
