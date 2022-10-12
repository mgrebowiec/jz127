package sda.mg.jz127.mapsample;

import java.util.HashMap;
import java.util.Map;

public class MapFirstExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("michal", 35);
        map.put("jan", 28);
        map.put("magda", 21);

        for(String key : map.keySet()) {
            System.out.printf("klucz: %s; wartosc: %s\n", key, map.get(key));
        }

        System.out.println("Wszystkie elementy mapy przy uzyciu typu Entry");
        for(Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.printf("klucz: %s; wartosc: %s\n", pair.getKey(), pair.getValue());
        }

        System.out.println("----- Wszystkie wartosci (nie cale elementy) -------");
        for(Integer value : map.values()) {
            System.out.printf("wartosc: %d\n", value);
        }

        map.remove("jan");
        System.out.println("Wszystkie elementy mapy po usunieciu elementu o kluczu jan");
        for(Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.printf("klucz: %s; wartosc: %s\n", pair.getKey(), pair.getValue());
        }

    }
}
