public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    private int girisYili;
    private String ogrNo;
    private String bolumKodu;
    private String girisSirasi;

    public Ogrenci() {

    }

    public Ogrenci(Ogrenci student) {
        this.ad = student.ad;
        this.bolum = student.bolum;
        this.girisYili = student.girisYili;
        this.bolumKodu = student.bolumKodu;
        this.gano = student.gano;
        this.girisSirasi = student.girisSirasi;
        this.ogrNo = student.ogrNo;
    }

    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }

    public Ogrenci(String ad, String bolum, double gano,int girisYili, String bolumKodu, String girisSirasi) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
        this.girisSirasi = girisSirasi;
    }

    public String getAd() {

        return this.ad;
    }

    public String getBolum() {

        return this.bolum;
    }

    public double getGano() {
        if (gano<0 || gano>4) {
            throw new IllegalArgumentException("Gano Geçersiz Başka Gano Giriniz.");}

        return this.gano;
    }
    public void setAd(String ad) {

        this.ad = ad;
    }
    public void setBolum(String bolum) {

        this.bolum = bolum;
    }
    public void setGano(double gano) {


        this.gano = gano;

    }
    public double harcHesapla(int ders) {
//kafamdan değer verdim. yıl2023
        int uzatilanyil=2023-girisYili;
        return (double)(ders * 250)+(uzatilanyil*465.0);
    }

    public double harcHesapla(int ders, double uzatilanyil) {
//kafamdan değerler verdim.
        return (double)(ders * 250) + uzatilanyil * 465.0;
    }
    public String ogrenciNoOlustur() {

        return this.girisYili + this.bolumKodu + this.girisSirasi;
    }
}
