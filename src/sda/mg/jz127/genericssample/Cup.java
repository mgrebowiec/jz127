package sda.mg.jz127.genericssample;

// Literka D jest nazwą naszego typu generycznego i może to być dowolna litera np. A, B, C, T, itp.
public class Cup<D> {
    private final D liquid;

    public Cup(D liquid) {
        this.liquid = liquid;
    }

    public void drink() {
        System.out.println("Drinking " + liquid);
    }
}
