package es.cifpcarlosiii.ed1damdist.tarea4;
/**
 * Clase que representa un mamífero, hereda de Animal.
 * Los mamíferos son animales vertebrados con características como pelo o glándulas mamarias.
 */
public class Mamifero extends Animal {

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.ToString());
    }
}
