package Pack;

public class Test {
    public static void main(String[] args) {
        QuanLySach qlSach = new QuanLySach();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhap sach");
            System.out.println("2. Nhap sach tieu thuyet");
            System.out.println("3. Nhap sach giao trinh");
            System.out.println("4. Tim kiem sach theo ma sach");
            System.out.println("5. Tim kiem sach tieu thuyet theo ma sach");
            System.out.println("6. Tim kiem sach giao trinh theo ma sach");
            System.out.println("7. Cap nhat so luong sach theo ma sach");
            System.out.println("8. Cap nhat so luong sach tieu thuyet theo ma sach");
            System.out.println("9. Cap nhat so luong sach giao trinh theo ma sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    qlSach.NhapSach();
                    break;
                case 2:
                    qlSach.NhapSachTieuThuyet();
                    break;
                case 3:
                    qlSach.NhapSachGiaoTrinh();
                    break;
                case 4:
                    scanner.nextLine(); 
                    System.out.print("Nhap ma sach can tim: ");
                    String maSach = scanner.nextLine();
                    qlSach.TimKiemSachTheoMa(maSach);
                    break;
                case 5:
                    scanner.nextLine(); 
                    System.out.print("Nhap ma sach tieu thuyet can tim: ");
                    String maSachTieuThuyet = scanner.nextLine();
                    qlSach.TimKiemSachTieuThuyetTheoMa(maSachTieuThuyet);
                    break;
                case 6:
                    scanner.nextLine(); 
                    System.out.print("Nhap ma sach giao trinh can tim: ");
                    String maSachGiaoTrinh = scanner.nextLine();
                    qlSach.TimKiemSachGiaoTrinhTheoMa(maSachGiaoTrinh);
                    break;
                case 7:
                    scanner.nextLine(); 
                    System.out.print("Nhap ma sach can cap nhat so luong: ");
                    String maSachCapNhat = scanner.nextLine();
                    System.out.print("Nhap so luong moi: ");
                    int soLuongMoi = scanner.nextInt(); 
                    qlSach.capNhatSachTheoMa(maSachCapNhat, soLuongMoi);
                    break;
                case 8:
                    scanner.nextLine();
                    System.out.print("Nhap ma sach tieu thuyet can cap nhat so luong: ");
                    String maSachTieuThuyetCapNhat = scanner.nextLine();
                    System.out.print("Nhap so luong moi: ");
                    int soLuongMoiTieuThuyet = scanner.nextInt();
                    qlSach.capNhatSachTieuThuyetTheoMa(maSachTieuThuyetCapNhat, soLuongMoiTieuThuyet);
                    break;
                case 9:
                    scanner.nextLine();
                    System.out.print("Nhap ma sach giao trinh can cap nhat so luong: ");
                    String maSachGiaoTrinhCapNhat = scanner.nextLine();
                    System.out.print("Nhap so luong moi: ");
                    int soLuongMoiGiaoTrinh = scanner.nextInt();
                    qlSach.capNhatSachGiaoTrinhTheoMa(maSachGiaoTrinhCapNhat, soLuongMoiGiaoTrinh);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
                    break;
                }
            scanner.close();        
        } while (choice != 0);
        
    }
}