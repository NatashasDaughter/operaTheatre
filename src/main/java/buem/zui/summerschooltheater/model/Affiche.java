package buem.zui.summerschooltheater.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Affiche {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private Repertoire opera;
    private  LocalDateTime dateAndTime;
    private int ticketPrice;

    public Affiche() {
    }

    public Affiche(String name, String description, Repertoire opera, LocalDateTime dateAndTime, int ticketPrice) {
        this.name = name;
        this.description = description;
        this.opera = opera;
        this.dateAndTime = dateAndTime;
        this.ticketPrice = ticketPrice;
    }

    public Affiche(String id, String name, String description, LocalDateTime createAt, LocalDateTime updateAt, Repertoire opera, LocalDateTime dateAndTime, int ticketPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.opera = opera;
        this.dateAndTime = dateAndTime;
        this.ticketPrice = ticketPrice;
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

    public Repertoire getOpera() {
        return opera;
    }

    public void setOpera(Repertoire opera) {
        this.opera = opera;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affiche affiche = (Affiche) o;
        return getId().equals(affiche.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Affiche{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", opera=" + opera +
                ", dateAndTime=" + dateAndTime +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
