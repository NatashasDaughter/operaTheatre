package buem.zui.summerschooltheater.service.contract.interfaces;

import buem.zui.summerschooltheater.model.Contract;
import buem.zui.summerschooltheater.model.Repertoire;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IContractService {

    Contract create(Contract contact);
    Contract update(Contract contract);
    Contract get(String id);
    void delete(String id);
    List<Contract> getAll();

}
