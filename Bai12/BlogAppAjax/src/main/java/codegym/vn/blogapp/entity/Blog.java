package codegym.vn.blogapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String id;
    private String name;
    private String title;
    private String content;
    @ManyToOne()
    @JoinColumn(name = "categoryId")
    private Category category;

    public Blog() {
    }

    public Blog(String id, String name, String title, String content, Category category) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
