import java.util.Scanner ;
public class GiaiptBac1 {
    public static void main(String[] args) {

        double a, b, c;
        System.out.println("chuong trinh tim x qua pt ax + b = c");
        System.out.println("Nhap a : ");
        Scanner ax = new Scanner(System.in);
        a = ax.nextInt();
        System.out.println("Nhap b :");
        Scanner bx = new Scanner(System.in);
        b = bx.nextInt();
        System.out.println("Nhap c : ");
        Scanner cx = new Scanner(System.in);
        c = cx.nextInt();
        double answer = (c - b) / a;
        if (a != 0) {
            System.out.println("ket qua x la "  + answer );
        } else {
            if (b == c) {
                System.out.println("Nghiem la x ");
            } else {
                System.out.println("khong co ket qua");
            }
        }
    }
}


