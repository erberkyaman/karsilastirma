import  java.util.Scanner;
public class karsilastirma {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Girin: ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        b= input.nextInt();
        System.out.print("Üçüncü Sayıyı Girin: ");
        c= input.nextInt();

        if(a>b && a>c){
            if (b>c){
                System.out.print("a>b>c");
            }else if (c>b){
                System.out.print("a>c>b");
            }else{
                System.out.print("a>b=c");
            }
        } else if (b>a && b>c) {
            if (a>c){
                System.out.print("b>a>c");
            }else if (c>a){
                System.out.print("b>c>a");
            }else{
                System.out.print("b>a=c");
            }
        } else if (c>b && c>a) {
            if (b>a){
                System.out.print("c>b>a");
            }else if (a>b){
                System.out.print("c>a>b");
            }else{
                System.out.print("c>b=a");
            }
        } else {
            System.out.println("Hatalı Sayı Girişi Yapıldı veya Tüm Sayılar Eşit !");
        }
    }
}
