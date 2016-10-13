package ua.lviv.lhz.services;

import ua.lviv.lhz.entity.User;

import javax.jws.soap.SOAPBinding;
import java.security.AllPermission;
import java.util.Date;
import java.util.List;

/**
 * Created by Леся Гопшта on 16.07.2016.
 */
public interface UserService {
   void addOrEdit(User user);
    void delete (int idUser);
    List<User> findAll();
    User findOne(int idUser);
   // void addOrEdit(User income);
}

