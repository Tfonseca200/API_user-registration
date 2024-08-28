package br.com.Thiwoldrs.API_Rest_register.controller;

import br.com.Thiwoldrs.API_Rest_register.model.UserModel;
import br.com.Thiwoldrs.API_Rest_register.recordDtos.UserRecordDto;
import br.com.Thiwoldrs.API_Rest_register.repository.UserRepository;
import br.com.Thiwoldrs.API_Rest_register.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public ResponseEntity<UserModel> create (@RequestBody @Valid UserRecordDto userRecordDto){
        var createUser = userService.createUser(userRecordDto);
        return ResponseEntity.status(HttpStatus.OK).body(createUser);

    }

    @GetMapping("/users")
    public ResponseEntity<List<UserModel>> getAll (){
        List<UserModel> users = userService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Object> getOne (@PathVariable (value = "id")UUID id){
        var user = userService.getOne(id);

        if(user.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("USER NOT FOUND");
        }
        return ResponseEntity.status(HttpStatus.OK).body(user.get());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Object> updateUser (@PathVariable(value = "id") UUID id,
                                              @RequestBody @Valid UserRecordDto userRecordDto){

        Optional<UserModel> userO = userService.updateUser(id, userRecordDto);
        if (userO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("USER NOT FOUND");
        }

        return ResponseEntity.status(HttpStatus.OK).body(userO.get());
    }

    @DeleteMapping("users/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable (value = "id") UUID id){
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("USER DELETED SUCESSFULLY.");
    }
}
