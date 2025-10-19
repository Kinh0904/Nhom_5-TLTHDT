
public class SachTieuThuyet extends Sach{
    private String theLoai;
    private Boolean laSachSeries;

    public SachTieuThuyet (){
    }

    public SachTieuThuyet(String maSach,String tieuDe, String tacGia,String theLoai, Boolean laSachSeries, int namXuatBan, int soLuong, double giaCoBan){
        super(maSach,tieuDe,tacGia,namXuatBan,soLuong,giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    String getTheLoai(){
        return theLoai;
    }

    void setTheLoai(String theLoai){
        this.theLoai = theLoai;
    }

    Boolean getLaSachSeries(){
        return laSachSeries;
    }

    void setLaSachSeries(Boolean laSachSeries){
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan(){
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nThe loai: " + theLoai +
                "\nLa sach series: " + (laSachSeries ? "Co" : "Khong") +
                "\nGia ban ra: " + tinhGiaBan();
    }
}
