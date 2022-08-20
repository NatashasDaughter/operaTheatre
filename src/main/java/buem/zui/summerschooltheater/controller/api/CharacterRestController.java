package buem.zui.summerschooltheater.controller.api;

import buem.zui.summerschooltheater.model.Character;
import buem.zui.summerschooltheater.model.Contract;
import buem.zui.summerschooltheater.service.character.impls.CharacterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/characters/")
@RestController
public class CharacterRestController {
    @Autowired
    CharacterServiceImpl service;

    @GetMapping("")
    public List<Character> showAll(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public Character showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Character insertOne(@RequestBody Character character){
        return service.create(character);
    }
    @PutMapping()
    public Character updateOne(@RequestBody Character character){
        return service.update(character);
    }

}
