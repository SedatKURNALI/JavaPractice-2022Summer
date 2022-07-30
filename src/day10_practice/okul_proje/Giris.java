package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    /*
        * ogretmen bilgilerini kullanicidan aliniz
        * aldiginiz bilgilerrden object ureterek yeni
         ogretmenler olusturun ve bilgilerini yazdirin
    */
    public static void main(String[] args) {
        System.out.println("Anonim Okulumuza Hosgeldiniz!");
        Scanner scan = new Scanner(System.in);

        System.out.print("Isim giriniz : ");
        String isim = scan.nextLine();

        System.out.print("Soyisim giriniz : ");
        String soyisim = scan.nextLine();

        System.out.print("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        scan.nextLine();

        System.out.print("Bransinizi giriniz : ");
        String brans = scan.nextLine();

        System.out.print("Telefon numaranizi giriniz : ");
        String telNo = scan.nextLine();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, telNo);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);

    }
}
