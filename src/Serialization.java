import java.awt.*;
import java.io.*;

/**
 * Created by User on 01.02.2016.
 */
public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog1 = new Dog(5, "Boris");
        FileOutputStream fileOutputStream = new FileOutputStream("e:\\4.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("e:\\4.txt"));
        Dog dog2 = (Dog) objectInputStream.readObject();
        System.out.println(dog2);
    }

    public static class Dog implements Serializable{
        int age;
        String name;

        public Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
