package module2;

/**
 * Created by Ekaterina on 21.11.2016.
 */
public class HomeWorkArriveThree {
           public static void main(String[] args) {
            String n = "Ann";
            itog (n, 354);
        }


        public static double itog(String n, double withdrawal) {
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            double a = 0;
            int index = 0;
            for (String s : ownerNames) {
                if (s.contentEquals(n)) {
                    a = balances[index];
                }
                index++;
            }
            double com = withdrawal * 0.05;
            double tot = withdrawal + com;
            if (tot > a)
                System.err.println(n + " NO");
            else {
                a = a - tot;
                System.out.println(n + " " + withdrawal + " " + a);
            }
            return a;
        }
    }

