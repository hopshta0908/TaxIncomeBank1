package ua.lviv.lhz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.entity.CreditSC;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
public interface CreditSCRepo extends JpaRepository<CreditSC,Integer> {
    @Query("from CreditSC cs where cs.bankName LIKE :bankName")
    List<CreditSC> findByName (@Param("bankName")String bankName);
}
