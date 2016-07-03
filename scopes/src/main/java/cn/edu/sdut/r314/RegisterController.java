/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author subaochen
 */
@Named
public class RegisterController implements Serializable {
    @Inject Register register;
    
    public Register getRegister(){
        return register;
    }
    
}
