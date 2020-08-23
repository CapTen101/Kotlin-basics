import java.util.Scanner;

public class Javatut {
    public static void main(String[] args) {
        System.out.println("Hello World"); // basic pehela wala program

        // variables
        int a = 1;
        float b = 2.4f;
        double d = 4.32;
        char ch = 'r';
        String top = "this is a random string variable";
        boolean bool = true;
        long l = 34535L;
        System.out.println(bool);
        System.out.println(ch);

        // now taking user input
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println(age);

        //Exception Handling

        int[] arr = new int[1];

        arr[0] = 1;
        try {
            arr[1] = 2;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("Try ke bad vali line");

    }
}
