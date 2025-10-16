public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(){
    }

    public SachGiaoTrinh(String maSach,String tieuDe, String tacGia,String monHoc, String capDo, int namXuatBan, int soLuong, double giaCoBan){
        super(maSach,tieuDe,tacGia,namXuatBan,soLuong,giaCoBan);
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
    public double tinhGiaBan(){
        int soNam = 2025 - getNamXuatBan();
        if (soNam < 0) soNam = 0;
            return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMon hoc: " + monHoc +
                "\nCap do: " + capDo +
                "\nGia ban ra: " + tinhGiaBan();
    }
}
