package sda.mg.jz127.genericssample.bounded;

class Cup<T extends Liquid> {
    private final T liquid;

    Cup(T liquid) {
        this.liquid = liquid;
    }

    public void drink() {
        System.out.println("Drinking " + liquid.name());
    }
}
