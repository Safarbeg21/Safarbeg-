import java.util.Random;

public class presentation {

    public static void main(String[] args) {


        //for loop


        for (int i=0; i<5; i++) {
            System.out.println(i + " Hello");
        }


        int i=0;
        do {

            System.out.println(i);
            i++;

        }while (i<=5);


        for (int b = 0; b <= 10;  b ++) {
            System.out.println(b);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String c : cars) {
            System.out.println(c);
        }
        int e = 0;
        do {
            System.out.println(e);
            e++;
        }
        while (e < 5);

        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 9; col++) {
               System.out.print(" "+row+"*"+col+"="+col * row);

            }
         System.out.println();
        }


    }
}
