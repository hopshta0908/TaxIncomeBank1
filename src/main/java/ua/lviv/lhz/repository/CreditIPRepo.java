package ua.lviv.lhz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.entity.CreditIP;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
public interface CreditIPRepo extends JpaRepository<CreditIP,Integer> {
    @Query("from CreditIP ci where ci.bankName LIKE :bankName")
    List<CreditIP> findByName (@Param("bankName")String bankName);
}
