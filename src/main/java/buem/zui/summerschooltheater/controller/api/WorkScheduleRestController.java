package buem.zui.summerschooltheater.controller.api;

import buem.zui.summerschooltheater.model.Contract;
import buem.zui.summerschooltheater.model.WorkSchedule;
import buem.zui.summerschooltheater.service.contract.impls.ContractServiceImpl;
import buem.zui.summerschooltheater.service.workSchedule.impls.WorkScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/schedules/")
@RestController
public class WorkScheduleRestController {
    @Autowired
    WorkScheduleServiceImpl service;

    @GetMapping("")
    public List<WorkSchedule> showAll(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public WorkSchedule showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public WorkSchedule insertOne(@RequestBody WorkSchedule schedule){
        return service.create(schedule);
    }

    @PutMapping()
    public WorkSchedule updateOne(@RequestBody WorkSchedule schedule){
        return service.update(schedule);
    }

}
