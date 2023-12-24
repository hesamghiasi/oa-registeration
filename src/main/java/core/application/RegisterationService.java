package core.application;

import core.domain.model.User;
import core.domain.services.UserRepository;

public class RegisterationService {

    private final UserRepository userService;
    private final NotificationService notificationService;

    public RegisterationService(UserRepository userService, NotificationService notificationService) {
        this.userService = userService;
        this.notificationService = notificationService;
    }

    public RegisterationResponse register(RegisterationRequest registerationRequest) {
        //// TODO: 12/25/23 convert registerationRequest to user
        User user = new User();
        user.validateName();
        userService.save(user);
        notificationService.sendEmail(new SendEmailRequest());
        return null;
    }
}
