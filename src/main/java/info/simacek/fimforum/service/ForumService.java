/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.service;

import info.simacek.fimforum.domain.Folder;
import info.simacek.fimforum.domain.Forum;
import info.simacek.fimforum.domain.Message;
import java.util.List;

/**
 *
 * @author Jakub
 */
public interface ForumService {
    void createForum(Forum forum);
    void updateForum(Forum forum);
    void disableForum(Forum forum);
    void enableForum(Forum forum);
    void deleteForum(Forum forum);
    
    List<Message> getAllMessages();
    List<Message> getRecentMessages(int lastMessageId);
    int countRecentMessages(int lastMessageId);
    
    void createFolder(Folder folder);
    void moveFolder(Folder folder, Folder newParent);
    void removeFolder(Folder folder);
}
