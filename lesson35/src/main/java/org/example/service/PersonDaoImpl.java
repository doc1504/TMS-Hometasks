package org.example.service;

import org.example.config.HibernateConfig;
import org.example.domain.PersonEntity;
import org.example.domain.TaskEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    @Override
    public void savePerson(PersonEntity person) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }
    @Override
    public void updatePerson(PersonEntity person) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();
        session.close();
    }

    @Override
    public PersonEntity getPersonById(Integer id) {
        PersonEntity person = null;
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        person = session.get(PersonEntity.class, id);
        transaction.commit();
        session.close();
        return person;
    }

    @Override
    public void deletePersonById(Integer id) {
        PersonEntity person = null;
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        person = session.get(PersonEntity.class, id);
        session.delete(person);
        transaction.commit();
        session.close();
    }

    @Override
    public void getPersonByTask() {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        String hqlQuery = "select distinct person from TaskEntity where status = ?1 or status = ?2";
        Query<PersonEntity> query = session.createQuery(hqlQuery, PersonEntity.class);
        query.setParameter(1, "NEW");
        query.setParameter(2, "IN_PROGRESS");
        query.list().forEach(System.out::println);
        transaction.commit();
        session.close();
    }

    @Override
    public void deletePersonByQuery(Integer id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        String hqlQuery = "delete from PersonEntity where id = ?1";
        Query<PersonEntity> query = session.createQuery(hqlQuery, PersonEntity.class);
        query.setParameter(1, id);
        int result = query.executeUpdate();
        System.out.println("Delete from PersonEntity" + result);

        transaction.commit();
        session.close();
        //   У меня никак не получается сделать этот метод через запрос. Выдает ошибку
//       IllegalArgumentException: Update/delete queries cannot be typed. Не могу настроить,
//       чтоб работало.

    }
}
