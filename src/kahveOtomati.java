import java.util.Scanner;

public class kahveOtomati {
    public static void main(String[] args) {
        System.out.println("QA 6 kafeye hoş geldiniz.");
        System.out.println("Lütfen kahve seçiminizi giriniz.");
        kahveTuru();
        seker();
        boyutSorgula();
        sutEkle();
        System.out.println("Siparişiniz için teşekkür ederiz kahveniz hazırlanıyor.");
    }
    public static void kahveTuru(){
        System.out.println("Filtre kahve için:1\nIced Cappuccino  için:2\nAmericano için:3" +
                "\nSignature Hot Chocolate için:4");
        Scanner scanner=new Scanner(System.in);
        int sayi= scanner.nextInt();
        if (sayi==1){
            System.out.println("Filtre kahve seçtiniz.");
        } else if (sayi==2) {
            System.out.println("Iced Cappuccino seçtiniz.");
        } else if (sayi==3) {
            System.out.println("Americano seçtiniz.");
        } else if (sayi==4) {
            System.out.println("Signature Hot Chocolate seçtiniz.");
        }
    }
    public static void seker(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Şeker ister misiniz?");
        System.out.println("");
        System.out.println("Evet yada Hayır giriniz.");
        String sekerTercihi = scanner.nextLine();
        if (sekerTercihi.equalsIgnoreCase("Evet")) {
            System.out.print("Kahvenize Kaç şeker istersiniz? ");
            int sekerSayisi = scanner.nextInt();
            scanner.nextLine();
            System.out.println(sekerSayisi + " Şeker eklenmiştir.Afiyet olsun...");
        } else if (sekerTercihi.equalsIgnoreCase("Hayır")) {
            System.out.println("Kahvenize Şeker Eklenmemiştir. Afiyet olsun...");
        }
    }//method sonu
    public static void sutEkle(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)");
        String sutEkle= scan.nextLine();
        if (sutEkle.equalsIgnoreCase("evet")){
            System.out.println("Eklenmesini istediğiniz süt çeşidi nedir?\n A-Laktoksuz\n B-yağsız\n C-Soya sütü");
            String sut= scan.next();
            if (sut.contains("A")){
                System.out.println("Laktoksuz süt seçilmiştir.");
            } else if (sut.contains("B")) {
                System.out.println("Yağsız süt seçilmiştir.");
            } else if(sut.contains("C")){
                System.out.println("Soya sütü seçilmiştir.");
            }else {
                System.out.println("hatalı giriş, tekrar giriş yapınız");
                sutEkle();
            }
        } else if (sutEkle.equalsIgnoreCase("hayır")){
            System.out.println("Süt eklenmemiştir!");
        }else {
            System.out.println("hatalı giriş yaptınız lütfen tekrar seçim yapınız!");
            sutEkle();
        }
    }
    static void boyutSorgula() {
        String kahveBoyutu;
        do {
            System.out.println("Hangi boyutta olsun? (Ekstra boy - Büyük boy - orta boy - küçük boy olarak giriniz.)");
            Scanner scan = new Scanner(System.in);
            kahveBoyutu = scan.nextLine();
            if (!kahveBoyutu.equalsIgnoreCase("ekstra boy") &&
                    !kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                    !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                    !kahveBoyutu.equalsIgnoreCase("kücük boy"))
                System.out.println("Hatalı giriş yaptınız....");
        } while (!kahveBoyutu.equalsIgnoreCase("ekstra boy") &&
                !kahveBoyutu.equalsIgnoreCase("büyük boy") &&
                !kahveBoyutu.equalsIgnoreCase("orta boy") &&
                !kahveBoyutu.equalsIgnoreCase("kücük boy"));
    }
}












