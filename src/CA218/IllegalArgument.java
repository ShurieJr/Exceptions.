package CA218;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IllegalArgument {
    //variabele
    static int age;
    public static void main(String[] args) throws FileNotFoundException {
        readFile("somalia");
        setAge(-3);
        System.out.println("age = " + age);
    }

    //setAge
    public static void setAge(int newAge) throws IllegalArgumentException {
        if (age > 0) {
            age = newAge;
        }
        else{
            throw new IllegalArgumentException("Age must be greater than zero");
        }
    } //unchecked

    //file readings
    public static void readFile(String path) throws FileNotFoundException {     //checked excpetion
        File file = new File(path);
        FileInputStream is = new FileInputStream(file);
    }
}
