import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    protected String title;

    @Column(nullable = false)
    protected String author;

    @Column
    protected String editorial;

    @Temporal(TemporalType.DATE)
    protected Date date;

    @Column(unique = true)
    protected String ISBN;

    @Column
    protected float estimatedPrice;

    @Enumerated(EnumType.STRING)
    protected Status status;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

}
