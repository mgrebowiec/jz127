package sda.mg.jz127.enumsample;

public enum Continent implements WithName {
    AFRICA("Afryka", 200),
    ASIA("Azja", 201),
    EUROPE("Europa", 100),
    AUSTRALIA("Australia", 102),
    NORTH_AMERICA("Ameryka Polnocna", 198),
    SOUTH_AMERICA("Ameryka poludniowa", 180),
    ANTARCTIDA("Antakrtyda", 150)
    ;

    private final String name;
    private final double area;

    Continent(String name, double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public String getName() {
        return name;
    }

    public static Continent getLargest() {
        Continent result = null;
        for (Continent continent : values()) {
            if (result == null || result.area < continent.area) {
                result = continent;
            }
        }
        return result;
    }

    public static Continent getSmallest() {
        Continent result = null;
        for (Continent continent : values()) {
            if (result == null || result.area > continent.area) {
                result = continent;
            }
        }
        return result;
    }
}
