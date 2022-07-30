package day09_practice.day09_practice.restourant;

public class Mutfak {

    public String yemekler = "adanakebeb, ufraciger, kusbasi, kusleme";

    public String araSicak = "yaylacorbasi, mercimek, duguncorbasi, tarhana";

    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";

    public String icecekler = "ayran, salgam, kola, soda";

    public Mutfak() {
    }

    public Mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {
        this.yemekler = yemekler;
        this.araSicak = araSicak;
        this.tatlilar = tatlilar;
        this.icecekler = icecekler;
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler= " + yemekler +
                "\naraSicak= " + araSicak +
                "\ntatlilar= " + tatlilar +
                "\nicecekler= " + icecekler +
                '}';
    }
}
