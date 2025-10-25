import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSach(String maSach) {
        danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("=== DANH SACH SACH ===");
        for (Sach s : danhSach) {
            System.out.println(s);
            System.out.println("----------------------");
        }
    }
}
