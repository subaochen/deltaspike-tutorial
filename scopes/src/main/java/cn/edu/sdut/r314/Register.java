/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

/**
 *
 * @author subaochen
 */
public abstract class Register {
    protected String username;
    protected String password;
    protected String email;
    
    protected long value = System.currentTimeMillis();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
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
