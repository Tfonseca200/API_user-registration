package br.com.Thiwoldrs.API_Rest_register.controller;

import br.com.Thiwoldrs.API_Rest_register.model.UserModel;
import br.com.Thiwoldrs.API_Rest_register.recordDtos.UserRecordDto;
import br.com.Thiwoldrs.API_Rest_register.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/users")
    public ResponseEntity<UserModel> create (@RequestBody @Valid UserRecordDto userRecordDto){
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto, userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.save(userModel));

    }
}
