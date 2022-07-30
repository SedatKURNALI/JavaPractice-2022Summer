package day10_practice;

import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {
        /*
             * Kullanicidan gelen cumleyi  parametre olarak alan
             * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
             * Trick: Ayn? uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk s?zc??? return edilsin
             * Noktalama i?aretlerini dikkate almay?n ve cumlenin bo? olmayaca??n? varsay?n.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle giriniz : ");
        String cumle = scan.nextLine();
        System.out.println(enUzunKelime(cumle));
    }
    public static String enUzunKelime(String cumle) {
        String[] arr = cumle.split(" ");
        int max = 0;
        String uzunKelime = "";
        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
                uzunKelime = s;
            }
        }
        return uzunKelime;
    }
}
