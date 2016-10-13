package ua.lviv.lhz.services.implementation;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import ua.lviv.lhz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lhz.repository.UserRepo;
import ua.lviv.lhz.services.UserService;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


/**
 * Created by Леся Гопшта on 16.07.2016.
 */@Service
    public class UserServiceImpl implements UserService,UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    public UserDetails loadUserByUsername (String login) throws UsernameNotFoundException{
        User user;
        try {
            user=userRepo.findByLogin(login);
        }
        catch (NoResultException e){
            return null;
        }
        Collection<SimpleGrantedAuthority> authorities=new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new org.springframework.security.core.userdetails.User(String.valueOf(user.getIdUser()),user.getPassword(),authorities);
    }

    public void addOrEdit(User user){
        userRepo.save(user);
    }
    public void delete (int idUser){
        userRepo.delete(idUser);
    }

    public List<User>findAll(){
        return userRepo.findAll();
    }
    public User findOne(int idUser){
        return userRepo.findOne(idUser);
    }

   /* @Override
    public void addOrEdit(User income){
        userRepo.save (income);
    }
    @Override

    public void delete (int idUser){
        userRepo.delete(idUser);
    }
    @Override
    public User findOne (int idUser){
        return userRepo.findOne(idUser);
    }
    @Override
    public List<User>findAll(){
        return userRepo.findAll();
    }*/
}