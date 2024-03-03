import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
  static  int age;
    public static void main(String[] args) {
//        System.out.println(" Runtime Exceptions!");
//
//        //System.out.println( 2 / 0 );  // arithmetic exception
//        test ob =null ;
//        String name = null;
//        //System.out.println(name.length()); // nullPointer exception
//       // System.out.println(ob.toString()); // nullPointer exception
//
////        int[] numbers = {12 , 22 };
////
////            System.out.println(numbers[3]); // indexoutofbounds exception
//
        setAge(-9);
    }

    //setAge

    public static void setAge(int newAge) {
      if(newAge > 0)
          age = newAge;
      else{
          //throw new IllegalArgumentException("newAge must be greater than Zero");
          System.out.println("Age must be greater than Zero");
      }
    }
}