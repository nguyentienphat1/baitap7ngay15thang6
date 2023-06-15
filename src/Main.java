import java.util.Scanner;

public class Main {
    public static void tongcacstn(int n){
        int tong=0;
        System.out.println("tong các số tự nhiên nhỏ hơn hoặc bằng n là : ");
        for (int i=0;i<=n;i++){
            tong=tong +n;
        }
        System.out.println(tong);
    }
    public static void sotnchan(int n){
        int tong=0;
        System.out.println("tổng các số tự nhiên chẵn là : ");
        for (int i=1;i<=n;i++){
            if (i%2==0){
                tong=tong+i;
            }
        }
        System.out.println(tong);
    }
    public static void stnle(int n){
        int tong=0;
        System.out.println("tổng các số tự nhiên lẽ là : ");
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                tong=tong+i;
            }
        }
        System.out.println(tong);
    }
    public static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<n;i++){
                if (n%i==0){
                    return false;
                }
        }
        return true;
    }
    public static void xuli(int n){
        int tong=0;
        System.out.println("tong của các số nguyên tố là : ");
        for (int i=1;i<=n;i++) {
            if (isprime(i)) {
                tong = tong + i;
            }
        }
        System.out.println(tong);
    }
    public static void sntdautien(int n){
        for (int i=1;i<=n;i++) {
            if (isprime(i)) {
                System.out.println("số nguyên to đầu tiên là ");
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        tongcacstn(n);
        sotnchan(n);
        stnle(n);
        xuli(n);
        sntdautien(n);
    }
}