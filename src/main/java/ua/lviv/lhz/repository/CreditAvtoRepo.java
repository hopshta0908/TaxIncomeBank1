package ua.lviv.lhz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lhz.entity.CreditAvto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Created by Леся Гопшта on 08.10.2016.
 */
public interface CreditAvtoRepo extends JpaRepository<CreditAvto,Integer> {
    @Query("from CreditAvto ca where ca.bankName LIKE :bankName")
    List<CreditAvto> findByName (@Param("bankName")String bankName);

}
