package buem.zui.summerschooltheater.service.repertoire.impls;

import buem.zui.summerschooltheater.model.Repertoire;
import buem.zui.summerschooltheater.repository.RepertoireFakeRepository;
import buem.zui.summerschooltheater.service.repertoire.interfaces.IRepertoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepertoireServiceImpl implements IRepertoireService {

    @Autowired
    RepertoireFakeRepository repository;

    @Override
    public Repertoire create(Repertoire opera) {
        return repository.save(opera);
    }

    @Override
    public Repertoire update(Repertoire opera) {
        return repository.update(opera);
    }

    @Override
    public Repertoire get(String id) {
        return  repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Repertoire> getAll() {
        return repository.findAll();
    }
}
