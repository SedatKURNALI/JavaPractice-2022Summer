package day12_okulProje;

import static day12_okulProje.Islemler.*;

public class Runner {
    public static void main(String[] args) {
        //String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif
        Ogrenci ogrenci1 = new Ogrenci("Lionel Messi" , "129402930", 35, "10", "1");
        Ogrenci ogrenci2 = new Ogrenci("Cristiano Ronaldo" , "229402930", 36, "7", "2");
        Ogrenci ogrenci3 = new Ogrenci("Gheorghe Hagi" , "329402930", 45, "11", "3");
        Ogrenci ogrenci4 = new Ogrenci("Melih Irfan" , "429402930", 35, "17", "4");
        Ogrenci ogrenci5 = new Ogrenci("Marilyn Monroe" , "529402930", 18, "100", "5");
        ogrncList.add(ogrenci1);
        ogrncList.add(ogrenci2);
        ogrncList.add(ogrenci3);
        ogrncList.add(ogrenci4);
        ogrncList.add(ogrenci5);
        //String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo
        Ogretmen ogretmen1 = new Ogretmen("Sedat Kurnali" , "1345302930", 44, "Bilgisayar", "12344");
        Ogretmen ogretmen2 = new Ogretmen("Ali Candan" , "254352930", 36, "Fen Bilgisi", "2232131");
        Ogretmen ogretmen3 = new Ogretmen("Sadik Ulucay" , "3293532930", 28, "Sinif", "36565");
        Ogretmen ogretmen4 = new Ogretmen("Ziya Cetin" , "4234534930", 65, "Matematik", "465534");
        Ogretmen ogretmen5 = new Ogretmen("Habibe Soysal" , "5295453930", 38, "Ingilizce", "4234235");
        ogretmnList.add(ogretmen1);
        ogretmnList.add(ogretmen2);
        ogretmnList.add(ogretmen3);
        ogretmnList.add(ogretmen4);
        ogretmnList.add(ogretmen5);


        girisPaneli();


        //Islemler.girisPaneli(); class ismi ile de cagrilabilir fakat clean code icin yukaridaki
        //gibi import yaptik, once kirmizi yaniyor biz import yapiyoruz
    }
}

/*
if(kisiTuru.equals("OGRENCI")){
    System.out.print("Ogrenci No giriniz : ");
    String ogrenciNo=scan.nextLine();
    System.out.print("sinif giriniz : ");
    String sinif=scan.nextLine();

    Ogrenci ogrenci=new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo,sinif);
 */
