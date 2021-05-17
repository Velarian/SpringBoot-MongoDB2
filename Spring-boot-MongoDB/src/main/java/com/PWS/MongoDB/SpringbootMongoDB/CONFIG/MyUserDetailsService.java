package com.PWS.MongoDB.SpringbootMongoDB.CONFIG;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.PWS.MongoDB.SpringbootMongoDB.MODEL.User;
import com.PWS.MongoDB.SpringbootMongoDB.REPOSITORY.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
@Autowired
    UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        User user=repo.findByUsername(username);
        if (user==null) {
            throw new  UsernameNotFoundException("user 404");
            
        }
        return new UserPrincipal(user);
    }

}
