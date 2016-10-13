package ua.lviv.lhz.services;

import ua.lviv.lhz.bean.IncomeBean;
import ua.lviv.lhz.entity.Income;

import java.util.List;

/**
 * Created by Леся Гопшта on 16.07.2016.
 */
public interface IncomeService {
    int addOrEdit(IncomeBean incomeBean);

    void delete(int idIncome);

    Income findOne(int idIncome);

    List<Income> findAll();

    Income addOrEditt(Income income);

//    void add(double mainIncome, double additionalIncome, double royalty, double incomeOfSaleOfProperty,
  //           double gift, double transfersFromAbroad, double benefitsForChildren, double financialAid);
}
