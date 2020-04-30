package com.emanuelcmesquita.dev.web.service;

import com.emanuelcmesquita.dev.web.domain.Person;
import com.emanuelcmesquita.dev.web.repository.PersonRepository;
import com.emanuelcmesquita.dev.web.service.dto.PersonDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonDTO getPersonById(Long id) throws NotFoundException {
        Optional<Person> person = personRepository.findById(id);

        if (!person.isPresent()) {
            throw new NotFoundException("Pessoa não existe!");
        }

        return new PersonDTO(person.get());
    }

    public List<PersonDTO> getPersons(){
        return new ArrayList<PersonDTO>(PersonDTO.converter(personRepository.findAll()));
    }

}
