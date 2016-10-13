package ua.lviv.lhz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.lviv.lhz.entity.User;

import java.util.List;

/**
 * Created by Леся Гопшта on 02.08.2016.
 */
public interface UserRepo extends JpaRepository<User,Integer> {

    @Query ("SELECT u FROM User u WHERE u.email LIKE :login OR u.phone LIKE :login")
    User findByLogin (@Param("login") String login);

   // List<User> findByEmail(String email);
   // User findByEmailOrPhone(String email, String phone);

}
