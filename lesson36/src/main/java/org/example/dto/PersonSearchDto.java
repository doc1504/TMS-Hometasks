package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.Role;
import org.example.domain.Status;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonSearchDto {

    private LocalDate startBirthday;
    private LocalDate endBirthday;
    private Role role;
    private Status taskStatus;
}
