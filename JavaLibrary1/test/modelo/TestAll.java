/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Matzi
 */
@RunWith(Suite.class)
@SuiteClasses({
TestAgregar.class,TestEliminar.class,TestListar.class,TestModificar.class
})
public class TestAll {

    public TestAll() {
    }
    
}
