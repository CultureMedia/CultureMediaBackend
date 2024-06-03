package culturemedia.model;

import jakarta.persistence.*;

@Entity
public class Video {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String title;
    private String description;
    private Double duration;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public Video() {}
    
    public Video(String code, String title, String description, Double duration) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getDuration() {
        return duration;
    }
    public void setDuration(Double duration) {
        this.duration = duration;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
