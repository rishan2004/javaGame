import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Play guess the right number game");
        System.out.println("Enter your name");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();

        System.out.println("Hello"+name);
        System.out.println("Shall we begin?");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");

        int beginAnswer=scanner.nextInt();

        while(beginAnswer!=1){
            System.out.println("Shall we begin?");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");

            beginAnswer=scanner.nextInt();
        }

        Random random=new Random();
        int x=random.nextInt(20);

        System.out.println("Guess a number from 0 to 20");
        int UserInput=scanner.nextInt();

        int timesTried=0;
        boolean hasWon=false;
        boolean shouldFinish=false;

        while(!shouldFinish){
            timesTried++;

            if(timesTried<5){

                if(UserInput==x){
                    hasWon=true;
                    shouldFinish=true;
                }
                else if(UserInput>x){
                    System.out.println("Guess lower");
                    UserInput=scanner.nextInt();
                }
                else{
                    System.out.println("Guess higher");
                    UserInput=scanner.nextInt();
                }
            }
            else{
                shouldFinish=true;
            }
        }
        if(hasWon) {
            System.out.println("Congratulations!You have guessed in" + timesTried + " moves");
        }
        else{
            System.out.println("The right answer is:"+x);
            System.out.println("Game Over!");
        }

    }
}
