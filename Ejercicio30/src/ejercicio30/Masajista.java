package ejercicio30;

/**
 *
 * @author Arturo
 */
public class Masajista extends SeleccionFutbol{

    private int anhosExp;
    private String titulacion;

    public Masajista(){
    }

    public Masajista(int id, int edad, String nombre, String apellidos, int añosExp, String titulacion){
        super(id, edad, nombre, apellidos);
        this.anhosExp=añosExp;
        this.titulacion=titulacion;
    }

    public int getAnhosExp(){
        return anhosExp;
    }

    public void setAnhosExp(int anhosExp){
        this.anhosExp=anhosExp;
    }

    public String getTitulacion(){
        return titulacion;
    }

    public void setTitulacion(String titulacion){
        this.titulacion=titulacion;
    }

    @Override
    public String toString(){
        return super.toString()+" Masajista "+"anhosExp="+anhosExp+", titulacion="+titulacion;
    }

    public void darMasaje(){
        System.out.println("Dando un masaje...");
    }

    @Override
    public void concentrarse(){
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar(){
        System.out.println("El masajista viaja");
    }

    @Override
    public void entrenar(){
        System.out.println("El masajista no entrena");
    }

    @Override
    public void jugarPartido(){
        System.out.println("El masajista no juega");
    }
}
