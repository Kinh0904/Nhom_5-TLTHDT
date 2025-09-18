import java.util.Scanner;
public class Bài6 {
      public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        int ucln = UCLN(a, b);
        int bcnn = BCNN(a, b);
        System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
        System.out.println("BCNN cua " + a + " va " + b + " la: " + bcnn);
        sc.close();
    }
}
