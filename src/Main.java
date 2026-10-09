import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x, n, e: ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double e = sc.nextDouble();

        double a = 1, s1 = 0, s2 = 0, s3 = 0;

        for (int i = 0; ; i++) {
            if (i < n) s1 += a;
            if (Math.abs(a) > e) s2 += a;
            if (Math.abs(a) > e / 10) s3 += a;
            if (i >= n - 1 && Math.abs(a) <= e / 10) break;
            a *= -x * x / ((2.0 * i + 2.0) * (2.0 * i + 3.0));
        }

        double f = (x == 0) ? 1 : Math.sin(x) / x;

        System.out.printf("1) %.6f\n2) %.6f\n3) %.6f\n4) %.6f\n", s1, s2, s3, f);
    }
}