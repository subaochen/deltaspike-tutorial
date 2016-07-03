/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author subaochen
 */
public class DefaultRegisterController extends Register implements Serializable {

    public DefaultRegisterController() {
    }

    @PostConstruct
    public void init() {
        System.out.println("DefaultRegisterController initializing,value=" + value);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DefaultRegisterController destroyed,value=" + value);
    }

}
