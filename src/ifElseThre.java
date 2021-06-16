import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ifElseThre {

    public static void main(String[] args) {


        //Task:"even or odd number"
        //creat an int assign any value
        //if int i even number :print "even number"
        //if int is odd nimber:print "odd number"

        //firmula use %
        //number % 2==0>>even number
        //number % 2==1>>odd number

        // int num1=10;
        // if(num1 % 2==0){
        //    System.out.println("even number");
        // }else if(num1 %2==1){
        //    System.out.println("odd number");
        // }

        //  String cup1="Wateer";
        // String cup2="juice";
        //String cup3=cup1;
        //cup1=cup2;
        // cup2=cup3;
        // System.out.println("cup 1 is holding;"+cup1);
        // System.out.println("cup 1 is holding;"+cup2);


        //task
        //ask user to enter a string with upper

    /* Scanner input=new Scanner(System.in);
        System.out.println("enter your lover casse");
        String text1=input.nextLine();


        System.out.println(text1.toUpperCase());

        System.out.println("enter your lover casse");
        String text2=input.nextLine();


        System.out.println(text1.toLowerCase());*/


        //lenght()--returs number of chars in a string
        //Task:
        //ask user to enter a string
        //print hpw many char are in the string

        // Scanner input=new Scanner(System.in);
        // System.out.println("enter your you text");
        // String text1=input.nextLine();


        // System.out.println(text1.length());
       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter you grade number");
        int gradUser=input.nextInt();

        if (gradUser >=90&& gradUser<=100){
            System.out.println("A students");
        }else if (gradUser >=80&& gradUser<=90){
            System.out.println("B students");
        }*/

        //credit card
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter loan type");
        String loanType = input.nextLine();
        System.out.println("Enter sub loan type");
        String subLoan = input.nextLine();
        System.out.println("Enter loan signature");
        String sig = input.nextLine();
        if (loanType.equals("Visa")) {
            System.out.println("You choose Visa loan");
            if (subLoan.equals("Visa Platinum")) {
                System.out.println("You choose Visa Platinum");
            } else if (subLoan.equals("Visa Platinum Rewards")) {
                System.out.println("You choose Visa Platinum Rewards");
            } else if (sig.equals("Visa Signature")) {
                System.out.println("You choose Visa Signature");
            } else {
                System.out.println("This sub load is invalid ");
            }

        }*/

              //vehicle loan
        /* Scanner input = new Scanner(System.in);
         System.out.println("Enter  Auto  Loan");
         String vehicleType = input.nextLine();

        System.out.println("Enter  service  Loan");
        String serviceLoan = input.nextLine();

        System.out.println("Enter  RV  Loan");
        String rvLoans = input.nextLine();

         if (vehicleType.equals("Auto Loan")){
             System.out.println("your choose Auto Loan");
         }else if (serviceLoan.equals("Car Buying Service")){
             System.out.println("your choose Car Buying Service");
        }else if (rvLoans.equals("RV loans")) {
             System.out.println("your choose RV loans");
         }else{
             System.out.println("this vehicle loans is invalid");
         }*/
        //Password amg loggin task
       /* Scanner input=new Scanner(System.in);
         String userName="Safarbeg21";
         String password="oneone11";
        System.out.println("Enter Your User Name ");
        String myUserName=input.nextLine();
        System.out.println("Enter You Password");
        String myPassword=input.nextLine();
        if (myUserName.equals(userName)) {
            System.out.println("Correct user name");
            if (myPassword.equals(password)) {
                System.out.println("Login Succesful!");
            } else {
                System.out.println("Wrong Password");
            }
        }else {
                System.out.println("Wrong username");
            }*/

           //write a program that will print out month by receiving number
       /* Scanner input = new Scanner(System.in);

        System.out.println("Entee numbr number");

        int numberUser = input.nextInt();
        if (numberUser == 1) {
            System.out.println("January");
        }
        else if (numberUser == 2) {
            System.out.println("Fwbruary");
        } else if (numberUser == 3) {
            System.out.println("March");
        } else if (numberUser == 4) {
            System.out.println("April");
        } else if (numberUser == 5) {
            System.out.println("May");
        } else if (numberUser == 6) {
            System.out.println("June");
        } else if (numberUser == 7) {
            System.out.println("July");
        }else if  (numberUser==8){
            System.out.println("August");
        }else if (numberUser==9){
            System.out.println("September");
        }else if (numberUser==10){
            System.out.println("October");
        }else if (numberUser==11){
            System.out.println("November");
        }else if(numberUser==12){
            System.out.println("December");
        }else {
            System.out.println("Wrong input");
        }*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter loan type:");
        String loanType = input.nextLine();
        System.out.println("Enter sub loan type:");
        String subLoan = input.nextLine();
        if (loanType.equals("Credit Cards")) {
            System.out.println("You chose Credit Cards loan!");
            if (subLoan.equals("Visa Platinum")) {
                System.out.println("You choose Visa Platinum!");
            } else if (subLoan.equals("Visa Platinum Rewards")) {
                System.out.println("You choose Visa Platinum Rewards!");
            } else if (subLoan.equals("Visa Signature")) {
                System.out.println("You choose Visa Signature!");
            } else {
                System.out.println("This sub load is invalid ");
            }
        } else if (loanType.equals("Vehicle Loans")) {
            System.out.println("You choose Vehicle Loans!");
            if (subLoan.equals("Auto Loans")) {
                System.out.println("You chose Auto Loans!");
            } else if (subLoan.equals("Car Buying Service")) {
                System.out.println("You chose Car Buying Service!");
            } else if (subLoan.equals("Vehicle Service Program")) {
                System.out.println("You chose Vehicle Service Program!");
            } else if (subLoan.equals("RV Loans")) {
                System.out.println("You chose RV Loans!");
            } else {
                System.out.println("This sub load is invalid ");
            }
        } else if (loanType.equals("Home Loans")) {
            System.out.println("You chose Home Loans!");
            if (subLoan.equals("Mortgages")) {
                System.out.println("You chose Mortgages!");
            } else if (subLoan.equals("Home Equity Line of Credit")) {
                System.out.println("You chose Home Equity Line of Credit!");
            } else {
                System.out.println("This sub load is invalid");
            }
        } else if (loanType.equals("Personal Loans")) {
            System.out.println("You chose Personal Loans!");
            if (subLoan.equals("Personal Loans")) {
                System.out.println("You chose Personal Loans!");
            } else {
                System.out.println("This sub load is invalid");
            }
        } else if (loanType.equals("Commercial Real Estate")) {
            System.out.println("You Chose Commercial Real Estate!");
            if (subLoan.equals("Commercial Real Estate")) {
                System.out.println("You Chose Commercial Real Estate!");
            } else {
                System.out.println("This sub load is invalid");
            }  else {
                System.out.println("This loan type is invalid");
            }
        }*/





        }


}