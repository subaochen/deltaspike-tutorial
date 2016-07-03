/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author subaochen
 */
//@RequestRegister
@Alternative
@ApplicationScoped
public class ApplicationRegisterController extends Register implements Serializable {

    @PostConstruct
    public void init() {
        System.out.println("ApplicationRegisterController initializing,value=" + value);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ApplicationRegisterController destroyed,value=" + value);
    }
}
