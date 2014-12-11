package com.semanticbits.friendbook.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shoaib on 3/18/14.
 */
public class CustomInMemoryUserDetailManager implements UserDetailsService{

    private Map<String,FriendBookUser> users=new HashMap<String, FriendBookUser>();

    public CustomInMemoryUserDetailManager(Collection<FriendBookUser> userList) {
        for(FriendBookUser user:userList){
            users.put(user.getUsername().toLowerCase(),user);
        }
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        FriendBookUser user=users.get(username);
        if(user==null){
            throw new UsernameNotFoundException(username);
        }
        FriendBookUser userNew=new FriendBookUser(user.getUsername(),user.getPassword(),user.getAuthorities()
                ,user.getLastName(),user.getAge());
        return userNew;
    }
}
