package module2;

/**
 * Created by Ekaterina on 16.11.2016.
 */

public class HomeWorkArrive {
    public static void main(String[] args) {
        //Create array type int;
        int[] massive = new int[10];// array-massive
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ((int) (Math.random() * 50) - 10);
        }
        //Create array type double;
        double[] massive2 = new double[10]; // array2-massive2
        for (int i = 0; i < massive2.length; i++) {
            massive2[i] = ((Math.random() * 50) - 10);

}
        System.out.print("sum(int massive[" +sum(massive) + "]), ");
        System.out.print("sum(double massive2[" + sum(massive2) + "])");
        System.out.println("");
        System.out.print("min(int massive[" + min(massive) + "]), ");
        System.out.print("min(double massive2[" + min(massive2) + "]), ");
        System.out.println("");
        System.out.print("max(int massive[" + max(massive) + "]), ");
        System.out.print("max(double massive2[" + max(massive2) + "]), ");
        System.out.println("");
        System.out.print("maxPositive(int massive[" + maxPositive(massive) + "]), ");
        System.out.print("maxPositive(double massive2[" + maxPositive(massive2) + "]), ");
        System.out.println("");
        System.out.print("multiplication(int massive[" + multiplication(massive) + "]), ");
        System.out.print("multiplication(double massive2[" + multiplication(massive2) + "]), ");
        System.out.println("");
        modulus(massive);
        modulus(massive2);
        System.out.println("");
        secondLargest(massive);
        secondLargest(massive2);
    }

    //Sum array type int
    public static int sum(int[] massive) {
        int total = 0;
        for (int i = 0; i < massive.length; i++) {
            total = total + massive[i];
        }
        return total;
    }

    //Sum array type double
    public static double sum(double[] massive2) {
        double total1 = 0;
        for (int i = 0; i < massive2.length; i++) {
            total1 = total1 + massive2[i];
        }
        return total1;
    }
    //finding min type int
    public static int min(int[] massive) {
        int min =  massive[0];
        for (int i = 0; i <  massive.length - 1; i++) {
            if (min >  massive[i]) min =  massive[i];
        }
        return min;
    }

    // finding min type double
    public static double min(double[]  massive2) {
        double min =  massive2[0];
        for (int i = 0; i <  massive2.length - 1; i++) {
            if (min >  massive2[i]) min =  massive2[i];
        }
        return min;
    }
    //finding max type int
    public static int max(int[] massive) {
        int max = massive [0];
        for (int i = 0; i < massive.length; i++) {
            if (max < massive[i]) max = massive[i];
        }
        return max;
    }

    //finding max type double
    public static double max(double[] massive2) {
        double max = massive2[0];
        for (int i = 0; i < massive2.length; i++) {
            if(max < massive2[i]) max = massive2[i];
        }
        return max;
    }

    //finding max positive type int
    public static int maxPositive(int[] massive) {
        int maxpositive = massive [0];
        for(int tab : massive){
            if(tab > 0){
                if(maxpositive < tab) maxpositive = tab;
            }
        }
        return maxpositive;
    }

    //finding max positive type double
    public static double maxPositive(double[] massive2) {
        double maxpositive = massive2[0];
        for(double tab : massive2)
            if(tab > 0){
                if(tab > maxpositive) maxpositive = tab;
            }
        return maxpositive;
    }

    //multiplication array type int
    public static int multiplication(int[] massive) {
        int a = 0;
                for (int i = 0; i < massive.length; i++) {
            if (massive[i] != 0) {
                a *=  massive[i];
            }
                  }
        return a;
    }

    //multiplication array type double
    public static double multiplication(double[] massive2) {
        double a1 = 1.0;
        for (int i = 0; i < massive2.length; i++) {
            if (massive2[i] != 0)
                a1*= massive2[i];
        }
        return a1;
    }

    //modulus of first and last element type int
    public static void modulus(int[]massive) {
        for(int i = 0; i < massive.length; i++){
            if (massive[i] != 0){
                System.out.print("modulus(int array[" + (massive[0] % massive.length-1) + "]), ");
                break;
            }
            else System.out.println("The entered number is less than 0");
            break;
        }
    }

    //modulus of first and last element type double
    public static void modulus(double[] massive2) {
        for (int i = 0; i < massive2.length; i++) {
            if (massive2[i] != 0){
                System.out.print("modulus(double array[" + (massive2[0] %  massive2.length-1) + "])");
                break;
            }
            else System.out.println("The entered number is less than 0");
            break;
        }
    }

    //The second largest element type int
    public static void secondLargest(int[]massive) {
        boolean isActive = true;
        for(int i = massive.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if (massive[j] > massive[j+1]){
                    int b = massive[j+1];
                    massive[j+1] = massive[j];
                    massive[j] = b;
                    isActive = false;
                }
            }
            if(isActive) break;
        }
        System.out.print("secondLargest(int array[" + massive[8] + "]), ");
    }

    //The second largest element type double
    public static void secondLargest(double[] massive2) {
        boolean isActive = true;
        for(int i = massive2.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(massive2[j] < massive2[j+1]){
                    double b1 = massive2[j+1];
                    massive2[j+1] = massive2[j];
                    massive2[j] = b1;
                    isActive = false;
                }
            }
            if(isActive) break;
        }
        System.out.println("secondLargest(double array[" + massive2[8] + "])");
    }
}
