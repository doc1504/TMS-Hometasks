package org.example.service;

import org.example.domain.PersonEntity;
import org.example.domain.TaskEntity;

import javax.persistence.criteria.CriteriaBuilder;

public interface PersonDao {
    void savePerson (PersonEntity person);
    void updatePerson (PersonEntity person);
    PersonEntity getPersonById (Integer id);
    void deletePersonById(Integer id);
    void getPersonByTask();
    void deletePersonByQuery(Integer id);
}
