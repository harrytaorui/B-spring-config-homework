package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class LevelControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_return_basic_when_level_is_0() throws Exception {
        mockMvc.perform(get("/level")).andExpect(jsonPath("$", is("basic")));
    }

    @Test
    void should_return_advanced_when_level_is_1() throws Exception {
        mockMvc.perform(get("/level")).andExpect(jsonPath("$", is("advanced")));
    }
}
