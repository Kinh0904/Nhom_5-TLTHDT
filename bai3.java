import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        if (b != 0) {
            int thuong = a / b;  
            int du = a % b;       
            System.out.println("Tong = " + tong);
            System.out.println("Hieu = " + hieu);
            System.out.println("Tich = " + tich);
            System.out.println("Thuong = " + thuong);
            System.out.println("Phan du = " + du);
        }
         else 
        {
            System.out.println("Khong the chia cho 0!");
            System.out.println("Tong = " + tong);
            System.out.println("Hieu = " + hieu);
            System.out.println("Tich = " + tich);
        }
        sc.close();
    }
}
