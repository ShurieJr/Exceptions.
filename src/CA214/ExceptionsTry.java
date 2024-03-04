package CA214;

public class ExceptionsTry {
    public static void main(String[] args) {
      //unchecked exception
        //runtime Exception // Arithmetic exception // /by zero
       try{
           System.out.println( 2 / 2 );
           String name = "Halima";
           System.out.println(name.length());
           Person person = new Person();
           System.out.println(person.toString());

           int[] values = {1, 2, 3, 4, 5, 6};
           System.out.println(values[0]);
       }
       catch(ArithmeticException ex){
           System.out.println(ex.getMessage());
       }
       catch(NullPointerException ex){
           System.out.println(ex.getMessage());
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("final statement");
       }
    }
}
