package ua.lviv.lhz.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Леся Гопшта on 24.09.2016.
 */
@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idIncome;
    @Column
    private double mainIncome;
    @Column
    private double additionalIncome;
    @Column
    private double royalty;
    @Column
    private double incomeOfSaleOfProperty;
    @Column
    private double gift;
    @Column
    private double transfersFromAbroad;
    @Column
    private double benefitsForChildren;
    @Column
    private double financialAid;



    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Tax tax;

    public Income() {
    }

    public double getAdditionalIncome() {
        return this.additionalIncome;
    }

    public void setAdditionalIncome(double additionalIncome) {
        this.additionalIncome = additionalIncome;
    }

    public double getBenefitsForChildren() {
        return this.benefitsForChildren;
    }

    public void setBenefitsForChildren(double benefitsForChildren) {
        this.benefitsForChildren = benefitsForChildren;
    }

    public double getFinancialAid() {
        return this.financialAid;
    }

    public void setFinancialAid(double financialAid) {
        this.financialAid = financialAid;
    }

    public double getGift() {
        return this.gift;
    }

    public void setGift(double gift) {
        this.gift = gift;
    }

    public int getIdIncome() {
        return this.idIncome;
    }

    public void setIdIncome(int idIncome) {
        this.idIncome = idIncome;
    }

    public double getIncomeOfSaleOfProperty() {
        return this.incomeOfSaleOfProperty;
    }

    public void setIncomeOfSaleOfProperty(double incomeOfSaleOfProperty) {
        this.incomeOfSaleOfProperty = incomeOfSaleOfProperty;
    }

    public double getMainIncome() {
        return this.mainIncome;
    }

    public void setMainIncome(double mainIncome) {
        this.mainIncome = mainIncome;
    }

    public double getRoyalty() {
        return this.royalty;
    }

    public void setRoyalty(double royalty) {
        this.royalty = royalty;
    }

    public Tax getTax() {
        return this.tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public double getTransfersFromAbroad() {
        return this.transfersFromAbroad;
    }

    public void setTransfersFromAbroad(double transfersFromAbroad) {
        this.transfersFromAbroad = transfersFromAbroad;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

