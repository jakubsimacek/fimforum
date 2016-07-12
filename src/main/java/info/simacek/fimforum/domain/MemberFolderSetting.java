/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.domain;

import java.util.Set;
import javax.persistence.Id;

/**
 *
 * @author Jakub
 */
public class MemberFolderSetting {
    @Id
    private int id; //to be replaced with a composite key
    protected Member member;
    protected Set<Folder> folderSet;
    protected int maxInterval;
    protected int maxMessages;
    protected boolean answersToMeOnly;
    protected int numOfLinesToInclude;    
}
