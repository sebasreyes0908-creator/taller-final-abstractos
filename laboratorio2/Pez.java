// Reto extra: sin emitirSonido() el compilador da el error:
// "Pez is not abstract and does not override abstract method emitirSonido() in Animal"
// Forma 1 (la usada aqui): implementar el metodo.
// Forma 2: declarar la clase como "public abstract class Pez", pero asi ya no se puede hacer new Pez(...).
public class Pez extends Animal {

    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Glu glu";
    }
}
