
package modelo;

import java.util.ArrayList;

public class BasedeDatos {
 
    private ArrayList<Datos> datos;
    
    public BasedeDatos(){
        this.datos = new ArrayList<Datos>();
    }
    
    public boolean agregar(Datos dato){
        return this.datos.add(dato);
    }
    
    public boolean eliminar(String id){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Datos> listar(){
        return this.datos;
    }
    
    public boolean modificar(Datos dato){
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(dato.getId())) {
                datos.get(i).setData(dato.getData());
                return true;
            }
        }
        return false;
    }
    
    
    
}
