package Pack;

public class Test {
    public static void main(String[] args) {
        
        QuanLySach qlSach = new QuanLySach();
        SachTieuThuyet sachTieuThuyet1 = new SachTieuThuyet("002", "The Great Novel", "Author B", 2018, 5, "Fiction", true, 30000);
        SachGiaoTrinh sachGiaoTrinh1 = new SachGiaoTrinh("003", "Data Structures", "Author C", 2019, 7, "Computer Science", "Advanced", 50000, 5);

        qlSach.themSach(sachTieuThuyet1);
        qlSach.themSach(sachGiaoTrinh1);
        qlSach.hienThiTatCa();
        qlSach.timKiemTheoMa("002");
        qlSach.hienThiTatCa();
        qlSach.capNhatSach("002", sachTieuThuyet1);
        qlSach.hienThiTatCa();
        qlSach.xoaSach("003");
        qlSach.hienThiTatCa();
    }
}