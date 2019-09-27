
package modelo;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {

    public TestListar() {
    }
    
    
    @Test
    public void testListar(){
        System.out.println("TestListar");
        BasedeDatos instance = new BasedeDatos();
        ArrayList<Datos> esperado = new ArrayList<Datos>();
        ArrayList<Datos> obtenido = instance.listar();
        Assert.assertEquals(esperado, obtenido);
        
                
    }
    
}
