package ejercicio30;

/**
 *
 * @author Arturo
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador(){
    }

    public Seleccionador(int id, int edad, String nombre, String apellidos){
        super(id, edad, nombre, apellidos);
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
    public void selecionarXogador(){
        System.out.println("Selecionado un xogador");
    }
    @Override
    public void concentrarse(){
        System.out.println("El seleccionador se concentra");
    }

    @Override
    public void viajar(){
        System.out.println("El seleccionador viaja");
    }

    @Override
    public void entrenar(){
        System.out.println("El selecionador no entrena");
    }

    @Override
    public void jugarPartido(){
        System.out.println("El selecionador no juega");
    }
    
}
