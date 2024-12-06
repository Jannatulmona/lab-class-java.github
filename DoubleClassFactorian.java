import java.util.Scanner;

//factorian find out class

class Factorion {

        public int FindFactorion(int r) {
        int fact = 1;
        for (int i = 2; i <= r; i++) {
            fact *= i;
        }
        return fact;
    }

       public int digit(int start, int end) {
        int count = 0;
        for (int j = start; j <= end; j++) {
            int sum = 0, temp = j;

                        while (temp > 0) {
                int r = temp % 10;
                sum =sum+FindFactorion(r);
                temp /= 10;
            }

                        if (sum == j) {
                count++;
            }
        }
        return count;
    }
}
//main class

public class DoubleClassFactorian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start and end range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

                Factorion finder = new Factorion();

               int count = finder.digit(start, end);
        System.out.println("Number of factorians: " + count);

        sc.close();
    }
}
