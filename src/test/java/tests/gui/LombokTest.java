package tests.gui;

import core.ReadProperties;
import models.Project;
import models.User;
import org.testng.annotations.Test;

public class LombokTest {
    Project addProject;
    Project updateProject;

    @Test
    public void loginTest() {
        User user = User.builder()
                .email(ReadProperties.getUsername())
                .password(ReadProperties.getPassword())
                .build();

        user.setEmail(ReadProperties.getUsername());
        user.setPassword(ReadProperties.getPassword());

        User user1 = User.builder()
                .email(ReadProperties.getUsername())
                .password(ReadProperties.getPassword())
                .build();

        user.setEmail(ReadProperties.getUsername());
        user.setPassword(ReadProperties.getPassword());
    }
}
