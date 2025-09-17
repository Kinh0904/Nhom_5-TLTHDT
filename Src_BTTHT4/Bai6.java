package packed;
import java.util.*;
public class Bai6 {
	static int BCNN,a,b;
	static Scanner sc=new Scanner(System.in);
	static void nhap() {
		System.out.println("Nhap vao hai so:");
		a= sc.nextInt();
		b= sc.nextInt();
	}
	static int UCLN() {
		int r;
		int a1=a,b1=b;
		while(b1!=0) {
			r=a1%b1;
			a1=b1;
			b1=r;
		}
		return a1;
	}
	static int BCNN() {
		return (a*b)/UCLN();
	}
	public static void main(String[] args) {
		nhap();
		System.out.println("UCLN="+UCLN());
		System.out.println("BCNN="+BCNN());
	}

}
