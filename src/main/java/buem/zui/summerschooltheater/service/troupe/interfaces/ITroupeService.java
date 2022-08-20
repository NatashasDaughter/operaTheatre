package buem.zui.summerschooltheater.service.troupe.interfaces;

import buem.zui.summerschooltheater.model.Troupe;
import java.util.List;

public interface ITroupeService {
    //CRUD

    Troupe create(Troupe soloist);
    Troupe update(Troupe soloist);
    Troupe get(String id);
    void delete(String id);
    List <Troupe> getAll();

}
