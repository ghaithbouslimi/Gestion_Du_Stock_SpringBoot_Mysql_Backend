package com.example.backend.Service;

import com.example.backend.Entity.Role;
import com.example.backend.Entity.User;
import com.example.backend.Repository.RepRole;
import com.example.backend.Repository.RepUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private RepUser  userService ;

    @Autowired
    private RepRole roleService ;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }


    public User registerNewUser(User user) {
        Role role = roleService.findById("USER").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);

        return userService.save(user);
    }

    public List<User> findAllUsers()
    {
        return userService.findAll();
    }
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.save(user);
    }
    public Optional<User> getOne(Long id)
    {
        return userService.findById(id);
    }
    public User findByid(Long id)
    {
        return userService.findById(id).get();
    }


    public User updateUser(User user)
    {
        return userService.save(user);
    }

    public boolean exsitById(Long id )
    {
        return userService.existsById(id);
    }
    public void DeleteUser (Long id)
    {
        User user = findByid(id);
        userService.delete(user);    }
}
