/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author subaochen
 */
//@RequestRegister
@Alternative
@RequestScoped
public class RequestRegisterController extends Register implements Serializable {

    public RequestRegisterController() {
    }

    @PostConstruct
    public void init() {
        System.out.println("RequestRegisterController initializing,value=" + value);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("RequestRegisterController destroyed,value=" + value);
    }

}
