package packed;
import java.util.*;
public class Bai1 {
	static String name;
	static Scanner sc = new Scanner(System.in);
	static void nhap() {
		System.out.print("Nhap ten cua ban:");
		name= sc.nextLine();
	}
	public static void main(String[] args) {
		nhap();
		System.out.print("Hello "+name);
	}
}
