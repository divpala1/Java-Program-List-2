import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Program_List_2 {
    public static void main(String[] args) {
        System.out.println("Program List - 2");
        System.out.print("Program to be displayed: ");
        Scanner sc = new Scanner(System.in);
        int program = sc.nextInt();

        switch (program){
            case 1 -> {
                System.out.println("Program - 1");
                System.out.println("Mean, variance, and standard deviation calculator");
                System.out.println("Enter the values of:-");
                System.out.print("x1: ");
                float x1 = sc.nextFloat();
                System.out.print("x2: ");
                float x2 = sc.nextFloat();
                System.out.print("x3: ");
                float x3 = sc.nextFloat();

                float mean = (x1+x2+x3)/3;

                //squaredNumber = Math.pow(variable, power);
                float var = (float) ((Math.pow((x1-mean),2)+Math.pow((x2-mean),2)+Math.pow((x3-mean),2))/3);

                float sd = (float) Math.sqrt(var);

                System.out.println("");
                System.out.println("Statistical parameters for the numbers entered are:-");
                System.out.printf("Mean: "+"%.2f\n",mean);
                System.out.printf("Variance: "+"%.2f\n",var);
                System.out.printf("Standard Deviation: "+"%.2f\n",sd);
            } //End of case 1.

            case 2 -> {
                System.out.println("Program - 2");
                System.out.println("Equation roots calculator");
                System.out.println("Enter the values of a, b, and c:-");
                System.out.print("a = ");
                float a = sc.nextFloat();
                System.out.print("b = ");
                float b = sc.nextFloat();
                System.out.print("c = ");
                float c = sc.nextFloat();

                float delta = (float) Math.pow(b,2)-(4*a*c);
                //-b+-sqrt(delta)/2a
                float x1 = (float) ((0-b + Math.sqrt(delta))/(2*a));
                float x2 = (float) ((0-b - Math.sqrt(delta))/(2*a));

                System.out.println("Answers: ");
                System.out.printf("Delta = " + "%.2f\n",delta);
                System.out.printf("Root-1 = "+ "%.2f\n",x1);
                System.out.printf("Root-2 = "+ "%.2f\n",x2);

            } //End of case 2.

            case 3 -> {
                System.out.println("Program - 3");
                System.out.println("Swapping numbers without a third variable.");
                int a, b;
                System.out.print("Value of a: ");
                a = sc.nextInt();
                System.out.print("Value of b: ");
                b = sc.nextInt();
                System.out.println("Before swapping : a, b = "+a+", "+ + b);

                a = a + b;
                b = a - b;
                a = a - b;
                System.out.println("After swapping : a, b = "+a+", "+ + b);
            } //End of case 3.

            case 4 -> {
                System.out.println("Program - 4");
                System.out.println("Welcome to the game of rock-paper-scissors.");
                System.out.println("1 - Rock \n2 - Paper \n3 - Scissor");
                System.out.print("Your input: ");
                int user = sc.nextInt();

                int min = 1; //Minimum value is inclusive.
                int max = 4; //Maximum value is exclusive.
                int comp = (int) (Math.random() * (max - min + 1) + min); //Generates random number
                System.out.println("Computer is "+comp);

                int win;
                String winner = "";


                if ((user==1 && comp==3) || (user==3 && comp==1)){
                    win = Math.min(user, comp);
                }

                else if (user==comp){
                    win = 0;
                }

                else {
                    win = Math.max(user, comp);
                }

                switch (win){
                    case 0 -> winner = "It's a draw.";
                    case 1 -> winner = "Rock wins.";
                    case 2 -> winner = "Paper wins.";
                    case 3 -> winner = "Scissors win.";
                }

                System.out.println(winner);

            } //End of case 4.

            case 5 -> {
                System.out.println("Program - 5");
                System.out.println("Welcome to the lottery");
                System.out.print("Enter your lottery number: ");
                int in5 = sc.nextInt();

                int min = 10; //Minimum value is inclusive.
                int max = 100; //Maximum value is exclusive.
                int com = (int) (Math.random() * (max - min + 1) + min); //Generates random number
                System.out.println("Winning lottery number is "+com+".");

                boolean a = false;
                int[] inAr = new int[2];
                int[] comAr = new int[2];

                if (in5 == com){
                    System.out.println("You win Rs.10,000.");
                }

                else {
                    for (int i = 0; i <= 1; i++) {
                        inAr[i] = in5 % 10;
                        in5 = in5 / 10;
                    } //Converting user input to an array

                    for (int i = 0; i <= 1; i++) {
                        comAr[i] = com % 10;
                        com = com / 10;
                    } //Converting computer input to an array

                    Arrays.sort(inAr); //Sorts the array in ascending order
                    Arrays.sort(comAr);

                    if (Arrays.equals(inAr, comAr)){
                        System.out.println("You win Rs.3,000.");
                    }

                    else{

                        for (int i=0; i<=1; i++){

                            for(int j=0;j<=i;j++){
                                if(inAr[i] == comAr[j]){
                                    a = true;
                                    break;
                                }

                            } //End of j-for loop.
                        } //End of i-for loop.

                        if (a==true){
                            System.out.println("You win Rs.1,000.");
                        }

                        else{
                            System.out.println("You haven't won any prize.");
                        }

                    } //End of secondary else statement.

                } //End of primary else statement.

            } //End of case 5.

        } //End of primary switch.

    } //End of main
}
