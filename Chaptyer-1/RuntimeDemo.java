public class RuntimeDemo {

   public static void main(String[] args) {
      String cmd = "mkdir Testing";
      Process process = Runtime.getRuntime().exec(cmd);
      try {

         // print a message
         System.out.println("Executing notepad.exe");

         // create a process and execute notepad.exe
         Process process = Runtime.getRuntime().exec(cmd);

         // print another message
         System.out.println("Notepad should now open.");

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}