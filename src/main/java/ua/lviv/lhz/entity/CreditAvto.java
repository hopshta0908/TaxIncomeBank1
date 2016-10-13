package ua.lviv.lhz.entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Леся Гопшта on 08.10.2016.
 */
@Entity
public class CreditAvto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idCredit;
    @Column
    private String bankName;
    @Column
    private String  type;
    @Column
    private double sumCredit ;
    @Column
    private double percent;
    @Column
    private double term;
    @Column
    private double monthFee;
    @Column
    private double timeFee;
    @Column
    private String collateral;
    @Column
    @Lob
    private byte [] image = new byte[1];



    @ManyToOne(fetch = FetchType.EAGER)
    private User user;


    public CreditAvto() {
    }

    public CreditAvto(String bankName, String collateral, byte[] image, double monthFee, double percent, double sumCredit, double term, double timeFee, String type, User user) {
        this.bankName = bankName;
        this.collateral = collateral;
        this.image = image;
        this.monthFee = monthFee;
        this.percent = percent;
        this.sumCredit = sumCredit;
        this.term = term;
        this.timeFee = timeFee;
        this.type = type;
        this.user = user;
    }



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

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "CreditAvto{" +
                "bankName='" + bankName + '\'' +
                ", idCredit=" + idCredit +
                ", type='" + type + '\'' +
                ", sumCredit=" + sumCredit +
                ", percent=" + percent +
                ", term=" + term +
                ", monthFee=" + monthFee +
                ", timeFee=" + timeFee +
                ", collateral='" + collateral + '\'' +
                ", image=" + Arrays.toString(image) +
                ", user=" + user +
                '}';
    }
}
