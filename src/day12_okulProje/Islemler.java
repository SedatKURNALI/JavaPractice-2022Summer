package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    //static yazmamizin sebebi tum methodlardan ulasamk icin gokte ki ay
    //gokteki ay gibi heryeden ulaşılabilsin


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();//kullanici kucuk harf girse bile buyuk harfe cevirdik cunku kontrol buyuk harfle yapcaz
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                break;
            case "Q":
         break;
            default:
                System.out.println("hatali giris :(");
                girisPaneli();
                break;
        }
    }
}