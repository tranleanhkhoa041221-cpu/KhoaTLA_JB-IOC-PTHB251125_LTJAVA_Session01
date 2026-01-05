import java.util.Scanner;

public class Baitapgioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tử Số 1 = ");
        int a = sc.nextInt();
        System.out.println("Nhập Mẫu Số 1 = ");
        int b = sc.nextInt();
        System.out.println("Nhập Tử Số 2 = ");
        int c = sc.nextInt();
        System.out.println("Nhập Mẫu Số 2 = ");
        int d = sc.nextInt();
        int tuso = (a*d) + (b*c);
        int mauso = b*d;

        System.out.printf("Kết quả = %d/%d ", tuso, mauso);

        sc.close();


    }
}
