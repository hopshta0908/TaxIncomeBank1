package ua.lviv.lhz.bean;

import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

/**
 * Created by Леся Гопшта on 30.09.2016.
 */
public class IncomeBean implements Serializable {


    Double mainIncome;

    Double additionalIncome;

    Double royalty;


    public Double getMainIncome() {
        return this.mainIncome;
    }

    public void setMainIncome(Double mainIncome) {
        this.mainIncome = mainIncome;
    }

    public Double getAdditionalIncome() {
        return this.additionalIncome;
    }

    public void setAdditionalIncome(Double additionalIncome) {
        this.additionalIncome = additionalIncome;
    }

    public Double getBenefitsForChildren() {
        return this.benefitsForChildren;
    }

    public void setBenefitsForChildren(Double benefitsForChildren) {
        this.benefitsForChildren = benefitsForChildren;
    }

    public Double getFinancialAid() {
        return this.financialAid;
    }

    public void setFinancialAid(Double financialAid) {
        this.financialAid = financialAid;
    }

    public Double getGift() {
        return this.gift;
    }

    public void setGift(Double gift) {
        this.gift = gift;
    }

    public Double getIncomeOfSaleOfProperty() {
        return this.incomeOfSaleOfProperty;
    }

    public void setIncomeOfSaleOfProperty(Double incomeOfSaleOfProperty) {
        this.incomeOfSaleOfProperty = incomeOfSaleOfProperty;
    }

    public Double getRoyalty() {
        return this.royalty;
    }

    public void setRoyalty(Double royalty) {
        this.royalty = royalty;
    }

    public Double getTransfersFromAbroad() {
        return this.transfersFromAbroad;
    }

    public void setTransfersFromAbroad(Double transfersFromAbroad) {
        this.transfersFromAbroad = transfersFromAbroad;
    }

    Double incomeOfSaleOfProperty;

    Double gift;

    Double transfersFromAbroad;

    Double benefitsForChildren;

    Double financialAid;

    public IncomeBean() {

    }
}
