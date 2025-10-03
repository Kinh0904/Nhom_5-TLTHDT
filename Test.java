public class Test {
    public static void main(String[] args){
        Sach s1= new Sach("B001","Lap trinh Java","Nguyen Van A",2022,10);
        Sach s2=new Sach();
        s2.setMaSach("B002");
        s2.setTieuDe("Co so du lieu");
        s2.setTacGia("Nguyen Van B");
        s2.setNamXuatBan(2020);
        s2.setSoLuong(20);
        s1.hienThiThongTin();
        s2.hienThiThongTin();
    }
}
