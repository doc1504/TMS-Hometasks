package org.example.domain;
import lombok.*;
import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity @Table (name = "tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String task;
    private String definition;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    @ToString.Exclude
    private PersonEntity person;
}
