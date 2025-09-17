package packed;
import java.util.*;
public class Bai4 {
	static double money,laisuat;
	static int mounth;
	static Scanner sc;
	static void nhap() {
		sc=new Scanner(System.in);
		System.out.print("Nhap cac thong tin vao:\nSo tien gui:");
		money = sc.nextDouble();
		System.out.print("Lai suat nam:");
		laisuat = sc.nextDouble();
		System.out.print("So thang gui:");
		mounth =(int) sc.nextDouble();
	}
	static double soTienLai() {
		return money*((laisuat/100)/12)*mounth;
	}
	static double soTienGoc() {
		return money+soTienLai();
	}
	public static void main(String[] args) {
		nhap();
		System.out.print("So tien lai:"+soTienLai()+"\nSo tien goc cuoi ky:"+soTienGoc());
	}

}
