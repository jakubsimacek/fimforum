/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.domain;

import javax.persistence.Entity;

/**
 *
 * @author Jakub
 */
@Entity
public class ForumUserStats {
    
    protected Forum forum;
    protected User user;
    //protected Date lastVisit;
    protected int lastMessageId;
}
