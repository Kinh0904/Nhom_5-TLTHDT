public class SachTieuThuyet extends Sach{
    private String theLoai;
    private Boolean laSachSeries;
    public SachTieuThuyet(String maSach,String tieuDe, String tacGia,String theLoai, Boolean laSachSeries, int namXuatBan, int soLuong){
        super(maSach ,tieuDe , tacGia, namXuatBan, soLuong);
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
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("The Loai: "+ theLoai);
        System.out.println("La sach  series: " + (laSachSeries ?"Co" : "Khong"));
    }
    public SachTieuThuyet (){
        super();
    }
}
