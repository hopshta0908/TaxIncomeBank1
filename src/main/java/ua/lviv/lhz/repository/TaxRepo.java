package ua.lviv.lhz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lhz.entity.Tax;

/**
 * Created by Леся Гопшта on 02.08.2016.
 */
public interface TaxRepo extends JpaRepository <Tax,Integer> {
}
