public class JavaArgClass {


    public static int addNums3(int a, int b, int c) {

        return a + b + c;

    }

    public static int addsNumber1(int... args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }

    public static void calculateNums1(char x, int... args) {
    /*    int result = 0;
        // int [] arr = {1};
        switch (x) {


            case '*':
                for (int i = 0; i < args.length; i++) {
                    result++;
                    result *= args[i] - 1;
                }
                return result;


        }
    }





        public static int calculateNums(char x, int ... args){
            int result = 0;
            int [] arr = {1};
            switch(x){
                case '+':
                    for(int i=0; i<args.length; i++){
                        result += args[i];
                    }
                    return result;
                case '-':
                    for(int i=0; i<args.length; i++){
                        result -= args[i];
                    }
                    return result;
                case '*':
                    for(int i=0; i<args.length; i++){
                        result ++;
                        result *= args[i]-1;
                    }
                    return result;
            }
            return result;
        }







*/







    }
}