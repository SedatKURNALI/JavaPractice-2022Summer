package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    //static scanner yazmamizin sebebi tum methodlardan ulasmak icin
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                girisPaneli();
                break;
        }


    }

    public static void islemMenusu() {
        System.out.println("Sectigin kisi turu " + kisiTuru + " lutfen asagidaki islemleri seciniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("islem tercihinizi giriniz");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                break;
            default:
                System.out.println("lutfen dogru secim yapiniz");
                islemMenusu();
                break;
        }
    }

    private static void silme() {
        scan.nextLine();
        System.out.println("Silme menusundesiniz.Silmek istediğiniz kişinin adını giriniz");
        String isim = scan.nextLine();
        int index = -1;
        if (kisiTuru.equals("OGRENCI")) {
            for (int i = 0; i < ogrncList.size(); i++) {
                if (ogrncList.get(i).getAdSoyad().contains(isim)) {
                    System.out.println(ogrncList.get(i));//satir calismazsa to string dene
                    index=i;
                }
            }
        } else {
            for (int i = 0; i < ogretmnList.size(); i++) {
                if (ogretmnList.get(i).getAdSoyad().contains(isim)) {
                    System.out.println(ogretmnList.get(i));
                    index=i;
                }
            }
        }
        System.out.println("Silmek istediginize emin misiniz?(E-H)");
        String secim=scan.next();
        if (secim.equalsIgnoreCase("E") && index!=-1){
            if (kisiTuru.equals("OGRENCI")){
                ogrncList.remove(index);
                System.out.println(ogrncList);
            }else {
                ogretmnList.remove(index);
                System.out.println(ogretmnList);
            }
        }
    }

    private static void listeleme() {
        if (kisiTuru.equals("OGRENCI")){
            System.out.println(ogrncList+"");
        }else {
            System.out.println(ogretmnList);
        }
    }

    private static void arama() {

        scan.nextLine();
        System.out.println("Arama menusundesiniz.Aramak istediğiniz kişinin adını giriniz");
        String isim = scan.nextLine();

        if (kisiTuru.equals("OGRENCI")) {
            for (int i = 0; i < ogrncList.size(); i++) {
                if (ogrncList.get(i).getAdSoyad().contains(isim)) {
                    System.out.println(ogrncList.get(i));//satir calismazsa to string dene
                }
            }
        } else {
            for (int i = 0; i < ogretmnList.size(); i++) {
                if (ogretmnList.get(i).getAdSoyad().contains(isim)) {
                    System.out.println(ogretmnList.get(i));
                }
            }
        }
    }
    private static void ekle() {//bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi

        System.out.println("**** " + kisiTuru + " ekleme sayfasina hos geldiniz");

        System.out.println("isim soyisim giriniz");
        scan.nextLine();//dummy attik araya hata vermesin diye
        String adSoyad = scan.nextLine();

        System.out.println("kimlik giriniz");
        String kimlikNo = scan.nextLine();

        System.out.println("yas giriniz");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCI")) {

            System.out.println("Ogrenci no gir");
            scan.nextLine();
            String ogrenciNo = scan.nextLine();
            //dummy6 kod hata almamak icin
            System.out.println("Sinifinizi giriniz");
            String sinif = scan.nextLine();
            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrncList.add(ogrenci);
            System.out.println(ogrncList);
        } else {//ogrenci degilse ogretmen deyiz su anda
            System.out.println("Bolum giriniz");
            String bolum = scan.nextLine();
            scan.nextLine();//hata almamak icin
            System.out.println("Sicil no giriniz");
            String sicilNo = scan.nextLine();

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmnList.add(ogretmen);
            System.out.println(ogretmnList);
        }

    }
}

