package buem.zui.summerschooltheater.service.troupe.impls;

import buem.zui.summerschooltheater.model.OperaVoice;
import buem.zui.summerschooltheater.model.Troupe;
import buem.zui.summerschooltheater.repository.TroupeFakeRepository;
import buem.zui.summerschooltheater.service.troupe.interfaces.ITroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TroupeServiceImpl implements ITroupeService {

@Autowired
    TroupeFakeRepository repository;

    @Override
    public Troupe create(Troupe soloist) {
        return repository.save(soloist);
    }

    @Override
    public Troupe update(Troupe soloist) {
        return repository.update(soloist);
    }

    @Override
    public Troupe get(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Troupe> getAll() {
        return repository.findAll();
    }
}
