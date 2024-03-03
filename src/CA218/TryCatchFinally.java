package CA218;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println( 2 / 2 );

            String name = "ali";
            System.out.println(name.length() );

        }
        catch (NullPointerException e) {
            System.out.println( "Exception: " + e.getMessage() );
        }
        catch (ArithmeticException e) {
            System.out.println( "Exception: " + e.getMessage() );
        }
        finally {
            System.out.println("final statements!");
        }
        //----------------------------------------------------------------

        String name = "Abdullahi";

        if (name != null) {
            System.out.println(name.length() );
        }
        else{
            System.out.println("name is null!");
        }
    }
}
