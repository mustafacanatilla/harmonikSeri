import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz:");
        int n = inp.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println(result);
    }
}
