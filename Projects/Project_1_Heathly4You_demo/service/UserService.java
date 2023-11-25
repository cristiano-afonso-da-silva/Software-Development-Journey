package Projects.Project_1_Heathly4You_demo.service;

import Projects.Project_1_Heathly4You_demo.domain.User;;

public class UserService {
    public User createUser(String username, String password) {
        // Logic to create a new user
        return new User(username, password);
    }
    // Add other service methods as needed
}
