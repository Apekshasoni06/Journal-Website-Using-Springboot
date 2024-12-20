package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {
    @GetMapping("/health-check")
    public String HealthCheck() {
        return "Ok";
    }

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public void createuser(@RequestBody User user){
        userService.saveNewUser(user);
    }
}
