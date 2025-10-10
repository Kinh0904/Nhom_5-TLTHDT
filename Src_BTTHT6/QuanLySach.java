import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void xoaSach(Sach s) {
        danhSach.remove(s);
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timKiemTheoMa(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
        }
    }

    public void hienThiTatCa() {
        for (Sach s : danhSach) {
            s.hienThiThongTin();
            System.out.println("----------------------");
        }
    }
}