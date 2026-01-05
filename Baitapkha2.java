import java.util.Scanner;

public class Baitapkha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập firstNumber = ");
        int firstNumber = sc.nextInt();
        System.out.println("Nhập secondNumber = ");
        int secondNumber = sc.nextInt();
        int tong = firstNumber + secondNumber;
        int hieu = firstNumber - secondNumber;
        int tich = firstNumber * secondNumber;
        int thuong = firstNumber / secondNumber;
        int phandu = firstNumber % secondNumber;

        System.out.println("--- Kết quả ---");
        System.out.printf("firstNumber = %d\n", firstNumber);
        System.out.printf("secondNumber = %d\n", secondNumber);
        System.out.printf("Tổng = %d\n", tong);
        System.out.printf("Hiệu = %d\n", hieu);
        System.out.printf("Tích = %d\n", tich);
        System.out.printf("Thương = %d\n", thuong);
        System.out.printf("Phần dư = %d\n", phandu);

        sc.close();
    }

}
