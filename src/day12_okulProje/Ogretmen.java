package day12_okulProje;

public class Ogretmen extends Kisi {

    private String bolum;
    private String sicilNo;

    public Ogretmen() {

    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " " + bolum +
                " " + sicilNo + "\n";


        /*
        public String toString() {
        return " " + ogrenciNo +
                " " + sinif +
                super.toString()+"\n";//bize superden ad soyad kismini getirecek
    }
         */
    }
}
