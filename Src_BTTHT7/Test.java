public class Test {
    public static void main(String[] args) {
        SachGiaoTrinh sgt = new SachGiaoTrinh( "TCC001", "Toan Cao Cap", "Nguyen Van A", 2020, 5, 50000,
                "Toan hoc", "Dai hoc");

        SachTieuThuyet stt = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2018, 10, 60000,
                "Ky ao", true);

        QuanLySach ql = new QuanLySach();
        ql.themSach(sgt);
        ql.themSach(stt);

        System.out.println("DANH SACH SACH");
        ql.hienThiTatCa();
    }
}