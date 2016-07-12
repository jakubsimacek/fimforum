/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.service;

import info.simacek.fimforum.domain.Forum;
import info.simacek.fimforum.domain.Group;
import info.simacek.fimforum.domain.Member;
import info.simacek.fimforum.domain.Message;
import info.simacek.fimforum.domain.Questionnaire;
import info.simacek.fimforum.domain.Role;
import java.util.List;

/**
 *
 * @author Jakub
 */
public interface SecurityService {
    void createUser(Member member);
    void updateUser(Member member);
    void disableUser(Member member);
    void enableUser(Member member);
    void deleteUser(Member member);
    List<Member> getMembers();
    
    void createGroup(Group group);
    void updateGroup(Group group);
    void deleteGroup(Group group);
    List<Group> getGroups();
    
    void addGroupToGroup(Group parentGroup, Group group);
    void removeGroupFromGroup(Group parentGroup, Group group);
    List<Group> getGroupMebership(Group group);
    
    void addUserToGroup(Group group, Member member);
    void removeUserFromGroup(Group group, Member member);
    List<Group> getUserMebership(Group group);
    
    Member checkUserCredentials(String userName, byte[] password);
    
    // to be hidden
    boolean checkUserSystemRole(Member member, Role role);
    boolean checkUserAuthorization(Member member, Forum forum, Role role);
    boolean checkUserAuthorization(Member member, Message message, Role role);
    boolean checkQuestionnaireAuthorization(Member member, Questionnaire questionnaire);
}
