package module2;

/**
 * Created by Ekaterina on 21.11.2016.
 */
public class HomeWorkArriveFour {

        public static void main(String[] args) {
            String ownerName = "Oww";
            double withdrawal = 550;
            System.out.println(fund(ownerName, withdrawal));
        }

        private static double fund(String ownerName, double withdrawal) {
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            double b = 0;
            int index = 0;
            for (String s : ownerNames) {
                if (s.contentEquals(ownerName)) {
                    b = balances[index];
                    break;
                }
                index++;
            }
            return b + withdrawal;
        }

    }