import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age=scanner.nextInt();
        int result;
        result=age/2+7;
        System.out.println(age+" years old should date some one who is at least "+result+" years old");
    }

    }
