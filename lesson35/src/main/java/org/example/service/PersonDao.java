package org.example.service;

import org.example.domain.PersonEntity;

import java.util.List;

public interface PersonDao {
    void save(PersonEntity person);
    void update(PersonEntity person);
    PersonEntity getPersonById (Integer id);
    void deletePersonById(Integer id);
    List<PersonEntity> findPersonWithActiveTask();
    void deletePersonByQuery(Integer id);
}
