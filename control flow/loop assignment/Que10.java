import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num = sc.nextDouble();
        while (num != 0) {
            total += num;
            num = sc.nextDouble();
        }
        System.out.println("The total is " + total);
        sc.close();
    }
}
