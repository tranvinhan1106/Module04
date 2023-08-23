package codegym.vn.entity;

import javax.persistence.*;

@Entity
@Table
public class Picture {
    @Id
    @Column(name = "id_picture", columnDefinition = "varchar(10)")
    private String id;
    private String view;
    private String author;
    private String feedback;

    public Picture() {
    }

    public Picture(String id, String view, String author, String feedback) {
        this.id = id;
        this.view = view;
        this.author = author;
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
