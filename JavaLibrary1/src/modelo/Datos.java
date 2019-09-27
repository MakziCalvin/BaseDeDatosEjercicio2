package modelo;
public class Datos {
    //ATRIBUTOS
    private String id;
    private Object data;
    
    //CONSTRUCTORES
    public Datos(String id, Object data){
        this.id= id;
        this.data= data;
    }   
    //GETTER AND SETTER

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    
    
    
    
}
