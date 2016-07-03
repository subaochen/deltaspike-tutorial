/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.enterprise.inject.Alternative;
import javax.faces.view.ViewScoped;

/**
 *
 * @author subaochen
 */
//@RequestRegister
@Alternative
@ViewScoped
public class ViewRegisterController extends Register implements Serializable {

    public ViewRegisterController() {
        System.out.println("ViewRegisterController initializing");
    }
}
