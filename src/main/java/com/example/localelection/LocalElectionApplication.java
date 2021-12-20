package com.example.localelection;

import com.example.localelection.Entities.Candidate;
import com.example.localelection.Entities.Party;
import com.example.localelection.Repositories.PartyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LocalElectionApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
        SpringApplication.run(LocalElectionApplication.class, args);
        PartyRepository partyRepository = configurableApplicationContext.getBean(PartyRepository.class);






    }

}
