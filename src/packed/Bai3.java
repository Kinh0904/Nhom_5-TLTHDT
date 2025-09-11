package packed;
import java.util.*;
public class Bai3 {
	static int a,b;
	static Scanner sc;
	static void nhap() {
		sc=new Scanner(System.in);
		System.out.print("Nhap vao hai so:\na=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
	}
	static int Tong() {
		return a+b;
	}
	static int Hieu() {
		return a-b;
	}
	static long tich() {
		return a*b;
	}
	static void thuong() {
		if(b==0) {
			System.out.print("Khong tinh duoc.\n");
		}
		else
			System.out.print((a*1.0/b));
	}
	static void soDu() {
		if(b==0) {
			System.out.print("Khong tinh duoc.\n");
		}
		else
			System.out.print((a%b));
	}
	public static void main(String[] args) {
		nhap();
		System.out.print("Tong:"+Tong());
		System.out.print("\nHieu:"+Hieu());
		System.out.print("\nTich"+tich());
		System.out.print("\nThuong:");
		thuong();
		System.out.print("\nSo du:");
		soDu();
	}
}
