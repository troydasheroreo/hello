import skilstak.c;

public class hello{
    
    
    public static void color(String message) {
        System.out.println(c.clear);
        while (true) {
        System.out.println(c.rc() + message + " ");
    }
  }

    public static void plain(String message) {
        System.out.println(c.clear +  message);
  }

    public static void multi(String message) throws InterruptedException {
        while (true) {
            System.out.println(c.clear + c.multi(message));
            Thread.sleep(500);
      }
  }

    public static void main(String[] args) throws InterruptedException {
        String who = "world";
        String option = "";
        String message = "";

        if (args.length > 1) {
            option = args[0];
            who = args[1];
        } else if  (args.length == 1) {
            if (args[0].startsWith("-")) {
                option = args[0];
            } else {
                who = args[0];
            }
        }

        message = "Hello " + who + "!"; 

        if (option.equals("-m")) {
            multi(message);
        } else if (option.equals("-c")) {
            color(message);
        } else {
            plain(message);
        }
    }
}
    
  

