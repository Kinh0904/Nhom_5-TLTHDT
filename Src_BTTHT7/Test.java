public class Test {
    public static void main(String[] args) {
        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Lap trinh co ban C", "Hoang Thi My le", "CNTT", "Dai hoc",23,2022,1);
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Me Before You ", "Jojo Moyes", "Lang man", true, 2012,15, 150);

        QuanLySach qly = new QuanLySach();
        qly.themSach(gt);
        qly.themSach(tt);

        System.out.println("=== DANH SACH SACH ===");
        qly.hienThiTatCa();
    }
}