package com.semanticbits.friendbook.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by shoaib on 3/18/14.
 */
public class FriendBookUser extends org.springframework.security.core.userdetails.User {

    private String lastName;
    private int age;
    public FriendBookUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, String lastName, int age){
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.lastName=lastName;
        this.age=age;
    }

    public FriendBookUser(String username,String password,Collection<? extends GrantedAuthority> authorities,String lastName,int age){
        this(username,password,true,true,true,true,authorities,lastName,age);
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
