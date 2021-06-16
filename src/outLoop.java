import java.util.Scanner;

public class outLoop {
    public static void main(String[] args) {


      /*  for(int i=1;i<=5;i++){
            for (int j=1; j<=5;j++){
           // System.out.println(i);
                System.out.println(" outter loo"+i+" inter loop "+j);
            }

        }
*/
    /* int u=1;
        while (u <= 3) {

            for (int i = 1; i <= 3; i++) {
                System.out.println(u + "outter");
            }
            u++;*/
       // }
       /*  for (int i=1; i<2;i++){
             System.out.println("week "+i);
             for (int j=1; j<=7;j++){
                 System.out.println("  day "+j);
             }
         }

*/
       //task
        // 1*2*3*4*5*
        // 1*2*3*4*
        // 1*2*3*
        // 1*2*
        // 1*

      /*  for (int i=5; i>=1;i--){
            for (int j=1;j<=i; j++){
                System.out.print(j+"*");
            }
            System.out.println(" ");
        }*/


       // for (int i=1;i<=3;i++){
         //   System.out.println(i);
      //  }
        //task
        //print all alphabet positive

      /*  char a;
        for (a='A';a<='Z';a++){
            System.out.print(a);
        }
*/


     // int num=5;
     // for (int i=1; i<=10;i++){
      //    System.out.println(num);
     // }

       //break
        //continue

        //checked until 5
     /*   for (int i=1;i<=10;i++){
            if (i==5){
               // break;
                continue;
            }
            System.out.println(i);
        }*/
       //task
       /* String str = "ABCDEF"; //.length
        // when you find D skip it
        //output : ABCEF
        for (int i = 0; i <= str.length(); i++){
            if(str.charAt(i) == 'D'){
                continue;
                //break;
            }
            System.out.print(str.charAt(i));
        }*/

        //Task 1
      /*  int sum1=2;
        for(int i=1;i<=20;i++){
            System.out.println(sum1+"*" +i+"="+sum1*i);
        }*/
        //task 2

      /* int num=3;
       int i=1;

       while (i<=15){
           System.out.printf("%d * %d = %d \n",num,i,num*i);
           i++;
       }

*/


      //task 1 Swap two numbers using temporary variable
    /*   int num=4;
       int num1=5;
       int temp;
       temp=num;
       num=num1;
       num1=temp;
        System.out.println("number : "+num);
        System.out.println("number1 : "+num1);
*/
        //task 2
/*    int a=10;
    int b=11;
    a=a+b;
    b=a-b;
    a=a-b;
        System.out.println("without temporary : "+a+" "+b);

*/

       /* Scanner scr=new Scanner(System.in);
        System.out.println("enter your letter ");
        String numberUser = scr.nextLine();
        String a="A";
        if (numberUser==a);{
            System.out.println("wovel number");
        }*/



       /* Scanner input = new Scanner(System.in);

        System.out.println("Entee numbr number");

        String letter = input.nextLine();
        if (letter.equals('A')) {
            System.out.println("January");
        }
        else if (letter.equals('B')) {
            System.out.println("Fwbruary");
        }
*/










    }
}
