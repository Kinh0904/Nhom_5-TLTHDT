import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        quanLy.themSach(new SachGiaoTrinh("GT01", "Lap trinh C cơ ban", "Hoang Thi My le",
                "CNTT", "Dai hoc",23,2022,1));
        quanLy.themSach(new SachTieuThuyet(    "TT01", "Me Before You",  "Jojo Moyes","Lang man", true, 2012, 15,15.6));

        int chon;
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi tat ca sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("6. Cap nhat vi tri (ke)");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> {
                    System.out.print("Ma sach: "); String maSach = sc.nextLine();
                    System.out.print("Tieu de: "); String tieuDe = sc.nextLine();
                    System.out.print("Tac gia: "); String tacGia = sc.nextLine();
                    System.out.print("Mon hoc: "); String monHoc = sc.nextLine();
                    System.out.print("Cap do: "); String capDo = sc.nextLine();
                    System.out.print("Nam Xuat Ban: "); int namXuatBan = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: "); int soLuong = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: "); double giaCoBan = Double.parseDouble(sc.nextLine());
                    quanLy.themSach(new SachGiaoTrinh(maSach, tieuDe, tacGia, monHoc, capDo, namXuatBan, soLuong, giaCoBan));
                }
                case 2 -> {
                    System.out.print("Ma sach: "); String maSach = sc.nextLine();
                    System.out.print("Tieu de: "); String tieuDe = sc.nextLine();
                    System.out.print("Tac gia: "); String tacGia = sc.nextLine();
                    System.out.print("The loai: "); String theLoai = sc.nextLine();
                    System.out.print("La series (Co/Khong): "); boolean laSeries = Boolean.parseBoolean(sc.nextLine());
                    System.out.print("Nam Xuat Ban: "); int namXuatBan = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: "); int soLuong = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: "); double giaCoBan = Double.parseDouble(sc.nextLine());
                    quanLy.themSach(new SachTieuThuyet(maSach, tieuDe, tacGia, theLoai, laSeries, namXuatBan, soLuong, giaCoBan));
                }
                case 3 -> quanLy.hienThiDanhSach();
                case 4 -> {
                    System.out.print("Nhap ma can tim: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay!");
                }
                case 5 -> {
                    System.out.print("Nhap ma can xoa: ");
                    String ma = sc.nextLine();
                    quanLy.xoaSach(ma);
                }
                case 6 -> {
                    System.out.print("Nhap ma sach can cap nhat vi tri: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.print("Nhap ke moi: ");
                        String keMoi = sc.nextLine();
                        s.capNhatViTri(keMoi);
                    } else System.out.println("Khong tim thay!");
                }
            }
        } while (chon != 0);
        System.out.println(" Ket thuc chuong trinh.");
    }
}