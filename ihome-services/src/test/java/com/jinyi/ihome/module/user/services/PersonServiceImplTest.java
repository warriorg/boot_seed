package com.jinyi.ihome.module.user.services;

import com.jinyi.ihome.ServiceTestConfig;
import com.jinyi.ihome.module.user.domain.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by warrior on 14/9/30.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServiceTestConfig.class)
public class PersonServiceImplTest {

    @Autowired
    PersonService service;

    @Test
    public void findByIdTest() {
        Person person = service.findById(1);
        Assert.assertNotNull(person);
    }
}
