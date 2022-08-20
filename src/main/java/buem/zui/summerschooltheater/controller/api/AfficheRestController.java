package buem.zui.summerschooltheater.controller.api;

import buem.zui.summerschooltheater.model.Affiche;
import buem.zui.summerschooltheater.model.Character;
import buem.zui.summerschooltheater.service.affiche.impls.AfficheServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/performances")
public class AfficheRestController {

    AfficheServiceImpl service;

    @GetMapping("")
    public List<Affiche> showAll(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public Affiche showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Affiche insertOne(@RequestBody Affiche performance){
        return service.create(performance);
    }

    @PutMapping()
    public Affiche updateOne(@RequestBody Affiche performance){
        return service.update(performance);
    }

}
