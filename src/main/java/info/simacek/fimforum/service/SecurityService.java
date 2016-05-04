/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.service;

import info.simacek.fimforum.domain.Forum;
import info.simacek.fimforum.domain.Group;
import info.simacek.fimforum.domain.Message;
import info.simacek.fimforum.domain.Questionnaire;
import info.simacek.fimforum.domain.Role;
import info.simacek.fimforum.domain.User;
import java.util.List;

/**
 *
 * @author Jakub
 */
public interface SecurityService {
    void createUser(User user);
    void updateUser(User user);
    void disableUser(User user);
    void enableUser(User user);
    void deleteUser(User user);
    List<User> getUsers();
    
    void createGroup(Group group);
    void updateGroup(Group group);
    void deleteGroup(Group group);
    List<Group> getGroups();
    
    void addGroupToGroup(Group parentGroup, Group group);
    void removeGroupFromGroup(Group parentGroup, Group group);
    List<Group> getGroupMebership(Group group);
    
    void addUserToGroup(Group group, User user);
    void removeUserFromGroup(Group group, User user);
    List<Group> getUserMebership(Group group);
    
    User checkUserCredentials(String userName, byte[] password);
    
    // to be hidden
    boolean checkUserSystemRole(User user, Role role);
    boolean checkUserAuthorization(User user, Forum forum, Role role);
    boolean checkUserAuthorization(User user, Message message, Role role);
    boolean checkQuestionnaireAuthorization(User user, Questionnaire questionnaire);
}
