package java_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = -1503252402544036183L;
    String name;
    transient String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person [job=" + job + ", name=" + name + "]";
    }

}

public class SerializationTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Person personAhn = new Person("안재용", "대표이사");
        Person personKim = new Person("김철수", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial2.out");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // 직렬화 : personAhn과 personKim의 값을 파일에 씀
            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial2.out");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            // 역직렬화 : personAhn과 personKim의 값을 파일에서 읽어들임
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}