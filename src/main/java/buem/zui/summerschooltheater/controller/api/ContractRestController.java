package buem.zui.summerschooltheater.controller.api;

import buem.zui.summerschooltheater.model.Contract;
import buem.zui.summerschooltheater.model.Repertoire;
import buem.zui.summerschooltheater.service.contract.impls.ContractServiceImpl;
import buem.zui.summerschooltheater.service.repertoire.impls.RepertoireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/contracts/")
@RestController
public class ContractRestController {

        @Autowired
       ContractServiceImpl service;

        @GetMapping("")
        public List<Contract> showAll(){
            return service.getAll();
        }

        @GetMapping("{id}")
        public Contract showOne(@PathVariable String id){
            return service.get(id);
        }

        @DeleteMapping("/{id}")
        public void del(@PathVariable String id){
            service.delete(id);
        }

        @PostMapping()
        public Contract insertOne(@RequestBody Contract contract){
            return service.create(contract);
        }

        @PutMapping()
        public Contract updateOne(@RequestBody Contract contract){
            return service.update(contract);
        }
    }
