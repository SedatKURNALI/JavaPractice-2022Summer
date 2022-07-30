package day09_practice.day09_practice.restourant;

public class Musteri {

    public static void main(String[] args) {

        Mutfak menu = new Mutfak();
        System.out.println("menu.toString() = " + menu.toString());

        Mutfak siparisim = new Mutfak("Adana Kebab", "Mercimek Corbasi", "Baklava", "Soda");
        System.out.println("siparisim = " + siparisim);
    }
}
