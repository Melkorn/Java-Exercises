import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

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

        public static int getLargestPrime(int number) {
            if (number > 1) {
                int i = 2;
                while (i < number) {
                    if (number % i == 0) {
                        number = number / i;
                    } else i++;
                }
                return number;
            }
            return -1;
        }

        public static void inputThenPrintSumAndAverage(){
            Scanner scaner = new Scanner(System.in);
            int sum = 0;
            double avg = 0;
            long aVg =0;
            int count =0;
            boolean a = true;
            while (a == true) {


                boolean isAnInt = scaner.hasNextInt();

                if(isAnInt) {

                    sum = sum + scaner.nextInt();
                    count++;
                }
                else{
                    avg = (double)sum/(double)count;
                    aVg = Math.round(avg);
                    System.out.println("SUM = " + sum + " " + "AVG = " + aVg);
                    a = false;
                    scaner.close();
                }
            }
        }

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
            if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
                return -1;
            }else{
              double bucket = width*height/areaPerBucket;
                int buckets = (int)Math.round(bucket);
                if((double)buckets < bucket){
                    buckets ++;
                    if(buckets <= extraBuckets){
                        return 0;
                    }else{
                        return (buckets - extraBuckets);
                    }
                } else{
                    if(buckets <= extraBuckets){
                        return 0;
                    }else{
                        return (buckets - extraBuckets);
                    }
                }

            }

        }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            double bucket = width*height/areaPerBucket;
            int buckets = (int)Math.round(bucket);
            if((double)buckets < bucket){
                buckets ++;
                return buckets;

            } else{
                return buckets;
            }

        }

    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            double bucket = area/areaPerBucket;
            int buckets = (int)Math.round(bucket);
            if((double)buckets < bucket){
                buckets ++;
                return buckets;

            } else{
                return buckets;
            }

        }

    }

    public static void main(String[] args){
        //getEvenDigitSum(2);
            //hasSharedDigit(12, 23);
        //getGreatestCommonDivisor(81, 153);

       // System.out.println(isPerfectNumber(6));
        //System.out.println(reverse(-2));
        //numberToWords(10000);
        //System.out.println(canPack(3, 1, 16));
        //System.out.println(getLargestPrime(8));
        //inputThenPrintSumAndAverage();
        //System.out.println( getBucketCount(2,3));
        //System.out.println( getBucketCount(2.4,1.4,2.1,1));
        //System.out.println(getBucketCount(2.6,7.3,1.6));

        /* Account San = new Account();
        San.deposite(41.23d);
        San.deposite(2.00d);
        San.deposite(0.41d);

        San.withdraw(40.01d);

         Account Mat = new Account("12321312", "Matt", "123123123","wewewewe@fwert.com", 1000.00);
         Mat.deposite(213.00d);
         Mat.withdraw(321d);

         */
        /*
        VipCustomer vip1 = new VipCustomer("hans", 500000, "hans@email.com");
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip1.getEmailAdress());
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer();
        System.out.println(vip2.getName());
        System.out.println(vip2.getEmailAdress());
        System.out.println(vip2.getCreditLimit());

        VipCustomer vip3 = new VipCustomer("Mark", 3000);
        System.out.println(vip3.getCreditLimit());
        System.out.println(vip3.getEmailAdress());
        System.out.println(vip3.getName());
        */

       /* Wall big = new Wall(-2, 41);
        System.out.println(big.getHeight());
        System.out.println(big.getWidth());

        Wall wall2 = new Wall();
        System.out.println(wall2.getWidth());
        System.out.println(wall2.getHeight()); */

       Point uno = new Point(6,8);
       Point duo = new Point(2, 1);

        System.out.println(uno.distance(duo));

    }
}
