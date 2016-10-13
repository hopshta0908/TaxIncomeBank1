package ua.lviv.lhz.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lhz.entity.CreditSC;

import ua.lviv.lhz.repository.CreditSCRepo;

import ua.lviv.lhz.services.CreditSCService;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
@Service

public class CreditSCServiseImpl implements CreditSCService {
    @Autowired
    private CreditSCRepo creditSCRepo;

    public void addOrEdit (CreditSC creditSC){
        creditSCRepo.save(creditSC);
    }

    public void delete (int idCredit){
        creditSCRepo.delete(idCredit);
    }
    public CreditSC findOne(int idCredit) {
        return creditSCRepo.findOne(idCredit);
    }

    public List<CreditSC> findAll() {
        return creditSCRepo.findAll();
    }
}
