package buem.zui.summerschooltheater.service.contract.impls;

import buem.zui.summerschooltheater.model.Contract;
import buem.zui.summerschooltheater.repository.ContractFakeRepository;
import buem.zui.summerschooltheater.service.contract.interfaces.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements IContractService {

    @Autowired
    ContractFakeRepository repository;

    @Override
    public Contract create(Contract contact) {
        return repository.save(contact);
    }

    @Override
    public Contract update(Contract contract) {
        return repository.update(contract);
    }

    @Override
    public Contract get(String id) {
        return repository.findById(id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Contract> getAll() {
        return repository.findAll();
    }
}
