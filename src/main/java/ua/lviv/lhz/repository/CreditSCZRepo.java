package ua.lviv.lhz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.entity.CreditSCZ;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
public interface CreditSCZRepo extends JpaRepository<CreditSCZ,Integer> {
    @Query("from CreditSCZ csz where csz.bankName LIKE :bankName")
    List<CreditSCZ> findByName (@Param("bankName")String bankName);
}
