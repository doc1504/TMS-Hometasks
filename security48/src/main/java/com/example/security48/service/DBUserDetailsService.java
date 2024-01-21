package com.example.security48.service;
import com.example.security48.domain.PersonDto;
import com.example.security48.domain.PersonEntity;
import com.example.security48.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class DBUserDetailsService implements UserDetailsService {
    private final PersonRepository repository;
    private final PasswordEncoder encoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<PersonEntity> optionalPerson = repository.findByUsername(username);
        if (optionalPerson.isPresent()) {
            return optionalPerson.get();
        } else {
            return null;
        }
    }
    @Transactional
    public void save (PersonDto dto) {
        String username = dto.getUsername();
        String password = dto.getPassword();
        String email = dto.getEmail();
        Integer age = dto.getAge();
        PersonEntity person = new PersonEntity();
        person.setUsername(username);
        person.setPassword(encoder.encode(password));
        person.setEmail(email);
        person.setAge(age);
        person.setPerm("ROLE_USER");
        repository.save(person);
    }
}
