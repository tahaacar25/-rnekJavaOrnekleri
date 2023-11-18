import java.util.Scanner;

public class manavUygulamasi {
    public static void main(String[] args) {
         /*
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Ürün Kg Fiyatları

Salatalık : 17,25 TL
Biber : 24,25 TL
Portakal : 12,75 TL
Domates: 20,35 TL
Patlıcan : 22,00 TL



        Scanner scanner = new Scanner(System.in);

        double Salatalık = 17.25;
        double Biber = 24.25;
        double Portakal = 12.75;
        double Domates = 20.35;
        double Patlıcan = 22.00;
        double Fasulye = 40.00;

        System.out.println("Salatalık kaç kilo:");
        double SalatalıkKilo = scanner.nextDouble();

        System.out.println("Biber kaç kilo:");
        double BiberKilo = scanner.nextDouble();

        System.out.println("Portakal kaç kilo:");
        double PortakalKilo = scanner.nextDouble();

        System.out.println("Domates kaç kilo:");
        double DomatesKilo = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo:");
        double PatlıcanKilo = scanner.nextDouble();

        System.out.println("Fasulye kaç kilo:");
        double FasulyeKilo = scanner.nextDouble();

        double toplam =(Salatalık*SalatalıkKilo + Biber*BiberKilo + Portakal*PortakalKilo + Domates*DomatesKilo + Patlıcan*PatlıcanKilo + Fasulye*FasulyeKilo);
        System.out.println( "toplam tutar : "+toplam +"TL'dir");



          */

/*
 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Ürün Kg Fiyatları

Salatalık : 17,25 TL
Biber : 24,25 TL
Portakal : 12,75 TL
Domates: 20,35 TL
Patlıcan : 22,00 TL
 */
        Scanner scanner = new Scanner(System.in);

        double SalatalıkFiyat = 17.25;
        double BiberFiyat = 24.25;
        double PortakalFiyat = 12.75;
        double DomatesFiyat = 20.35;
        double PatlıcanFiyat = 22.00;
        double FasulyeFiyat = 40.00;

        boolean ürün = true;
        double toplamTutar = 0.0;


        while (ürün) {
            System.out.println("Hangi ürünü alacaksınız? (Salatalık / Biber / Portakal / Domates / Patlıcan / Fasulye)");
            String urunAdi = scanner.nextLine().toLowerCase();

            double urunFiyat = 0.0;

            switch (urunAdi) {
                case "salatalık":
                    urunFiyat = SalatalıkFiyat;
                    break;
                case "biber":
                    urunFiyat = BiberFiyat;
                    break;
                case "portakal":
                    urunFiyat = PortakalFiyat;
                    break;
                case "domates":
                    urunFiyat = DomatesFiyat;
                    break;
                case "patlıcan":
                    urunFiyat = PatlıcanFiyat;
                    break;
                case "fasulye":
                    urunFiyat = FasulyeFiyat;
                    break;
                default:
                    System.out.println("Geçersiz ürün adı!");

            }

            System.out.println("Kaç kilo " + urunAdi + " alacaksınız?");
            double kilo = scanner.nextDouble();

            double tutar = urunFiyat * kilo;
            toplamTutar += tutar;

            System.out.println(kilo + " kilo " + urunAdi + " toplam tutar: " + tutar + " TL");

            System.out.println("Başka ürün almak istiyor musunuz? (evet / hayır)");
            scanner.nextLine();
            String devamSecimi = scanner.nextLine().toLowerCase();
            if (devamSecimi.equals("hayır")) {
                ürün = false;
            }
        }

        System.out.println("Toplam tutar: " + toplamTutar + " TL");



    }
}

































