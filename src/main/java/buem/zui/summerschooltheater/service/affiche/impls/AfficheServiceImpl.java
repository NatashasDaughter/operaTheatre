package buem.zui.summerschooltheater.service.affiche.impls;

import buem.zui.summerschooltheater.model.Affiche;
import buem.zui.summerschooltheater.repository.AfficheFakeRepository;
import buem.zui.summerschooltheater.service.affiche.interfaces.IAfficheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AfficheServiceImpl implements IAfficheService {

    @Autowired
    AfficheFakeRepository repository;

    @Override
    public Affiche create(Affiche performance) {
        return repository.save(performance);
    }

    @Override
    public Affiche update(Affiche performance) {
        return repository.update(performance);
    }

    @Override
    public Affiche get(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Affiche> getAll() {
        return repository.findAll();
    }
}
