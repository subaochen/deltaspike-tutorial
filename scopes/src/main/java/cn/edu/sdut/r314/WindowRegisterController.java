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
import org.apache.deltaspike.core.api.scope.WindowScoped;

/**
 *
 * @author subaochen
 */
//@RequestRegister
@Alternative
@WindowScoped
public class WindowRegisterController extends Register implements Serializable {

    public WindowRegisterController() {
    }

    @PostConstruct
    public void init() {
        System.out.println("WindowRegisterController initializing,value=" + value);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("WindowRegisterController destroyed,value=" + value);
    }

}
