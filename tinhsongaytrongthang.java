import java.util.Scanner;

public class tinhsongaytrongthang {
    public static void main(String[] args) {
        int Thang ;
        System.out.println("nhap thang ");
        Scanner sc = new Scanner(System.in);
        Thang = sc.nextInt();
        switch (Thang){
            case 1:
            case 3 :
            case 5 :
            case 7 : case 8:
            case 10 : case 12 : System.out.println(" co 31 ngay ");
            break;
            case 4:
            case 6 :
            case 9 : case 11 :
             System.out.println(" co 30 ngay ");
                break;
            case 2 : System.out.println("co 28 hoac 29 ngay ");
            break;
            default: System.out.println("khong xac dinh");

        }
    }
}
