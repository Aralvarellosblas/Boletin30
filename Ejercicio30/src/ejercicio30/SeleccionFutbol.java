package ejercicio30;

/**
 *
 * @author Arturo
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{

    private int id;
    private int edad;
    private String nombre;
    private String apellidos;

    public SeleccionFutbol(){
    }

    public SeleccionFutbol(int id, int edad, String nombre, String apellidos){
        this.id=id;
        this.edad=edad;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }

    @Override
    public String toString(){
        return "Persona "+"id="+id+", edad="+edad+", nombre="+nombre+", apellidos="+apellidos+" -> ";
    }
    

}
