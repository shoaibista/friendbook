package com.semanticbits.friendbook.security.handler;

import com.semanticbits.friendbook.security.CustomWebSecurityExpressionRoot;
import org.springframework.security.access.expression.AbstractSecurityExpressionHandler;
import org.springframework.security.access.expression.SecurityExpressionOperations;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;

/**
 * Created by shoaib on 3/18/14.
 */
public class CustomWebSecurityExpressionHandler  extends AbstractSecurityExpressionHandler<FilterInvocation>{
    @Override
    protected SecurityExpressionOperations createSecurityExpressionRoot(Authentication authentication, FilterInvocation filterInvocation) {
        CustomWebSecurityExpressionRoot expressionRoot=new CustomWebSecurityExpressionRoot(authentication,filterInvocation);
        expressionRoot.setPermissionEvaluator(getPermissionEvaluator());
        expressionRoot.setTrustResolver(new AuthenticationTrustResolverImpl());
        return expressionRoot;
    }
}
