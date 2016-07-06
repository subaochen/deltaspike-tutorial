/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;



import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.spi.BeanManager;
import javax.interceptor.InvocationContext;
import org.apache.deltaspike.security.api.authorization.Secures;
import org.picketlink.Identity;

/**
 *
 * @author subaochen
 */
@ApplicationScoped
public class LoggedInAuthorizer {
    
    @Secures
    @UserLoggedIn
    public boolean doSecuredCheck(InvocationContext ctx,BeanManager manager,Identity identity) throws Exception{
        return identity.isLoggedIn();
    }
    
}
