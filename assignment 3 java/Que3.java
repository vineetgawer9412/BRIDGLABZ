import java.util.Scanner;
public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        sc.close();
    }
}
