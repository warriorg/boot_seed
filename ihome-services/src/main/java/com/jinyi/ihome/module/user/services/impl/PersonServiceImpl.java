package com.jinyi.ihome.module.user.services.impl;

import com.jinyi.ihome.module.user.PersonTo;
import com.jinyi.ihome.module.user.domain.Person;
import com.jinyi.ihome.module.user.mapper.PersonMapper;
import com.jinyi.ihome.module.user.repository.PersonRepository;
import com.jinyi.ihome.module.user.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by warrior on 14/9/29.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    public PersonRepository repository;

    @Override
    public PersonTo findById(long key) {
        Person person = repository.findOne(key);
        return PersonMapper.toTo(person);
    }
}
