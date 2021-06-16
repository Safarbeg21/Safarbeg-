import javax.swing.*;
import java.lang.invoke.VarHandle;
import java.util.Random;
import java.util.Scanner;

public class switchStatments {

    public static void main(String[] args) {

        //switch
     /*   int number=1;
        switch (number){

            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("invalid number");
        }*/

        //day of weeks with switch
     /*   String day="monday";
                switch (day){
                    case "monday":
                        System.out.println("today is "+day);
                        break;
                    case "tuesday":
                        System.out.println("today is "+day);
                        break;
                    case "wednsday":
                        System.out.println("today is "+day);
                        break;
                    case "thursday":
                        System.out.println("today is "+day);
                        break;
                    case "friday":
                        System.out.println("today is "+day);
                        break;
                    case "sarurday":
                        System.out.println("today is "+day);
                        break;
                    case "sunday":
                        System.out.println("today is "+day);
                        break;
                    default:
                        System.out.println("inv alod day");
                }*/


        //creat switch
        //if day ine print monday
        //if day is two print tuesday,,do it with all days
        //default print "invalid day

      /*int dayOfWeek=1;
      switch (dayOfWeek){
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Thursday");
              break;

          case 5:
              System.out.println("Friday");
              break

          case 6:
              System.out.println("Saturday");
              break;
          case 7:
              System.out.println("Sunday");
              break;
          default:
              System.out.println("This invalid number");
      }*/
        //creat month of season
      /* String month = "July";
        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println(month+" the month of winter");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println(month+" the month of spring");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println(month+" the month of summer");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println(month+" the month of autumn");
                break;
            default:
                System.out.println("Invalid input");
        }*/

        //
       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter a Letter ");
        char c = input.nextLine().charAt(0);


        switch (c) {
            case 'a':
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'b':
                System.out.println("Great");
                break;
            case 'C':
            case 'c':
                System.out.println("Okay!");
                break;
            case 'D':
            case 'd':
                System.out.println("You can do better!");
                break;
            case 'F':
            case 'f':
                System.out.println("Somthing need to change !");
                break;
            default:
                System.out.println("invalid grade");


        }*/

        //  Scanner input=new Scanner(System.in);
        //int num=input.nextInt();


        //7-1-7

       /* if (num=>1 &&num <=7){
            switch (num){
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("fghd");
                    break;
                case 4:
                    System.out.println("Mzgay");
                    break;
                case 5:
                    System.out.println("Mgfdghay");
                    break;
                case 6:
                    System.out.println("Mxhday");
                    break;
                case 7:
                    System.out.println("MoDay");
                    break;
            }
        }*/

        // JOptionPane.showInputDialog("Enter your text");

        //int num=1;

        //if (num =>1<5)
        //1 task
       /* Scanner input = new Scanner(System.in);
        System.out.print("Enter your number");
       int userText = input.nextInt();


        if (userText >= 1 && userText <= 5) {
            System.out.println("Short word");
        } else if (userText >= 5 && userText <= 10) {
            System.out.println("Medium word");
        } else if (userText >= 10 && userText <= 15) {
            System.out.println("Long word");
        } else if (userText >=15&& userText <= 15) {
            System.out.println("Super long word");
        } else if (userText == 1) {
        } else {
            System.out.println("This is a char");
        }*/
        //task2
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter your chat");
        String text= input.nextLine();
        if(text.equals("SAFAR")){
            System.out.println("its uppercase chat");
        }else if(text.equals("old")){
            System.out.println("its lowercase");
        }else {
            System.out.println("its not char letter");
        }*/
         //task 3
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter a vowel ");
        char c = input.nextLine().charAt(0);


        switch (c) {
            case 'a':
            case 'A':
                System.out.println("This a vowel letter!");
                break;
            case 'E':
            case 'e':
                System.out.println("This a vowel letter!");
                break;
            case 'I':
            case 'i':
                System.out.println("This a vowel letter!");
                break;
            case 'O':
            case 'o':
                System.out.println("This a vowel letter!");
                break;
            case 'U':
            case 'u':
                System.out.println("This a vowel letter!");
                break;
            default:
                System.out.println("This letter is not vowel");

        }*/
         //task 4
       /* Random random = new Random();
        System.out.println("Enter a number");
        var numberFromUser = random.nextInt();
        var randomNumber = random.nextInt(5);
        if (numberFromUser == randomNumber){
           // System.out.println(randomNumber + " Write a program to check ");
        }else if (numberFromUser < randomNumber  ) {
            System.out.println(randomNumber + "  your a baby");
        }else if (numberFromUser > randomNumber  ) {
            System.out.println(randomNumber + " your a little child");
        }else if (numberFromUser>randomNumber){
            System.out.println(randomNumber+"your are a teenager ");
        }else if (numberFromUser>randomNumber){
            System.out.println(randomNumber+"your are an adult  ");
        }else if (numberFromUser>randomNumber){
            System.out.println(randomNumber+" your a senior person");
        }*/















    }
}









