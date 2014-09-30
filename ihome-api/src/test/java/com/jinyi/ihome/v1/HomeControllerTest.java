package com.jinyi.ihome.v1;

import com.jinyi.ihome.api.Application;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by warrior on 14/9/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class HomeControllerTest {

    @Autowired
    private WebApplicationContext context;


    private MockMvc mvc;

    public void setUp() {

    }

    @Test
    public void testHome() throws Exception {
        this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
        this.mvc.perform(MockMvcRequestBuilders.get("/api/v1/home/hello")).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello"));
    }
}
