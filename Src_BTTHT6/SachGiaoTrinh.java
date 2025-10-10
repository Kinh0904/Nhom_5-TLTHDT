public class SachGiaoTrinh extends Sach{
    private String monHoc;
    private String capDo;
   public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public String getmonHoc(){
        return monHoc;
    }
    public void setmonhoc(String monHoc){
        this.monHoc=monHoc;
    }
     public String getcapDo(){
        return capDo;
    }
    public void setcapDo(String capDo){
        this.capDo=capDo;
    }
    @Override
     public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("MON HOC:"+ monHoc);
        System.out.println("CAP DO:"+ capDo);
    }
    public SachGiaoTrinh(){
        super();
    }
}
