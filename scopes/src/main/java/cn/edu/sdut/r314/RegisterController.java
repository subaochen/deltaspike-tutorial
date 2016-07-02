/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;
import org.apache.deltaspike.core.api.scope.WindowScoped;

/**
 *
 * @author subaochen
 */
@Named

public class RegisterController implements Serializable{
    @Inject User user;
    
    public String step1(){
        return "step2";
    }
    
    public String step2(){
        return "confirm";
    }
    
    public String confirm(){
        return "";
    }
    
}

