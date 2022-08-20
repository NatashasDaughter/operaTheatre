package buem.zui.summerschooltheater.repository;

import buem.zui.summerschooltheater.model.Character;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class CharacterFakeRepository {

    private List<Character> characters = new ArrayList<>( Arrays.asList());

    public List<Character> findAll(){ return this.characters;}

    public Character save(Character character) {
        character.setId(UUID.randomUUID().toString());
        character.setCreateAt(LocalDateTime.now());
        this.characters.add(character);
        return character;
    }

    public Character update(Character character) {
        this.deleteById(character.getId());
        character.setUpdateAt(LocalDateTime.now());
        this.characters.add(character);
        return character;
    }

    public Character findById(String id) {
        return this.characters.stream().filter(character -> character.getId().equals(id))
                .findFirst().orElse(null);
    }

    public void deleteById(String id) {
        Character character = this.findById(id);
        int index = characters.indexOf(character);
        this.characters.remove(index);
    }
}
