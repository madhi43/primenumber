
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner i = new Scanner(System.in);
            calc c = new calc();
            System.out.println("Enter a number:");
            int num = i.nextInt();
            System.out.println(c.func(num));
        }
    }
        class calc {
            String func(int n) {
                int count =0;
                for(int i=2;i<n;i++)
                {
                    if(n%i==0){
                        count+=1;
                    }
                }

                if (count>0) {
                    return("The number is not prime number");
                }
                else {

                    return ("The number is prime");
                }
            }
        }
    



        }
    }


