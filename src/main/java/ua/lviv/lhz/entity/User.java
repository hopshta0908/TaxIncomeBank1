package ua.lviv.lhz.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Леся Гопшта on 16.07.2016.
 */

@Entity
//@NamedQueries({
     //   @NamedQuery(name = "User.findByLogin",query = "select u FROM User u where u.userEmail like: login OR u.userPhone like:login")
//})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idUser;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String password;
    @Transient
    private String passwordConfirm;



    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<CreditAvto> creditAvtoList;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<CreditIP> creditIPList;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<CreditSC> creditSCList;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    List<CreditSCZ> creditSCZList;

    @OneToMany (fetch = FetchType.EAGER,mappedBy = "user")
    private List<Income> income;


    public User() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdUser() {
        return this.idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return this.passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
