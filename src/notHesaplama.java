import java.util.Scanner;

public class notHesaplama {

        public static void main(String[] args) {
          /*
           Öğrencilerin aldığı notlara göre bir sınıfın geçme Methodu hazırlayınız.
           içerik: if for method
           */



            Scanner scanner = new Scanner(System.in);

            System.out.print("Kaç adet not gireceksiniz: ");
            int notSayisi = scanner.nextInt();

            int[] notlar = new int[notSayisi];
            for (int i = 0; i < notSayisi; i++) {
                System.out.print((i + 1) + ". notu girin: ");
                notlar[i] = scanner.nextInt();
            }



            double ortalama = ortalamaHesapla(notlar);
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Durum: " + gecmeDurumu(ortalama));
        }
    public static double ortalamaHesapla(int[] notlar) {
        int toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }
        return (double) toplam / notlar.length;
    }

    public static String gecmeDurumu(double ortalama) {
        if (ortalama >= 60) {
            return "Geçti";
        } else {
            return "Kaldı";
        }
    }
    }




