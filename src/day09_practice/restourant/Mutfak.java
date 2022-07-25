package day09_practice.restourant;

public class Mutfak {

    public String yemekler = "adanakebeb, ufraciger, kusbasi, kusleme";

    public String araSicak = "yaylacorbasi, mercimek, duguncorbasi, tarhana";

    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";

    public String icecekler = "ayran, salgam, kola, soda";

    public Mutfak() {
    }

    public Mutfak(String adanakebab, String mercimek, String baklama, String soda) {
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }



}
