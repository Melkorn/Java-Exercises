import java.security.spec.RSAOtherPrimeInfo;

public class Main{
    public static boolean ifPalindrome(int number){
       int reverse = 0;
       int a = number;
       int b =0;
       int c = 0;
       if(a>=0){
       do{

           c = a%10;


           b = b*10 + c;
           a = a / 10;


       }
        while(a>0);}
       else{
           do{

               c = a%10;
               System.out.println(c + "c");


               b = (b*10 + c);
               a = a / 10;
               System.out.println(b +"b");


           }
           while(a<0);
       }
        System.out.println(b);
      reverse = b;
        if(number == reverse) {
            return true;
        }
        else{
            return false;
            }

    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        else if(number > 0 && number < 10){
            number = number * 2;
            return number;
        }else {


            int b =0;
            int a = number % 10;
            do {

                number = number / 10;
            } while (number >= 10);
            b = number %10;
            number = a+b;
            return number;
        }
    }
    public static int getEvenDigitSum(int number){
        if(number <0){
            return -1;
        }else {
            int a =0;
            int b =0;
            do{
                if((number % 10)%2 == 0) {

                    b = number % 10;

                    a = a + b;

                    number = number / 10;
                } else{
                    number = number / 10;
                }
            }while(number >0);
            number = a;

            return number;
        }
    }
    public static boolean hasSharedDigit(int a, int b){
        if(a >= 10 && a <= 99 && b >= 10 && b <= 99){
            int a1, a2, b1, b2;
            a1 = a%10;
            System.out.println(a1);
            a2= (a%100 - a1)/10;
            System.out.println(a2);
            b1 = b%10;
            System.out.println(b1);
            b2 = (b%100 - b1)/10;
            System.out.println(b2);

            if(a1 == b1 || a2 == b1 || b2 == a1 || b2 == a2) {

                return true;
            } else return false;


        }else return false;

    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a >= 10 && a <= 1000 && b >= 10 && b <= 1000 && c >= 10 && c <= 1000){
            if(a%10==b%10 || b%10 == c%10 || c%10 == a%10){
                return true;
            }else return false;
        }else return false;
    }

    public static boolean isValid(int a){
        if(a >= 10 && a <= 1000){
            return true;
        }return false;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first >= 10 && second >=10){

            while(second!=0){
                int a = first%second;
                first = second;
                second = a;
            } return first;
        } return -1;
    }

    public static void printFactors(int a) {
        if (a < 1) {
            System.out.println("Invalid Value");
        } else {


            for (int i = 1; i <= a / 2; i++) {
                if (a % i == 0) System.out.println(i);
            }
            System.out.println(a);
        }

    }

    public static boolean isPerfectNumber(int a){
        int c = 0;
        if(a > 1){
            for(int i = 1; i < a; i++){
                if(a%i == 0){
                    c = c + i;
                }
            }
            if(c == a) return true;
            else return false;
        }
        else return false;
    }

    public static void numberToWords(int number){
        if(number < 0) {
            System.out.println("Invalid Value");
        }else{
            int digit = 0;
            int reverse = reverse(number);
            for(int i = 0; i < getDigitCount(number); i++)       {

                digit = reverse%10;
                reverse = reverse/10;
                switch (digit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;


                }
            }
        }
    }

    public static int getDigitCount(int number){
        if(number > 0){
            int a = 0;
            while((number/10) > 0 || (number%10) > 0){
                number = number/10;
                a++;
            }

            return a;
        }else if (number == 0) return 1;
        else return -1;
    }

    public static int reverse(int number){
        int a = 0;
        while(number/10 != 0 || number%10 != 0){
            a = a*10;
            a = a + number%10;
            number = number / 10;

        }
        return a;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
            } else if(smallCount >= goal){
            return true;
            }else if(bigCount * 5 + smallCount >= goal && (goal%5) <= smallCount) {
            return true;
            } else return false;
        }


    public static void main(String[] args){
        //getEvenDigitSum(2);
            //hasSharedDigit(12, 23);
        //getGreatestCommonDivisor(81, 153);

       // System.out.println(isPerfectNumber(6));
        //System.out.println(reverse(-2));
        //numberToWords(10000);
        //System.out.println(canPack(3, 1, 16));
    }
}
