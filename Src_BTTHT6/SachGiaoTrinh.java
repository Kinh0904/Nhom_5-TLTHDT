public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach,String tieuDe, String tacGia,String monHoc, String capDo, int namXuatBan, int soLuong){
        super(maSach ,tieuDe , tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    String getMonHoc(){
        return monHoc;
    }
    void setMonHoc(String monHoc){
        this.monHoc = monHoc;
    }
    String getCapDo(){
        return capDo;
    }
    void setCapDo(String capDo){
        this.capDo = capDo;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Mon Hoc: "+ monHoc);
        System.out.println("Cap Do: "+ capDo);
    }
    public SachGiaoTrinh(){
        super();
    }
}
