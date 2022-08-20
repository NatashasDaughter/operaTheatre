package buem.zui.summerschooltheater.repository;

import buem.zui.summerschooltheater.model.OperaVoice;
import buem.zui.summerschooltheater.model.Troupe;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class TroupeFakeRepository {
    private LocalDateTime now = LocalDateTime.now();
    private List<Troupe> soloists = new ArrayList<>(
            Arrays.asList(
                    new Troupe ("1", "soloist1", "desc1",  now, now,
                            "Monserrat", "Caballe", OperaVoice.SOPRANO, null, 15),
                    new Troupe ("2", "soloist2", "desc2",  now, now,
                            "Luciano", "Pavarotti", OperaVoice.BARITONE, null, 20)
            ));

    public List<Troupe> findAll(){
        return this.soloists;
    }

    public Troupe findById(String id) {
        return this.soloists.stream().filter(soloist -> soloist.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Troupe update(Troupe soloist) {
        this.deleteById(soloist.getId());
        soloist.setUpdateAt(LocalDateTime.now());
        this.soloists.add(soloist);
        return soloist;
    }

    public void deleteById(String id) {
        Troupe soloist = this.findById(id);
        int index = soloists.indexOf(soloist);
        this.soloists.remove(index);
    }

    public Troupe save(Troupe soloist) {
        soloist.setId(UUID.randomUUID().toString());
        soloist.setCreateAt(LocalDateTime.now());
        this.soloists.add(soloist);
        return soloist;
    }
}
