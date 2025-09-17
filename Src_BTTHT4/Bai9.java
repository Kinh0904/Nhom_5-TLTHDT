package packed;
import java.util.*;
public class Bai9 {
	static ArrayList<Integer> ar = new ArrayList<Integer>();
	static Random generator = new Random(19900828);
	static void taomang(int n) {
		for(int i=0;i<n;i++) {
			ar.add(generator.nextInt(n));
		}
	}
	static void in(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(" "+ar.get(i));
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap so phan tu:");
		n=new Scanner(System.in).nextInt();
		taomang(n);
		System.out.println("Mang duoc tao:");
		in(n);
	}
}
