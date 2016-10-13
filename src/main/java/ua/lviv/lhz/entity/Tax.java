package ua.lviv.lhz.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Леся Гопшта on 24.09.2016.
 */
@Entity
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idTax;

    @Column
    private double taxMainIncome;
    @Column
    private double taxAdditionalIncome;
    @Column
    private double taxRoyalty;
    @Column
    private double taxIncomeOfSaleOfProperty;
    @Column
    private double taxGift;
    @Column
    private double taxTransfersFromAbroad;
    @Column
    private double taxBenefitsForChildren;
    @Column
    private double taxFinancialAid;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "tax")
    private List<Income>income;

    public Tax() {
    }

    public int getIdTax() {
        return this.idTax;
    }

    public void setIdTax(int idTax) {
        this.idTax = idTax;
    }



    public double getTaxAdditionalIncome() {
        return this.taxAdditionalIncome;
    }

    public void setTaxAdditionalIncome(double taxAdditionalIncome) {
        this.taxAdditionalIncome = taxAdditionalIncome;
    }

    public double getTaxBenefitsForChildren() {
        return this.taxBenefitsForChildren;
    }

    public void setTaxBenefitsForChildren(double taxBenefitsForChildren) {
        this.taxBenefitsForChildren = taxBenefitsForChildren;
    }

    public double getTaxFinancialAid() {
        return this.taxFinancialAid;
    }

    public void setTaxFinancialAid(double taxFinancialAid) {
        this.taxFinancialAid = taxFinancialAid;
    }

    public double getTaxGift() {
        return this.taxGift;
    }

    public void setTaxGift(double taxGift) {
        this.taxGift = taxGift;
    }

    public double getTaxIncomeOfSaleOfProperty() {
        return this.taxIncomeOfSaleOfProperty;
    }

    public void setTaxIncomeOfSaleOfProperty(double taxIncomeOfSaleOfProperty) {
        this.taxIncomeOfSaleOfProperty = taxIncomeOfSaleOfProperty;
    }

    public double getTaxMainIncome() {
        return this.taxMainIncome;
    }

    public void setTaxMainIncome(double taxMainIncome) {
        this.taxMainIncome = taxMainIncome;
    }

    public double getTaxRoyalty() {
        return this.taxRoyalty;
    }

    public void setTaxRoyalty(double taxRoyalty) {
        this.taxRoyalty = taxRoyalty;
    }

    public double getTaxTransfersFromAbroad() {
        return this.taxTransfersFromAbroad;
    }

    public void setTaxTransfersFromAbroad(double taxTransfersFromAbroad) {
        this.taxTransfersFromAbroad = taxTransfersFromAbroad;
    }
}