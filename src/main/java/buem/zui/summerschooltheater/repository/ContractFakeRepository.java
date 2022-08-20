package buem.zui.summerschooltheater.repository;

import buem.zui.summerschooltheater.model.Contract;
import buem.zui.summerschooltheater.model.Repertoire;
import buem.zui.summerschooltheater.model.Troupe;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ContractFakeRepository {

    private List<Contract> contracts = new ArrayList<>(  Arrays.asList());

    public List<Contract> findAll(){ return this.contracts;}

    public Contract save(Contract contract) {
        contract.setId(UUID.randomUUID().toString());
        contract.setCreateAt(LocalDateTime.now());
        this.contracts.add(contract);
        return contract;
    }

    public Contract update(Contract contract) {
        this.deleteById(contract.getId());
        contract.setUpdateAt(LocalDateTime.now());
        this.contracts.add(contract);
        return contract;
    }

    public Contract findById(String id) {
        return this.contracts.stream().filter(contract -> contract.getId().equals(id))
                .findFirst().orElse(null);
    }

    public void deleteById(String id) {
        Contract contract = this.findById(id);
        int index = contracts.indexOf(contract);
        this.contracts.remove(index);
    }

}
