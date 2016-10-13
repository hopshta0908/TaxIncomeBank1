package ua.lviv.lhz.services;

import ua.lviv.lhz.entity.Income;
import ua.lviv.lhz.entity.Tax;

import java.util.List;

/**
 * Created by Леся Гопшта on 16.07.2016.
 */
public interface TaxService {

    public void createTax(Income income);
    public void addOrEdit(Tax tax);

    public Double getTaxMainIncome(Income income);
    public Double getTaxAdditionalIncome(Income income);
    public Double getTaxRoyalty(Income income);
    public  Double getTaxIncomeOfSaleOfProperty(Income income);
    public  Double getTaxGift(Income income);
    public Double getTaxTransfersFromAbroad(Income income);
    public Double getTaxBenefitsForChildren(Income income);
    public Double getTaxFinancialAid(Income income);


}
