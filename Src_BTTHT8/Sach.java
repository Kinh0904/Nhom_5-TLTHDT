public abstract class Sach implements IGiaBan, IKiemKe {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatban;
    protected int soLuong;
    protected double giaCoBan;

public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatban = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }
public Sach() {
    }

public String getMaSach() {
        return maSach;
    }

public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
public String getTieuDe() {
        return tieuDe;
    }
 public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
public String getTacGia() {
        return tacGia;
    }
 public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
public int getNamXuatBan() {
        return namXuatban;
    }
public void setNamXuatBan(int namXuatBan) {
        this.namXuatban = namXuatBan;
    }
public int getSoLuong() {
        return soLuong;
    }
 public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
public double getGiaCoBan() {
        return giaCoBan;
    }
public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
 public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatban);
        System.out.println("So luong: " + soLuong);
 }
 @Override
 public String toString() {
     return "Sach{" +
             "maSach='" + maSach + '\'' +
             ", tieuDe='" + tieuDe + '\'' +
             ", tacGia='" + tacGia + '\'' +
             ", namXuatban=" + namXuatban +
             ", soLuong=" + soLuong +
             ", giaCoBan=" + giaCoBan +
             '}';
 }
 public abstract double giaBan();
 @Override
 public boolean kiemTraTonKho(int SoLuongToiThieu) {
        return soLuong >= SoLuongToiThieu;
    }
 @Override
 public void capNhatViTri(String ViTriMoi) {
        System.out.println("Cap nhat vi tri sach " + maSach + " den vi tri moi: " + ViTriMoi);
    }
}