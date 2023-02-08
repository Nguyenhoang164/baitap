import java.util.Scanner;

public class sosanh {
    public static void main ( String[] args){
        int a , b ;
        System.out.println("Yeu cau nguoi dung nhap du lieu a : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Yeu cau nguoi dung nhap du lieu b : ");
        Scanner rx = new Scanner(System.in);
        b = rx.nextInt();
         if (a>b){
             System.out.println("a lon hon b ");
         } else if (a<b) {
             System.out.println("a nho hon b");
         } else {
             System.out.println("a = b");
         }
    }
}
