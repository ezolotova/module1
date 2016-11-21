package module2;

/**
 * Created by Ekaterina on 20.11.2016.
 */
public class HomeWorkArriveTwo {
        public static void main(String[] args) {
            double n = 500;
            withdraw (n, 200);
        }

        public static double withdraw(double balance, double transaction) {
            double commision = transaction * 0.05;
            double sum = transaction + commision;
            if (sum >  balance)
                System.out.println("NO");
            else {
                balance =  balance - sum;
                System.out.println("OK " + commision + " " +  balance);
            }
            return  balance;
        }
    }


