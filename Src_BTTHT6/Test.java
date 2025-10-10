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

        System.out.println("--------------");
        SachGiaoTrinh s3 = new SachGiaoTrinh("B003", "Lap trinh C++", "Nguyen Van C", 2021, 15, "Lap trinh", "Dai cuong");
        s3.hienThiThongTin();

        System.out.println("--------------");
       SachTieuThuyet s4 = new SachTieuThuyet("B004", "Chuyen ma", "Nguyen Van D", 2019, 5, "Kinh di", true);
        s4.hienThiThongTin();

        System.out.println("--------------");
        QuanLySach ql=new QuanLySach();
        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);
        ql.themSach(s4);

        System.out.println("Danh sach tat ca cac sach:");
        ql.hienThiTatCa();

        System.out.println("Tim kiem sach theo ma sach B002:");
        Sach timKiem=ql.timKiemTheoMa("B002");
        if(timKiem!=null){
             timKiem.hienThiThongTin();
        }
        else{
             System.out.println("Khong tim thay sach voi ma sach do.");
       }

        System.out.println("--------------");
        System.out.println("Cap nhat thong tin sach co ma sach B001:");
        ql.capNhatSoLuong("B001",12);
        ql.hienThiTatCa();
        
        System.out.println("--------------");
        System.out.println("Xoa sach co ma sach B003:");
        ql.xoaSach(s3);
        ql.hienThiTatCa();
    }
}
