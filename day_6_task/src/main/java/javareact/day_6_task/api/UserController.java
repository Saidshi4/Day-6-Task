package javareact.day_6_task.api;

import javareact.day_6_task.business.concretes.UserService;
import javareact.day_6_task.model.dto.UserDto;
import javareact.day_6_task.model.dto.UserGetDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/user")
@RequiredArgsConstructor
public class UserController {
   private final UserService userService;
   @PostMapping()
    public void saveUser(@RequestBody UserDto userDto){
       userService.save(userDto);
   }
   @GetMapping("/{email}")
    public UserGetDto getUserByEmail(@PathVariable String email){
       return userService.getByEmail(email);
   }
}
