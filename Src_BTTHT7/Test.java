public class Test {
    public static void main(String[] args) {
        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A",
                "CNTT", "Dai hoc", 2022, 30, 50000);
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Hac Than Thoai : Wukong", "Ton Ngo Khong",
                "Ky ao", true, 2007, 15, 70000);

        QuanLySach qly = new QuanLySach();
        qly.themSach(gt);
        qly.themSach(tt);

        System.out.println("=== DANH SACH SACH ===");
        qly.hienThiTatCa();
    }
}