import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiTatCa() {
    for (Sach s : danhSach) {
        System.out.println(s);
        System.out.println("----------------------");
    }
}

}