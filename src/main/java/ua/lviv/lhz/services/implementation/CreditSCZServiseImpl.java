package ua.lviv.lhz.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.entity.CreditSCZ;
import ua.lviv.lhz.repository.CreditAvtoRepo;
import ua.lviv.lhz.repository.CreditSCZRepo;
import ua.lviv.lhz.services.CreditAvtoService;
import ua.lviv.lhz.services.CreditSCZService;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
@Service

public class CreditSCZServiseImpl implements CreditSCZService {
        @Autowired
        private CreditSCZRepo creditSCZRepo;

    public void addOrEdit (CreditSCZ creditSCZ){
        creditSCZRepo.save(creditSCZ);
    }

    public void delete (int idCredit){
        creditSCZRepo.delete(idCredit);
    }
    public CreditSCZ findOne(int idCredit) {
        return creditSCZRepo.findOne(idCredit);
    }

    public List<CreditSCZ> findAll() {
        return creditSCZRepo.findAll();
    }
}


