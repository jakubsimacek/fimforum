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
public class Group {
    @Id
    protected int id;
    protected String name;
    protected Set<Group> groupSet;
    protected Set<Member> memberSet;
    protected Set<Role> roleSet;
    protected Set<Forum> forumAdminSet;
    protected Set<Forum> forumPublisherSet;
    protected Set<Forum> forumReaderSet;
}
