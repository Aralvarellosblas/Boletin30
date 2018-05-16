package ejercicio30;

/**
 *
 * @author Arturo
 */
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(){
    }

    public Futbolista(int id, int edad, String nombre, String apellidos,int dorsal, String demarcacion){
        super(id, edad, nombre, apellidos);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public int getDorsal(){
        return dorsal;
    }

    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }

    public String getDemarcacion(){
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion){
        this.demarcacion=demarcacion;
    }

    @Override
    public String toString(){
        return super.toString()+" Futbolista "+"dorsal="+dorsal+", demarcacion="+demarcacion;
    }
    
    public void entrevista(){
        System.out.println("El futbolista da una entrevista");
    }

    @Override
    public void concentrarse(){
        System.out.println("El futbolista se concentra");
    }

    @Override
    public void viajar(){
        System.out.println("El futbolista viaja");
    }

    @Override
    public void entrenar(){
        System.out.println("El futbolista entrena");
    }

    @Override
    public void jugarPartido(){
        System.out.println("El futbolista juega el partido");
    }
}
