public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("abc"); // This will throw NumberFormatException
            System.out.println("Parsed integer: " + i);
        } catch (Exception e) {
            System.out.println("This Block handle all exception types");
         }
//        catch (NumberFormatException ex) {
//            System.out.println("This block will handle NFE.");
//        }
    }
}
