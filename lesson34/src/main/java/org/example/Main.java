package org.example;

import org.example.config.HibernateConfig;
import org.example.entity.Married;
import org.example.entity.PersonEntity;
import org.example.entity.PhoneEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        PersonEntity person = PersonEntity.builder()
                .name("person1")
                        .date(new Date())
                                .isMan(true)
                                        .married(Married.SINGLE)

                .build();

        PhoneEntity phone1 = PhoneEntity.builder(). number("29-756-72-56").build();
        PhoneEntity phone2 = PhoneEntity.builder(). number("33-674-67-98").build();
        PhoneEntity phone3 = PhoneEntity.builder(). number("2-56-78").build();
        session.save(person);
        session.save(phone1);
        session.save(phone2);
        session.save(phone3);

        PersonEntity person1 = session.get(PersonEntity.class, 1);
        System.out.println(person1);

        transaction.commit();
        session.close();
    }
}