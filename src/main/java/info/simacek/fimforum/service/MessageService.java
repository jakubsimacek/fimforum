/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.service;

import info.simacek.fimforum.domain.Forum;
import info.simacek.fimforum.domain.Message;
import java.util.List;

/**
 *
 * @author Jakub
 */
public interface MessageService {
    void createMessage(Message message);
    void updateMessage(Message message);
    void deleteMessage(Message message);
    
    List<Message> getMessages(Forum forum, int page, int maxEntries);
}
