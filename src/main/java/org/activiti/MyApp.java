package org.activiti;

// import org.activiti.engine.IdentityService;
// import org.activiti.engine.identity.Group;
// import org.activiti.engine.identity.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})
public class MyApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

    //    @Bean
    //    public CommandLineRunner init(final RepositoryService repositoryService,
    //                                  final RuntimeService runtimeService,
    //                                  final TaskService taskService) {
    //
    //        return new CommandLineRunner() {
    //            @Override
    //            public void run(String... strings) throws Exception {
    //                Map<String, Object> variables = new HashMap<String, Object>();
    //                variables.put("applicantName", "John Doe");
    //                variables.put("email", "john.doe@activiti.com");
    //                variables.put("phoneNumber", "123456789");
    //                runtimeService.startProcessInstanceByKey("hireProcess", variables);
    //            }
    //        };
    //
    //    }

    // @Bean
    // InitializingBean usersAndGroupsInitializer(final IdentityService identityService) {
    //
    //     return new InitializingBean() {
    //         @Override
    //         public void afterPropertiesSet() throws Exception {
    //
    //             Group group = identityService.newGroup("user");
    //             group.setName("users");
    //             group.setType("security-role");
    //             identityService.saveGroup(group);
    //
    //             User admin = identityService.newUser("admin");
    //             admin.setPassword("admin");
    //             identityService.saveUser(admin);
    //
    //         }
    //     };
    // }

}
