package Projects.Project_1_Heathly4You_demo.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Activity> activities;
    // private List<Sleep> sleepRecords;
    // private List<WaterIntake> waterIntakes;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.activities = new ArrayList<>();
        // this.sleepRecords = new ArrayList<>();
        // this.waterIntakes = new ArrayList<>();
    }

    // Getters and setters for username, password
    // Add methods to manage activities, sleep records, and water intakes
}

