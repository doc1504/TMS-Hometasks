package com.example.movie2.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity  @Table (name = "movies")
@NamedQuery(name = "MovieEntity.updateMovieByRating", query = "update MovieEntity set rating =:rating where id =:id")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private String date;
    private Integer rating;
}
