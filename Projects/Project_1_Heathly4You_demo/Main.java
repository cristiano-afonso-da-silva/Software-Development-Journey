package Projects.Project_1_Heathly4You_demo;

import Projects.Project_1_Heathly4You_demo.service.UserService;
import Projects.Project_1_Heathly4You_demo.ui.ConsoleUI;
import Projects.Project_1_Heathly4You_demo.service.WeatherService;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserService userService = new UserService();
            WeatherService weatherService = new WeatherService();
            ConsoleUI consoleUI = new ConsoleUI(userService, weatherService);
            consoleUI.display();
        });
    }
}

