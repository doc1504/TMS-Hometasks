package org.example;
import org.apache.commons.lang3.StringUtils;
import org.example.config.HibernateConfig;
import org.example.domain.PersonEntity;
import org.example.domain.Role;
import org.example.domain.Status;
import org.example.domain.TaskEntity;
import org.example.dto.PersonSearchDto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        PersonEntity person1 = PersonEntity.builder()
                .name("Person1")
                .role(Role.ADMIN)
                .isMan(true)
                .birthday(LocalDate.of(1980, 12, 01))
                .build();
        PersonEntity person2 = PersonEntity.builder()
                .name("Person2")
                .role(Role.SUPPORT)
                .isMan(true)
                .birthday(LocalDate.of(1990, 01, 01))
                .build();
        TaskEntity task1 = TaskEntity.builder().task("TO CALL").status(Status.IN_PROGRESS).build();
        TaskEntity task2 = TaskEntity.builder().task("TO CHECK").status(Status.DONE).build();
        TaskEntity task3 = TaskEntity.builder().task("TO ANSWER").status(Status.NEW).build();
        TaskEntity task4 = TaskEntity.builder().task("CALL").status(Status.IN_PROGRESS).build();

        session.save(person1);
        session.save(person2);
        session.save(task1);
        session.save(task2);
        session.save(task3);
        session.save(task4);
        person1.addTask(task1);
        person1.addTask(task2);
        person2.addTask(task3);
        person2.addTask(task4);
        PersonSearchDto personSearch = PersonSearchDto.builder()
//                .startBirthday(LocalDate.of(1985, 01, 01))
//                .endBirthday(LocalDate.of(2000, 01, 01))
//                .role(Role.SUPPORT)
                .taskStatus(Status.NEW)
                .build();
        Criteria criteria = session.createCriteria(PersonEntity.class, "pe");
        Criteria taskCriteria = criteria.createCriteria("pe.tasks", "pt");

        List result;
        if (personSearch == null) {
            result = criteria.list();
        } else {
            if (personSearch.getStartBirthday() != null && personSearch.getEndBirthday() != null) {
                criteria.add(Restrictions.between("birthday", personSearch.getStartBirthday(),
                        personSearch.getEndBirthday()));
            }

            if (Objects.nonNull(personSearch.getRole())) {
                criteria.add(Restrictions.eq("role", Role.SUPPORT));
            }
            taskCriteria.add(Restrictions.eq("pt.status", Status.NEW));

        }

        result = criteria.list();
        for (var person : result) {
            System.out.println(person);
        }

        transaction.commit();
        session.close();
    }
}