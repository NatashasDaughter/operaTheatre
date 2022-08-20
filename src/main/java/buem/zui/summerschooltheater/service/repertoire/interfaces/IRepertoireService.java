package buem.zui.summerschooltheater.service.repertoire.interfaces;

import buem.zui.summerschooltheater.model.Repertoire;

import java.util.List;

public interface IRepertoireService {

    Repertoire create(Repertoire opera);
    Repertoire update(Repertoire opera);
    Repertoire get(String id);
    void delete(String id);
    List<Repertoire> getAll();
}
