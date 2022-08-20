package buem.zui.summerschooltheater.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Troupe {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private String firstName;
    private String lastName;
    private OperaVoice voice;
    private String regard;
    private int yearOfExperience;

    public Troupe() {
    }

    public Troupe(String name, String description, String firstName, String lastName, OperaVoice voice, String regard, int yearOfExperience) {
        this.name = name;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
        this.voice = voice;
        this.regard = regard;
        this.yearOfExperience = yearOfExperience;
    }

    public Troupe(String id, String name, String description, LocalDateTime createAt, LocalDateTime updateAt, String firstName, String lastName, OperaVoice voice, String regard, int yearOfExperience) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.voice = voice;
        this.regard = regard;
        this.yearOfExperience = yearOfExperience;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public OperaVoice getVoice() {
        return voice;
    }

    public void setVoice(OperaVoice voice) {
        this.voice = voice;
    }

    public String getRegard() {
        return regard;
    }

    public void setRegard(String regard) {
        this.regard = regard;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Troupe troupe = (Troupe) o;
        return getId().equals(troupe.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Troupe{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", voice=" + voice +
                ", regard='" + regard + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                '}';
    }
}
