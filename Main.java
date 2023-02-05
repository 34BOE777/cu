import java.awt.print.Book;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main{

    public static void main(String[] args) {
        book b1 = new book("Dune", 688, "Frank Herbert");
        book b2 = new book("Anna Karenina", 864, "Leo Tolstoy");
        book b3 = new book("Don Quixote", 292, "Miguel de Cervantes");
        book b4 = new book("The Fellowship of the Ring", 496, "J.R.R. Tolkien");
        book b5 = new book("The Grapes of Wrath", 464, "John Steinbeck");

        Set<book> anan = new TreeSet<>();
        anan.add(b1);
        anan.add(b2);
        anan.add(b3);
        anan.add(b4);
        anan.add(b5);

        System.out.println("-------------------------YAZARA GÖRE SIRALAMA-------------------------");
        for (book b : anan) {
            System.out.println(b.getIsim() + "\t" + b.getYazar() + "\t" + b.getSayfa());
        }
       Set<book> anan2 = new TreeSet<>(new Comparator<book>() {
            @Override
            public int compare(book o1, book o2) {
                return o1.getSayfa() - o2.getSayfa();
            }
        }.reversed());

        anan2.addAll(anan);
        System.out.println("-------------------------SAYFAYA GÖRE SIRALAMA-------------------------");
        for (book b : anan2) {
            System.out.println(b.getIsim() + "\t" + b.getYazar() + "\t" + b.getSayfa());
        }

    }
}