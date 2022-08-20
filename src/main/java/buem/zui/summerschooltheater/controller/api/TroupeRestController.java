package buem.zui.summerschooltheater.controller.api;

import buem.zui.summerschooltheater.model.OperaVoice;
import buem.zui.summerschooltheater.model.Troupe;
import buem.zui.summerschooltheater.service.troupe.impls.TroupeServiceImpl;
import buem.zui.summerschooltheater.service.troupe.interfaces.ITroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("api/v1/soloists/")
@RestController
public class TroupeRestController {
    @Autowired
    TroupeServiceImpl service;

    @GetMapping("")
    public List<Troupe> showAll(){
                return service.getAll();
    }

    @GetMapping("{id}")
    public Troupe showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Troupe insertOne(@RequestBody Troupe soloist){
        return service.create(soloist);
    }
    @PutMapping()
    public Troupe updateOne(@RequestBody Troupe soloist){
        return service.update(soloist);
    }

}
