import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {


        //char()
       /* String str="Java";
        char c=str.charAt(2);
        System.out.println(c);
       */

        //concat ()
        /* String str="Java";
        String str2=" is fun";
        System.out.println(str.concat(str2));

        //compareTo()
        String str="Java";
        String str2="JAva";
        System.out.println(str.compareTo(str2));


          //equals
        //true
        //String str="Java";
       //true System.out.println(str.equals(str));
       //false System.out.println(str.equals("ava"));


        //Equals ignor case
        //it just ign0sr case
        String str="Java";
        System.out.println(str.equalsIgnoreCase("JAVA "));


      //length();
        //length count character
        String str="JAVA is fun";
        System.out.println(str.length());


        //isEmpty
       //true String str="";
        //falseString str=" ";
        System.out.println(str.isEmpty());


        //contains();
        //its mean the contain of str contain str 1
        //String str="Java is fun";
       // String str1="Java";
       //true  System.out.println(str.contains(str1));
       //false  System.out.println(str1.contains(str));
       // System.out.println(str.contains("a i"));

        //startWith  its mean where we gonna start
        //end with its mean where we end
       // String str="Java is fun";
       // true start with  System.out.println(str.startsWith("Java"));
       // false start with  System.out.println(str.startsWith("is"));
       // endwith true  System.out.println(str.endsWith("fun"));


        //lowerCase
        //to Upper case
        String str="Java is fun";
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.ROOT));



          //indexOf its mean  we get the first number where we add words
        //for example we add welcome so we count from 0 to what word we add
        String str="Java is 2 welcome to java";
        System.out.println(str.indexOf("welcome"));

          //last indexOf
        //so its mean we get the last letter that we add

        String str="Java is 2 welcome to java";
        System.out.println(str.lastIndexOf("a"));


            //replace so its mean we change that letter that we add
        //for exaple java if i add "a" to "o" i get jovo
        String str="Java is 2 welcome to java";
        System.out.println(str.replace("a","o"));
        System.out.println(str.replace("v","b"));




        //subStri
        //we get the rest of latter the number that we add
        //for example i add 5 i get "is 2 welcome to java"
        String str="Java is 2 welcome to java";
        System.out.println(str.substring(5));




        String str="Java is 2 welcome to java";
        String [] x=str.split("a");
       for (String c:x){
           System.out.print(c+" ");
       }

  */








    }
}
