package buem.zui.summerschooltheater.service.workSchedule.interfaces;

import buem.zui.summerschooltheater.model.WorkSchedule;

import java.util.List;

public interface IWorkScheduleService {

    WorkSchedule create(WorkSchedule schedule);
    WorkSchedule update(WorkSchedule schedule);
    WorkSchedule get(String id);
    void delete(String id);
    List<WorkSchedule> getAll();
}
