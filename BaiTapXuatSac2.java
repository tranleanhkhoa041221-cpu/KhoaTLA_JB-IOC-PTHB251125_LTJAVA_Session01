import java.util.Scanner;

public class BaiTapXuatSac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Vận Tốc : ");
        int vantoc = sc.nextInt();
        System.out.println("Nhập Thời Gian :");
        float thoigian = sc.nextFloat();
        float quangduong = vantoc * thoigian;
        System.out.printf("Vận tốc = %d\n", vantoc);
        System.out.printf("Thời gian = %.1f\n", thoigian);
        System.out.printf("Quãng đường = %.0f\n", quangduong);
        sc.close();

    }
}
