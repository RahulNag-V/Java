/*public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Numbers are:" + i);
            }
        }
    }
}*/

/*public class Looping{
    public static void main(String[] args){
        String name = "Rahul Nag V";
        int password = 1234;
        boolean LoggedIn =  name.equals("Rahul Nag V") && password==1234;
        if(name.equals("Rahul Nag V") && password==1234){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Username or Password");
        }
        System.out.println("Logged In:" + LoggedIn);
    }
}*/

/*public class Looping {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nReverse 5 - 1\n");
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

/*import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        int number = 7;
        int userGuess = 0;

        while (number != userGuess) {
            System.out.print("Enter your guess: ");
            userGuess = guess.nextInt();
            if (number == userGuess) {
                System.out.println("Correct Guess");
            }else if(number < userGuess){
                System.out.println("Too High");
            }else if(number > userGuess){
                System.out.println("Too Low");
            }
        }
        guess.close();
    }
}*/

