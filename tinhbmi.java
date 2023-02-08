import java.util.Scanner;

public class tinhbmi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("khai can nang de (in kilogram):");
        weight = scanner.nextDouble();
        System.out.print("khai chieu cao de (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "gay");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "binh thuong");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "kha cao");
        else
            System.out.printf("%-20.2f%s", bmi, "cao vl");
    }
}