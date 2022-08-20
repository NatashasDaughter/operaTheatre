package buem.zui.summerschooltheater.service.character.interfaces;

import buem.zui.summerschooltheater.model.Character;

import java.util.List;

public interface ICharacterService {

    Character create(Character character);
    Character update(Character character);
    Character get(String id);
    void delete(String id);
    List<Character> getAll();
}
