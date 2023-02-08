package SavingObjects_SerializeAndDeserialize;

import java.io.*;

class Animal implements Serializable{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class SerialStorageObjects implements Serializable {
    public void StoreSerial(Animal animal) {
        try {
            FileOutputStream file = new FileOutputStream("TekionPeople.ser");
            ObjectOutputStream os = new ObjectOutputStream(file);
            os.writeObject(animal);
            os.close();
            System.out.println("Success");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

class Deserialize {
    static File newFile = new File("f.txt");
    public void deSerialize() {
        System.out.println(newFile.getName());
        try {
            ObjectInputStream obji = new ObjectInputStream(new FileInputStream(newFile));
            Animal a = (Animal) obji.readObject();
            System.out.println(String.format("Animal %s is deserialized and its id is %d", a.getName(),a.getId()));
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
public class SavingObjects {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("Cat");
        cat.setId(1);

        Animal Dog = new Animal();
        Dog.setName("Dog");
        Dog.setId(2);

        SerialStorageObjects so = new SerialStorageObjects();
        so.StoreSerial(cat);
        so.StoreSerial(Dog);

        Deserialize ds = new Deserialize();
        ds.deSerialize();


    }
}
