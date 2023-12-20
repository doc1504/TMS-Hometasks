package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity @Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String birthday;
    private Boolean isMan;
    @OneToMany(mappedBy = "person",
    cascade = CascadeType.ALL)
    private List<TaskEntity> tasks;


    public void addTask(TaskEntity task) {
        if (tasks ==null) {
            tasks = new ArrayList<>();
        }
        tasks.add(task);
        task.setPerson(this);
    }



}
