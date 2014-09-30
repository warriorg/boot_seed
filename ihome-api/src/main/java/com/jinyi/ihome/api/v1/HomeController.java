package com.jinyi.ihome.api.v1;

import com.jinyi.ihome.module.user.PersonTo;
import com.jinyi.ihome.module.user.domain.Person;
import com.jinyi.ihome.module.user.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jinyi.ihome.infrastructure.MessageTo;

@RestController
@RequestMapping("api/v1/home")
public class HomeController {
	
	@RequestMapping("hello")
	public String hello(){

		return "hello";
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping("msg")
	public MessageTo msg(){
		MessageTo msg = new MessageTo();
		
		return msg;
	}

    @Autowired
    public PersonService personService;

    @RequestMapping("person/{id}")
    @ResponseBody
    public MessageTo<PersonTo> getPerson(@PathVariable long id) {
        MessageTo<PersonTo> msg = new MessageTo<PersonTo>();
        PersonTo person = personService.findById(id);
        msg.setData(person);
        return msg;
    }

}
