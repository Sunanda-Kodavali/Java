package com.example.t3_rest_api_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
//better version
@WebMvcTest(UserController.class)
public class UserControllerMockDataTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private UserRepository userRepository;

    UserEntity user;

    @BeforeEach
    void setup() {
        user = new UserEntity();
        user.setId(1L);
        user.setUsername("elbarto");
        user.setEmail("bart@gmail.com");
    }

    @Test
    void testGetUsers() throws Exception {
        List<UserEntity> users = List.of(user);
        when(userRepository.findAll()).thenReturn(users);

        mockMvc.perform(
                        MockMvcRequestBuilders.get("/api/users")
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value("1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].username").value("elbarto"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].email").value("bart@gmail.com"));

        verify(userRepository, times(1)).findAll();
    }

    @Test
    void testGetUserByIdentifier() throws Exception {
        when(userRepository.findByUsername("elbarto")).thenReturn(Optional.of(user));
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        mockMvc.perform(
                        MockMvcRequestBuilders.get("/api/users/elbarto")
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isMap())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("elbarto"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("bart@gmail.com"));

        mockMvc.perform(
                        MockMvcRequestBuilders.get("/api/users/1")
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isMap())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("elbarto"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("bart@gmail.com"));

        verify(userRepository, times(1)).findById(1L);
        verify(userRepository, times(1)).findByUsername("elbarto");
    }
}
