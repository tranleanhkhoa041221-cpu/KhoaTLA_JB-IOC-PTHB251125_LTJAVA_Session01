import java.util.Scanner;

public class Baitapgioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chiều Rộng Của Hình Chữ Nhật = ");
        float width = sc.nextFloat();
        System.out.println("Nhập Chiều Cao Của Hình Chữ Nhật = ");
        float height = sc.nextFloat();
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.printf("Width  = %.2f, Height = %.2f\n", width, height);
        System.out.printf("Diện Tích = %.2f\n", area);
        System.out.printf("Chu vi = %.2f",perimeter);
        sc.close();
    }
}
