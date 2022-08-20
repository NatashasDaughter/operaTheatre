package buem.zui.summerschooltheater.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class WorkSchedule {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private Troupe soloist;
    private Character character;
    private Affiche performance;
    private boolean isMainRole;

    public WorkSchedule() {
    }

    public WorkSchedule(String name, String description, Troupe soloist, Character character, Affiche performance, boolean isMainRole) {
        this.name = name;
        this.description = description;
        this.soloist = soloist;
        this.character = character;
        this.performance = performance;
        this.isMainRole = isMainRole;
    }

    public WorkSchedule(String id, String name, String description, LocalDateTime createAt, LocalDateTime updateAt, Troupe soloist, Character character, Affiche performance, boolean isMainRole) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.soloist = soloist;
        this.character = character;
        this.performance = performance;
        this.isMainRole = isMainRole;
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

    public Troupe getSoloist() {
        return soloist;
    }

    public void setSoloist(Troupe soloist) {
        this.soloist = soloist;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Affiche getPerformance() {
        return performance;
    }

    public void setPerformance(Affiche performance) {
        this.performance = performance;
    }

    public boolean isMainRole() {
        return isMainRole;
    }

    public void setMainRole(boolean mainRole) {
        isMainRole = mainRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkSchedule that = (WorkSchedule) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "WorkSchedule{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", soloist=" + soloist +
                ", character=" + character +
                ", performance=" + performance +
                ", isMainRole=" + isMainRole +
                '}';
    }
}
