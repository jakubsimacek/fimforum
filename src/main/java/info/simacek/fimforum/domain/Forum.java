/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jakub
 */
@Entity
public class Forum {
    @Id
    protected int id;
    protected String name;
    protected Folder folder;
    protected User createdBy;
    protected User changedBy;
    protected String description;
    protected Date created;
    protected Date changed;
    protected byte[] image;
    protected List<Message> messageList;
    protected Set<Forum> adminGroupSet;
    protected Set<Forum> publisherGroupSet;
    protected Set<Forum> readerGroupSet;
}
