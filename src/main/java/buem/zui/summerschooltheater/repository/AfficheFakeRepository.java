package buem.zui.summerschooltheater.repository;

import buem.zui.summerschooltheater.model.Affiche;
import buem.zui.summerschooltheater.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class AfficheFakeRepository {

    private List<Affiche> performances = new ArrayList<>( Arrays.asList());

    public List<Affiche> findAll(){
        return this.performances;
    }

    public Affiche save(Affiche performance) {
        performance.setId(UUID.randomUUID().toString());
        performance.setCreateAt(LocalDateTime.now());
        this.performances.add(performance);
        return performance;
    }

    public Affiche update(Affiche performance) {
        this.deleteById(performance.getId());
        performance.setUpdateAt(LocalDateTime.now());
        this.performances.add(performance);
        return performance;
    }

    public Affiche findById(String id) {
        return this.performances.stream().filter(performance -> performance.getId().equals(id))
                .findFirst().orElse(null);
    }

    public void deleteById(String id) {
        Affiche performance = this.findById(id);
        int index = performances.indexOf(performance);
        this.performances.remove(index);
    }

}
