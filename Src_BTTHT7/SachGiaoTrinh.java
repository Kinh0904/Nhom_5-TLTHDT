public class SachGiaoTrinh extends Sach{
    private String monHoc;
    private String capDo;
   public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giaCoBan);
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
    @Override
    public double giaBan(){
        int sonamXuatBan = 2025-getNamXuatBan();
        return getGiaCoBan()+(sonamXuatBan*5000);
    }
    @Override
    public String toString(){
        return super.toString()+ "SachGiaoTrinh{" +
                "monHoc='" + monHoc + '\'' +
                ", capDo='" + capDo + '\'' +
                "\n giaBan='" + giaBan() + '\'' +
                '}';
    }
}
