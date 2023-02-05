import java.util.Comparator;

public class book implements Comparable <book> {
    private String isim;
    private String yazar;
    private int sayfa;


    public String getIsim() {
        return isim;
    }

    public String getYazar() {
        return yazar;
    }

    public int getSayfa() {
        return sayfa;
    }

    public book(String isim, int sayfa, String yazar ) {
        this.isim = isim;
        this.yazar = yazar;
        this.sayfa = sayfa;
    }


    public int compareTo(book b1) {
        return this.isim.compareTo(b1.isim);
    }
}
