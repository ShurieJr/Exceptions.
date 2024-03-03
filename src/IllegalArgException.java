public class IllegalArgException {
   static int age;  // default value 0

    public static void main(String[] args) {
        setAge(-1);
        System.out.println("Age: " + age);
    }

    //setAge
    public static void setAge(int newAge) throws IllegalArgumentException {
      if( newAge > 0)
       age = newAge;
      else
          System.out.println("EXCEPTION: Age must be greater than Zero");
    }
}
