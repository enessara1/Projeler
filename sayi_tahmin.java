import java.util.Random;
import java.util.Scanner;

/**
 * sayi_tahmin
 */
 public class sayi_tahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz");
        System.out.println("Lütfen 1-100 arasında bir sayı tutunuz");
        int tahmin = input.nextInt();
        int sayi = rnd.nextInt(101);

        while(tahmin != sayi) {
            if (tahmin < 0 || tahmin > 100) {
                System.out.println("lütfen geçerli bir sayı giriniz");
                tahmin =input.nextInt();
            }
            else if(tahmin < sayi){
                System.out.println("Daha büyük bir sayı giriniz");
                tahmin = input.nextInt();
            }
            else  {
            System.out.println("Daha küçük bir sayı giriniz");
            tahmin = input.nextInt();
            }

        }
        System.out.println("tebrikler doğru bildiniz");
    }
}