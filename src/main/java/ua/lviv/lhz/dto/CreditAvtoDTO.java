package ua.lviv.lhz.dto;


/**
 * Created by Леся Гопшта on 10.10.2016.
 */
public class CreditAvtoDTO {

    private int idCredit;
    private String bankName;
    private String  type;
    private double sumCredit ;
    private double percent;
    private double term;
    private double monthFee;
    private double timeFee;
    private String collateral;
    private String image;

public CreditAvtoDTO(){}

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCollateral() {
        return this.collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public int getIdCredit() {
        return this.idCredit;
    }

    public void setIdCredit(int idCredit) {
        this.idCredit = idCredit;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getMonthFee() {
        return this.monthFee;
    }

    public void setMonthFee(double monthFee) {
        this.monthFee = monthFee;
    }

    public double getPercent() {
        return this.percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getSumCredit() {
        return this.sumCredit;
    }

    public void setSumCredit(double sumCredit) {
        this.sumCredit = sumCredit;
    }

    public double getTerm() {
        return this.term;
    }

    public void setTerm(double term) {
        this.term = term;
    }

    public double getTimeFee() {
        return this.timeFee;
    }

    public void setTimeFee(double timeFee) {
        this.timeFee = timeFee;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
