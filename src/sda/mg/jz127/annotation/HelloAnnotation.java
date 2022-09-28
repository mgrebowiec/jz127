package sda.mg.jz127.annotation;

public class HelloAnnotation {

    @SampleAnnotation(message = "Jestem Michal!")
    public void hello() {
        System.out.println("Mowie czesc");
    }

    /**
     * To jest fragment dokumentacji ktora przez narzedzie javadoc bedzie wygenerowana (to nie jest adnotacja!!!)
     * @param a
     * @return
     */
    public int test(int a) {
        return a;
    }
}
