package buem.zui.summerschooltheater.service.affiche.interfaces;

import buem.zui.summerschooltheater.model.Affiche;
import java.util.List;

public interface IAfficheService {

    Affiche create(Affiche performance);
    Affiche update(Affiche performance);
    Affiche get(String id);
    void delete(String id);
    List<Affiche> getAll();

}
