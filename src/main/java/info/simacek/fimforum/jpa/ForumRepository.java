/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.jpa;

import info.simacek.fimforum.domain.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jakub
 */
public interface ForumRepository extends JpaRepository<Forum, Integer> {
    
}
