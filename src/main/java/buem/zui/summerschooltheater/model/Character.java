package buem.zui.summerschooltheater.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
@Document
public class Character {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private Repertoire opera;
    private String roleName;
    private OperaVoice voice;

    public Character() {
    }

    public Character(String name, String description, Repertoire opera, String roleName, OperaVoice voice) {
        this.name = name;
        this.description = description;
        this.opera = opera;
        this.roleName = roleName;
        this.voice = voice;
    }

    public Character(String id, String name, String description, LocalDateTime createAt, LocalDateTime updateAt, Repertoire opera, String roleName, OperaVoice voice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.opera = opera;
        this.roleName = roleName;
        this.voice = voice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Repertoire getOpera() {
        return opera;
    }

    public void setOpera(Repertoire opera) {
        this.opera = opera;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public OperaVoice getVoice() {
        return voice;
    }

    public void setVoice(OperaVoice voice) {
        this.voice = voice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id.equals(character.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Character{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", opera=" + opera +
                ", roleName='" + roleName + '\'' +
                ", voice=" + voice +
                '}';
    }
}
