/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jakub
 */
@Entity
public class User {
    @Id
    protected int id;
    protected String name;
    protected String email;
    protected String login;
    protected byte[] password;
    protected String description;
    protected byte[] image;
    protected Set<Role> roleSet;
    protected Set<Group> groupSet;
}
