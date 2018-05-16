package ejercicio30;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arturo
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<SeleccionFutbol> seleccion = new ArrayList();
        seleccion.add(new Futbolista(0001,25,"Juan","Gomez",11,"Defensa"));
        seleccion.add(new Entrenador(0002,45,"Manuel","Fuentes",6985));
        seleccion.add(new Masajista(0003,33,"Luis","Rodriguez",18,"Fisioterapia"));
        seleccion.add(new Seleccionador(0005,55,"Pedro","Sanchez"));
        for (int i = 0; i<seleccion.size(); i++) {
            seleccion.get(i).concentrarse();
            seleccion.get(i).viajar();
            seleccion.get(i).entrenar();
            seleccion.get(i).jugarPartido();
            System.out.println("\n");
        }
        seleccion.stream().forEach(sl -> System.out.println(sl));
    }

}
