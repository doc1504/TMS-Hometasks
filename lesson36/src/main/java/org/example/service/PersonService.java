package org.example.service;
import org.example.domain.PersonEntity;
import org.example.dto.PersonSearchDto;
import java.util.List;
public interface PersonService {

    void save (PersonEntity person);

    void update(PersonEntity person);

    List<PersonEntity> findPersonByBirthday(PersonSearchDto personSearch);
    List<PersonEntity> findPersonByRole(PersonSearchDto personSearch);
    List<PersonEntity> findPersonByTaskStatus(PersonSearchDto personSearch);



}
