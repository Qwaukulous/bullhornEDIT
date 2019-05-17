package bullhorn.demo;


import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String content;
    private int postedDate;
    private String postedBy;

    @OneToMany(mappedBy = "Message", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<>
}
