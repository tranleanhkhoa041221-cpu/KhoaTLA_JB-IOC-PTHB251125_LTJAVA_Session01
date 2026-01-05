import java.util.Scanner;

public class BaiTapXuatSac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Cân Nặng : ");
        int cannang = sc.nextInt();
        System.out.println("Nhập Chiều Cao : ");
        float chieucao = sc.nextFloat();
        float BMI = cannang / (chieucao*chieucao);
        System.out.printf("Cân nặng = %d\n", cannang);
        System.out.printf("Chiều cao = %.2f\n", chieucao);
        System.out.printf("BMI = %.2f", BMI);
        sc.close();

    }
}
