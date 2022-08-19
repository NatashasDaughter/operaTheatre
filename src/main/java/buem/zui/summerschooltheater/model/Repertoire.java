package buem.zui.summerschooltheater.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Repertoire {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private String title;
    private String author;
    private int durationInMinutes;
    private LocalDate dateOfPremier;
    private int budget;

    public Repertoire() {
    }

    public Repertoire(String name, String description, String title, String author, int durationInMinutes, LocalDate dateOfPremier, int budget) {
        this.name = name;
        this.description = description;
        this.title = title;
        this.author = author;
        this.durationInMinutes = durationInMinutes;
        this.dateOfPremier = dateOfPremier;
        this.budget = budget;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
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

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public LocalDate getDateOfPremier() {
        return dateOfPremier;
    }

    public void setDateOfPremier(LocalDate dateOfPremier) {
        this.dateOfPremier = dateOfPremier;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repertoire that = (Repertoire) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Repertoire{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", dateOfPremier=" + dateOfPremier +
                ", budget=" + budget +
                '}';
    }
}
