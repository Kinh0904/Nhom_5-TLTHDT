public class Test {
    public static void main(String[] args) {
        System.out.println("Sach binh thuong");
        Sach sach1 = new Sach("S001", "Tay Du Ky", "Ngo Thua An", 2006, 10000);
        sach1.hienThiThongTin();

        System.out.println("\nSach dung dong goi");
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Hac Than Thoai: Ngo Khong");
        sach2.setTacGia("Duc Thang");
        sach2.setNamXuatBan(2024);
        sach2.setSoLuong(5000);
        sach2.hienThiThongTin();

        System.out.println("\nSach dung ke thua");
        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", "CNTT", "Dai hoc", 2022, 30);
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Harry Potter", "JK Rowling", "Ky ao", true, 2007, 15);

        QuanLySach ql = new QuanLySach();
        ql.themSach(sach1);
        ql.themSach(sach2);
        ql.themSach(gt);
        ql.themSach(tt);

        System.out.println("\nDanh sach tat ca cac sach");
        ql.hienThiTatCa();

        System.out.println("\nTim kiem sach TT01");
        Sach tim = ql.timKiemTheoMa("TT01");
        if (tim != null) tim.hienThiThongTin();

        System.out.println("\nXoa sach GT01");
        ql.xoaSach("GT01");
        ql.hienThiTatCa();

        System.out.println("\nCap nhat lai sach TT01");
        SachTieuThuyet ttMoi = new SachTieuThuyet("TT01", "Harry Potter và Hoi Phuong Hoang", "JK Rowling", "Ky ao", true, 2008, 20);
        ql.capNhatSach("TT01", ttMoi);
        ql.hienThiTatCa();
    }
}
