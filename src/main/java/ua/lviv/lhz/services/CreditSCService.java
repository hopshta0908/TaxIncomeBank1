package ua.lviv.lhz.services;

import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.entity.CreditSC;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
public interface CreditSCService {
    void addOrEdit(CreditSC creditSC);
    void delete (int idCredit);
    CreditSC findOne(int idCredit);
    List<CreditSC> findAll();
}
