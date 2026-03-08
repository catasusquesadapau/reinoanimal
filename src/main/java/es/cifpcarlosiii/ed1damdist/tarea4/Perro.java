package es.cifpcarlosiii.ed1damdist.tarea4;
/**
 * Clase que representa un perro, hereda de Mamifero.
 * Los perros son mamíferos domésticos conocidos por su lealtad y inteligencia.
 */
public class Perro extends Mamifero {

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.ToString());
    }

}
