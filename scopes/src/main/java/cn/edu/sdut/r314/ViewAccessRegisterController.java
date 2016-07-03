/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Alternative;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

/**
 *
 * @author subaochen
 */

//@RequestRegister
@Alternative
@ViewAccessScoped
public class ViewAccessRegisterController extends Register implements Serializable{
    public ViewAccessRegisterController(){}
    
    @PostConstruct
    public void init(){
        System.out.println("ViewAccessRegisterController initializing,value=" + value);
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("ViewAccessRegisterController destroyed,value=" + value);
    }
    
}

