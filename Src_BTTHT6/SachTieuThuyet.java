public class SachTieuThuyet extends Sach{
    private String theLoai;
    private boolean laSachserie;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSerie){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai=theLoai;
        this.laSachserie=laSachSerie;
    }
    public String gettheLoai(){
        return theLoai;
    }
    public void settheLoai(String theLoai){
        this.theLoai=theLoai;
    }
     public boolean getlaSachserie(){
        return laSachserie;
    }
    public void setlaSachserie(boolean laSachserie){
        this.laSachserie=laSachserie;
    }
    @Override
     public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("THE LOAI:"+ theLoai);
        System.out.println("LA SACH SERIE:"+ laSachserie);
    }
    public SachTieuThuyet(){
        super();
    }
}
