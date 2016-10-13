package ua.lviv.lhz.services.implementation;


import ua.lviv.lhz.entity.Income;
import ua.lviv.lhz.entity.Tax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lhz.repository.TaxRepo;
import ua.lviv.lhz.services.TaxService;

/**
 * Created by Леся Гопшта on 16.07.2016.
 */
@Service
public class TaxServiceImpl implements TaxService {

    @Autowired
    TaxRepo taxRepo;

    @Override
    public void createTax(Income income) {
        Tax tax = new Tax();
        //tax.setIncomeList(income); 1to1
        tax.setTaxMainIncome(income.getMainIncome()*0.18);
        tax.setTaxAdditionalIncome(income.getAdditionalIncome()*0.18);
        tax.setTaxRoyalty(income.getRoyalty()*0.15);
        tax.setTaxIncomeOfSaleOfProperty(income.getIncomeOfSaleOfProperty()*0.05);
        tax.setTaxGift(income.getGift()*0.05);
        tax.setTaxTransfersFromAbroad(income.getTransfersFromAbroad()*0.15);
        //tax.getTaxBenefitsForChildren(income.getBenefitsForChildren()*0.00);
        tax.setTaxFinancialAid(income.getFinancialAid()*0.15);


        taxRepo.save(tax);

    }

    public void addOrEdit (Tax tax){
       taxRepo.save(tax);
    }

   // @Override
    //public Double getTaxMainIncome(Income income) {
    //   return null;
   //}


 public Double getTaxMainIncome(Income income) {
       return income.getMainIncome()*0.18;
   }

   public Double getTaxAdditionalIncome(Income income) {
        return income.getAdditionalIncome()*0.18;
   }
    public Double getTaxRoyalty(Income income) {
        return income.getRoyalty()*0.15;
   }
    public Double getTaxIncomeOfSaleOfProperty(Income income){
        return income.getIncomeOfSaleOfProperty()*0.05;

    }
    public Double getTaxGift(Income income){
        return income.getGift()*0.05;

    }
    public Double getTaxTransfersFromAbroad(Income income){
        return income.getTransfersFromAbroad()*0.15;

    }
    public Double getTaxBenefitsForChildren(Income income){
       return income.getBenefitsForChildren()*0.0;

    }
    public Double getTaxFinancialAid(Income income){
        return income.getFinancialAid()*0.15;

    }

    //@Override
   // public Double getIncomeSumm(Income income) {

    //    return null;
   // }
}
