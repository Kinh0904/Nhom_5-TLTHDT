public class Test {
    public static void main(String[] args) {
        System.out.println("Sach 1:");
        Sach Sach1=new Sach("S001","Tay Du Ky","Ngo Thua An",2006,10000);
        Sach1.hienThiThongTin();
        System.out.println("Sach 2:");
        Sach Sach2=new Sach();
        Sach2.setMaSach("S002");
        Sach2.setTieuDe("Hac Than Thoai: Ngo Khong");
        Sach2.setTacGia("Duc Thang");
        Sach2.setNamXuatBan(2024);
        Sach2.setSoLuong(5000);
        Sach2.hienThiThongTin();
    }
}
