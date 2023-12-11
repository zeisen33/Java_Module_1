import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        System.out.println("Enter your name:");
        String name = console.nextLine();
        System.out.println("Your name is: " + name);
    }
}