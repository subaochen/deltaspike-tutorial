/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

/**
 *
 * @author subaochen
 */
//@RequestRegister
@Alternative
@ConversationScoped
public class ConversationRegisterController extends Register implements Serializable {

    @Inject
    Conversation conversation;

    public ConversationRegisterController() {
    }

    @PostConstruct
    public void init() {
        System.out.println("ConversationRegisterController initializing,value=" + value);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ConversationRegisterController destroyed,value=" + value);
    }

    @Override
    public String confirm() {
        conversation.end();
        return super.confirm();
    }

    @Override
    public String step2() {
        return super.step2();
    }

    @Override
    public String step1() {
        conversation.begin();
        return super.step1();
    }

}
