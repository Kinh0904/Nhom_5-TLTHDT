import java.util.ArrayList;
import java.util.Scanner;
public class Bài10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhap so luong phan tu ban dau: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("Danh sach hien tai: " + list);

        System.out.print("Nhap vi tri muon them: ");
        int posAdd = sc.nextInt();
        System.out.print("Nhap gia tri muon them: ");
        int valAdd = sc.nextInt();
        if (posAdd >= 0 && posAdd <= list.size()) {
            list.add(posAdd, valAdd);
        } else {
            System.out.println("Vi tri khong hop le");
        }
        System.out.println("Danh sach sau khi them: " + list);

        System.out.print("Nhap vi tri muon xoa: ");
        int posDel = sc.nextInt();
        if (posDel >= 0 && posDel < list.size()) {
            list.remove(posDel);
        } else {
            System.out.println("Vi tri khong hop le");
        }
        System.out.println("Danh sach sau khi xoa: " + list);

        sc.close();
    }
}
