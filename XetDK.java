import java.util.Scanner;
//sếch súng
public class XetDK {
    public static void main(String[] args) {
        int a;
        System.out.println("moi nhap lieu");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (a % 3 == 0) {
                System.out.println("so chan ");
            } else {
                System.out.println("so le ");
            }

        }

    }
}
