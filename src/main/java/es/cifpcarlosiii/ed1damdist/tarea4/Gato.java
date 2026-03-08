package es.cifpcarlosiii.ed1damdist.tarea4;
/**
 * Clase que representa un gato, hereda de Mamifero.
 * Los gatos son mamíferos felinos, conocidos por su independencia y agilidad.
 */
public class Gato extends Mamifero {
    /** Número de pelos del gato */
    private int pelos;

    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.ToString());
    }

    public int getPelos() {
        return pelos;
    }

    public void setPelos(int pelos) {
        this.pelos = pelos;
    }
}
