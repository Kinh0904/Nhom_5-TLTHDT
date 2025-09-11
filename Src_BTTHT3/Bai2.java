public class ThongTinCaNhan {
    public static void main(String[] args) 
    {
        String ten = "Nguyen Vo Thanh Tu "; 
        int tuoi = 19;                
        double chieuCao = 1.72;        
        char gioiTinh = 'M';    // giới tính (char: 'M' = Nam, 'F' = Nữ)      
        boolean thichLapTrinh = true;  
        System.out.println("===== Thông tin cá nhân =====");
        System.out.println("Tên: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Chieu cao: " + chieuCao + " m");
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Co thich lap trinh khong? " + thichLapTrinh);
    }
}
