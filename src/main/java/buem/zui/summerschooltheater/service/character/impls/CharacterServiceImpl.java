package buem.zui.summerschooltheater.service.character.impls;

import buem.zui.summerschooltheater.model.Character;
import buem.zui.summerschooltheater.repository.CharacterFakeRepository;
import buem.zui.summerschooltheater.service.character.interfaces.ICharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements ICharacterService {

@Autowired
    CharacterFakeRepository repository;

    @Override
    public Character create(Character character) {
        return repository.save(character);
    }

    @Override
    public Character update(Character character) {
        return repository.update(character);
    }

    @Override
    public Character get(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Character> getAll() {
        return repository.findAll();
    }
}
