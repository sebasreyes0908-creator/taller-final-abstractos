public class Main {
    public static void main(String[] args) {
        Animal[] animales = { new Perro("Firulais"), new Gato("Michi"), new Vaca("Lola") };

        for (Animal a : animales) {
            a.presentarse();
        }
    }
}
