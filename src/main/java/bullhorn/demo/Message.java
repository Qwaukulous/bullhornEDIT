package bullhorn.demo;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull private String postedDate;

    @NotNull
    private String postedBy;

    public Message() {
    }

    public Message(@NotNull String title, @NotNull String content, @NotNull String postedDate, @NotNull String postedBy) {
        this.title = title;
        this.content = content;
        this.postedDate = postedDate;
        this.postedBy = postedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
}
