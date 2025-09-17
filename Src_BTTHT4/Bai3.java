package packed;
import java.util.*;
public class Bai3 {
	public static void main(String[] args) {
		System.out.println("Nhap vao hai so");
		int a= new Scanner(System.in).nextInt();
		int b= new Scanner(System.in).nextInt();
		System.out.println("Nhap: '+','-','*','/'.");
		char choice = new Scanner(System.in).next().charAt(0);
		switch(choice) {
		case '+':{
			int c=a+b;System.out.println(a + "+" + b +"="+c);
		}break;
		case '-':{
			int c=a-b;System.out.println(a + "-" + b +"="+c);
		}break;
		case '*':{
			int c=a*b;System.out.println(a + "*" + b +"="+c);
		}break;
		case '/':{
			if(b!=0) {
			float c=(float) a/b;System.out.println(a + "/" + b +"="+c);
			}else
			{
				System.out.print("Khong tinh duoc.");
			}
		}break;
		default:System.out.print("Nhap sai.");
		}
	}
}
