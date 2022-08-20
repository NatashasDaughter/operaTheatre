package buem.zui.summerschooltheater.repository;

import buem.zui.summerschooltheater.model.OperaVoice;
import buem.zui.summerschooltheater.model.Repertoire;
import buem.zui.summerschooltheater.model.Troupe;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class RepertoireFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private LocalDate date1 = LocalDate.of(2017, 1, 13);
    private LocalDate date2 = LocalDate.of(2015, 5, 22);
    private List<Repertoire> operas = new ArrayList<>(
            Arrays.asList(
                    new Repertoire ( "1", "opera1", "desc1", now, now, "Rigoletto", "Giuseppe Verdi", 120,
                    date1, 6000),
                    new Repertoire  ( "2", "opera2", "desc2", now, now, "Carmen", "Georges Bizet", 160,
                            date2, 6000)

            ));

    public List<Repertoire> findAll(){ return this.operas;}

    public Repertoire save(Repertoire opera) {
        opera.setId(UUID.randomUUID().toString());
        opera.setCreateAt(LocalDateTime.now());
        this.operas.add(opera);
        return opera;
    }

    public Repertoire update(Repertoire opera) {
        this.deleteById(opera.getId());
        opera.setUpdateAt(LocalDateTime.now());
        this.operas.add(opera);
        return opera;
    }

    public Repertoire findById(String id) {
        return this.operas.stream().filter(opera -> opera.getId().equals(id))
                .findFirst().orElse(null);
    }

    public void deleteById(String id) {
        Repertoire opera = this.findById(id);
        int index = operas.indexOf(opera);
        this.operas.remove(index);
    }

}
