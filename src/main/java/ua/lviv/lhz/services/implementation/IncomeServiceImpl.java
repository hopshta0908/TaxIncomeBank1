package ua.lviv.lhz.services.implementation;

import ua.lviv.lhz.bean.IncomeBean;
import ua.lviv.lhz.entity.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lhz.repository.IncomeRepo;
import ua.lviv.lhz.services.IncomeService;
import ua.lviv.lhz.services.TaxService;

import java.util.List;

/**
 * Created by Леся Гопшта on 16.07.2016.
 */
@Service
public class IncomeServiceImpl implements IncomeService {
    @Autowired
    private IncomeRepo incomeRepo;

    @Autowired
    private TaxService taxService;

    public int addOrEdit (IncomeBean incomeBean) {
        Income income = new Income();
        income.setMainIncome(incomeBean.getMainIncome());
        income.setAdditionalIncome(incomeBean.getAdditionalIncome());
        income.setRoyalty(incomeBean.getRoyalty());
        income.setIncomeOfSaleOfProperty(incomeBean.getIncomeOfSaleOfProperty());
        income.setGift(incomeBean.getGift());
        income.setTransfersFromAbroad(incomeBean.getTransfersFromAbroad());
        income.setBenefitsForChildren(incomeBean.getBenefitsForChildren());
        income.setFinancialAid(incomeBean.getFinancialAid());

        incomeRepo.save(income);
        taxService.createTax(income);
        return income.getIdIncome();
    }

    public void delete (int idIncome){
        incomeRepo.delete(idIncome);
    }
    public Income findOne(int idIncome) {
        return incomeRepo.findOne(idIncome);
    }

    public List<Income> findAll() {
        return incomeRepo.findAll();
    }

    @Override
    public Income addOrEditt(Income income) {
        return incomeRepo.save(income);
    }


}
