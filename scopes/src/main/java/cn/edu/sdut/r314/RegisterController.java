/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author subaochen
 */
@Named

public class RegisterController {
    @Inject User user;
    
    public String step1(){
        return "step2";
    }
    
    public String step2(){
        return "step3";
    }
    
    public String confirm(){
        return "";
    }
    
}

