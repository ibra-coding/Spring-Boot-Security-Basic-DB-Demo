package com.example.springbootsecuritydbdemo.bootstrap;

import com.example.springbootsecuritydbdemo.models.MyUser;
import com.example.springbootsecuritydbdemo.repositories.MyUserRepository;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {
    private final MyUserRepository myUserRepository;

    public DataLoader(MyUserRepository myUserRepository) {
        this.myUserRepository = myUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        myUserRepository.save(new MyUser("ibra",
                "123",
                "ADMIN",
                true,
                true,
                true,
                true));
    }
}
