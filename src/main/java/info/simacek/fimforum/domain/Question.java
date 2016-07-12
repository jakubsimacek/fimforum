/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.domain;

import java.util.Date;

/**
 *
 * @author Jakub
 */
public class Question {
    
    /**
    *    If true then this question can be used in multiple questionnaires and is
    *    offered to other users
    */
    private boolean global;
    
    /**
     * Owner of this question
     */
    private Member owner;
    
    private Date createdOn;
    
    private String label;
    
    /**
     * 
     */
    private boolean anonymous;
}
