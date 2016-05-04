/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jakub
 */
@Entity
public class Message {
    @Id
    protected int id;
    protected String text;
    protected User createdBy;
    protected User changedBy;
    protected Date created;
    protected Date changed;
    protected Message repliedTo;
    protected Forum forum;
}
