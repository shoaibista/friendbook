package com.semanticbits.friendbook.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;

/**
 * Created by shoaib on 3/18/14.
 */
public class CustomWebSecurityExpressionRoot extends WebSecurityExpressionRoot {

    public CustomWebSecurityExpressionRoot(Authentication a, FilterInvocation fi) {
        super(a, fi);
    }

    public boolean isOver18(){
        FriendBookUser user=(FriendBookUser)this.getPrincipal();
        return user.getAge()>18;
    }
}
