import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        RockPaperScissors RPS_object = new RockPaperScissors();

        try{
            System.out.println("Player one enter rock, paper, or scissors: ");
            String p1 = input.nextLine();

            System.out.println("Player two enter rock, paper, or scissors: ");
            String p2 = input.nextLine();
            

            System.out.println(RPS_object.rps(p1.toLowerCase(), p2.toLowerCase()));
        } catch(Exception InputMismatchException){
            System.out.println("Invalid input.");
        }


    }
}
