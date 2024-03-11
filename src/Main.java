public class Main {

    //YIL 2023'e ESAS ALINMIŞTIR  HARÇ İÇİN GEREKEN KAÇ TANE DERSTEN GEÇİLEMEDİĞİ  VE BUNA BAĞLI HARÇ TOPLAMI KAFAMA GÖREDİR.(pdf te bunlar hakkında bilgi verilmemiş.)
    public static void main(String[] args) {
        Ogrenci[] ogrenci = {
                new Ogrenci("null", "null", 0.00, 1973, "104", "001"),
                new Ogrenci("Başar", "Bilgisayar Müh.", 3.74, 2022, "101", "001"),
                new Ogrenci("Halit", "Makine Müh.", 1.20, 2021, "102", "001"),
                new Ogrenci("Hasan", "Fizik", 1.98, 2020, "201", "001")
        };
        double gano = 0.0;
        Ogrenci[] student = ogrenci;
        Ogrenci fOgrenci = null;
        String ad = "Başar";
        int size = ogrenci.length;
        int i1;
        for(i1 = 0; i1 < size; ++i1) {
            Ogrenci l = student[i1];
            if (l.getAd().equals(ad)) {
                fOgrenci = l;
                break;
            }
        }

        if (fOgrenci == null) {
            throw new IllegalArgumentException("Kayıtlı öğrenci yok.");
        }
        else {
            System.out.println("Öğrencilerin Bilgileri");
            Ogrenci[] student2 = ogrenci;
            i1 = ogrenci.length;
            int k = 1;
            for(int i2 = 0; i2 < i1; ++i2) {
                Ogrenci b = student[i2];
                int t = 0;
                if (t < ogrenci.length) {
                    System.out.println("OGR-" + k + " " + b.getAd() + " " + b.getBolum() + " " + b.ogrenciNoOlustur() + " " + b.getGano());
                    ++k;
                }
            }

            for (int i = 1; i < ogrenci.length ; i++) {

                //hangi öğrencinin kaç tane dersten kaldığını bilmediğimiz için her öğrencinin 1 dersten kaldığını varsayıyorum
                System.out.println((i+1)+". öğrencinin ödeyeceği harç: " + student2[i].harcHesapla(1));

            }

        }
    }
}