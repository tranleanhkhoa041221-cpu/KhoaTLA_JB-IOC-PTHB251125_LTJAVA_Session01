import java.util.Scanner;

public class Baitapkha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Bán Kính = ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.printf("Với bán kính là %.0f, diện tích tính được là %.2f", radius, area);
        sc.close();
        }
    }
