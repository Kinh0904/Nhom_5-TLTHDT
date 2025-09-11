import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên từ bàn phím
        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();

        // Xuất ra màn hình
        System.out.println("Hello " + name);

        scanner.close();
    }
}