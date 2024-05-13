package com.solution.gestion_tache;

import com.solution.gestion_tache.security.services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionTacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionTacheApplication.class, args);
        }
    @Bean
    public CommandLineRunner commandLineRunner(AccountService accountService){

        return args -> {
            /* accountService.createUser("Developpeur","1234","dev@gmail.com","1234");
            accountService.createUser("Chef de projet","1234","chef@gmail.com","1234");

            accountService.createRole("Chef de projet");
            accountService.createRole("Developpeur");

            accountService.addRoleToUser("Developpeur","Developpeur");
            accountService.addRoleToUser("Chef de projet","Chef de projet");
            accountService.addRoleToUser("Chef de projet","Developpeur");

            accountService.removeRoleFromUser("Chef de projet","Developpeur");
       */
            System.out.println(accountService.loadUserByNom("Developpeur").getEmail());
        } ;

    }

}
