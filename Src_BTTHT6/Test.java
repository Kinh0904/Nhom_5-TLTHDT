public class Test {
    public static void main(String[] args) {
        System.out.println("Sach binh thuong  ");
        Sach sach1 = new Sach("S001", " Lap trinh Java", "Vu Thi Phuong Thao", 2022, 10);
        sach1.hienThiThongTin();

        System.out.println("\nSach dung dong goi");
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Lap trinh huong doi tuong ");
        sach2.setTacGia("Vo Hoai Thuong");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);
        sach2.hienThiThongTin();

        System.out.println("\nSach dung ke thua");
        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Lap trinh co ban C", "Hoang Thi My le", "CNTT", "Dai hoc",2022,1);
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Me Before You ", "Jojo Moyes", "Lang man", true, 2012, 150);

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
        SachTieuThuyet ttMoi = new SachTieuThuyet("TT01", "Me Before You", "Jojo Moyes", "Lang man", true, 2012, 150);
        ql.capNhatSach("TT01", ttMoi);
        ql.hienThiTatCa();
    }
}
