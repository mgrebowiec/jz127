package sda.mg.jz127.serialization;

import java.io.*;

public class HumanService {

    public static void main(String[] args) {
        Human michal = new Human("michal", "grebowiec");
        persistHuman(michal);

        System.out.println("-------------");
        Human loadedHuman = loadHuman();
        System.out.println(loadedHuman);

    }

    public static Human loadHuman() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("human.dat"))) {
            return (Human)in.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void persistHuman(Human human) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("human.dat"))) {
            out.writeObject(human);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
