package buem.zui.summerschooltheater.repository;

import buem.zui.summerschooltheater.model.Contract;
import buem.zui.summerschooltheater.model.WorkSchedule;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class WorkScheduleFakeRepository {

    private List<WorkSchedule> schedules = new ArrayList<>(  Arrays.asList());

    public List<WorkSchedule> findAll(){ return this.schedules;}

    public WorkSchedule save(WorkSchedule schedule) {
        schedule.setId(UUID.randomUUID().toString());
        schedule.setCreateAt(LocalDateTime.now());
        this.schedules.add(schedule);
        return schedule;
    }

    public WorkSchedule update(WorkSchedule schedule) {
        this.deleteById(schedule.getId());
        schedule.setUpdateAt(LocalDateTime.now());
        this.schedules.add(schedule);
        return schedule;
    }

    public WorkSchedule findById(String id) {
        return this.schedules.stream().filter(schedule -> schedule.getId().equals(id))
                .findFirst().orElse(null);
    }

    public void deleteById(String id) {
        WorkSchedule schedule = this.findById(id);
        int index = schedules.indexOf(schedule);
        this.schedules.remove(index);
    }
}
