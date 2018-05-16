package ejercicio30;

/**
 *
 * @author Arturo
 */
public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador(){
    }

    public Entrenador(int id, int edad, String nombre, String apellidos,int idFederacion){
        super(id, edad, nombre, apellidos);
        this.idFederacion=idFederacion;
    }

    public int getIdFederacion(){
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion){
        this.idFederacion=idFederacion;
    }

    @Override
    public String toString(){
        return super.toString()+" Entrenador "+"idFederacion="+idFederacion;
    }

    
    public void planificarEntrenamiento(){
        System.out.println("Entrenamiento planificado");
    }

    @Override
    public void concentrarse(){
        System.out.println("El Entrenador se concentra");
    }

    @Override
    public void viajar(){
        System.out.println("El entrenacor viaja");
    }

    @Override
    public void entrenar(){
        System.out.println("El entrenador entrena");
    }

    @Override
    public void jugarPartido(){
        System.out.println("El entrenador no juega");
    }
}
