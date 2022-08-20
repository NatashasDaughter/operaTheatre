package buem.zui.summerschooltheater.controller.api;

import buem.zui.summerschooltheater.model.Repertoire;
import buem.zui.summerschooltheater.model.Troupe;
import buem.zui.summerschooltheater.service.repertoire.impls.RepertoireServiceImpl;
import buem.zui.summerschooltheater.service.troupe.impls.TroupeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/operas/")
@RestController
public class RepertoireRestController {

        @Autowired
        RepertoireServiceImpl service;

        @GetMapping("")
        public List<Repertoire> showAll(){
            return service.getAll();
        }

        @GetMapping("{id}")
        public Repertoire showOne(@PathVariable String id){
            return service.get(id);
        }

        @DeleteMapping("/{id}")
        public void del(@PathVariable String id){
            service.delete(id);
        }

        @PostMapping()
        public Repertoire insertOne(@RequestBody Repertoire opera){
            return service.create(opera);
        }
        @PutMapping()
        public Repertoire updateOne(@RequestBody Repertoire opera){
            return service.update(opera);
        }
}
