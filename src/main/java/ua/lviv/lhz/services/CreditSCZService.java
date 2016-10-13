package ua.lviv.lhz.services;

import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.entity.CreditSCZ;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
public interface CreditSCZService {
    void addOrEdit(CreditSCZ creditSCZ);
    void delete (int idCredit);
    CreditSCZ findOne(int idCredit);
    List<CreditSCZ> findAll();
}
