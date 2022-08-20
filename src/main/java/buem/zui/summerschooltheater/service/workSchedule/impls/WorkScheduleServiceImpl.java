package buem.zui.summerschooltheater.service.workSchedule.impls;

import buem.zui.summerschooltheater.model.WorkSchedule;
import buem.zui.summerschooltheater.repository.WorkScheduleFakeRepository;
import buem.zui.summerschooltheater.service.workSchedule.interfaces.IWorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WorkScheduleServiceImpl implements IWorkScheduleService {

    @Autowired
    WorkScheduleFakeRepository repository;

    @Override
    public WorkSchedule create(WorkSchedule schedule) {
        return  repository.save(schedule);
    }

    @Override
    public WorkSchedule update(WorkSchedule schedule) {
        return repository.update(schedule);
    }

    @Override
    public WorkSchedule get(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
            repository.deleteById(id);
    }

    @Override
    public List<WorkSchedule> getAll() {
        return repository.findAll();
    }
}

