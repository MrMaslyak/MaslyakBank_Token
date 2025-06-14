package MaslyakBank_Core.controller;


import MaslyakBank_Core.dto.DeleteUsersDTO;
import MaslyakBank_Core.dto.RegistrationRequestDTO;
import MaslyakBank_Core.entity.UsersTable;
import MaslyakBank_Core.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/maslyakbank/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/registration")
    public UsersTable registration(@RequestBody RegistrationRequestDTO dto) {
        return userService.registration(dto);
    }

    @DeleteMapping("/delete")
    public DeleteUsersDTO deleteUser(@RequestBody DeleteUsersDTO login) {
        return userService.deleteUser(login);
    }



}
