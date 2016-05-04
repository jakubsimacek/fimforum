/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.fimforum.service;

import info.simacek.fimforum.domain.Answer;
import info.simacek.fimforum.domain.Question;
import info.simacek.fimforum.domain.Questionnaire;
import info.simacek.fimforum.domain.User;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jakub
 */
public interface QuestionnaireService {
    
    void createQuestion(Question question);
    void disableQuestion(Question question);
    void enableQuestion(Question question);
    void updateQuestion(Question question);
    void deleteQuestion(Question question);
    
    List<Question> getQuestions();
    
    void createQuestionnaire(Questionnaire questionnaire);
    void deleteQuestionnaire(Questionnaire questionnaire);
    void updateQuestionnaire(Questionnaire questionnaire);
    void publishQuestionnaire(Questionnaire questionnaire);
    
    List<Question> getQuestionnaireQuestions(Questionnaire questionnaire);
    
    void addQuestionToQuestionnaire(Questionnaire questionnaire, Question question);
    void removeQuestionFromQuestionnaire(Questionnaire questionnaire, Question question);
    
    void saveAnswers(Answer answer, boolean areFinal);
    
    Map<User, Answer> getAnswers(Questionnaire questionnaire);
    Set<Answer> getAnonymousAnswers(Questionnaire questionnaire);
    //Map<Question, QuestionStat> getStatistics(Questionnaire questionnaire);
}
