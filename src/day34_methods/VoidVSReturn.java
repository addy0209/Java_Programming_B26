package day34_methods;

public class VoidVSReturn {
    public static void main(String[] args) {

        sayHello();
        // String msg = SayHello(); this doesn't work because the method is void (there is no return value).

        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);
    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
        return "Bye";
    }




}
