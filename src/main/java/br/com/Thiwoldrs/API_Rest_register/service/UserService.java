package br.com.Thiwoldrs.API_Rest_register.service;


import br.com.Thiwoldrs.API_Rest_register.model.UserModel;
import br.com.Thiwoldrs.API_Rest_register.recordDtos.UserRecordDto;
import br.com.Thiwoldrs.API_Rest_register.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }


    public UserModel createUser (UserRecordDto userRecordDto){
        var userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto, userModel);
        return userRepository.save(userModel);
    }



    public List<UserModel> getAll (){
        List<UserModel> users = userRepository.findAll();
        return users;
    }



    public Optional<UserModel> getOne(UUID id){
        return userRepository.findById(id);
    }



    public Optional<UserModel> updateUser(UUID id, UserRecordDto userRecordDto){
        Optional<UserModel> user = userRepository.findById(id);
        if (user.isEmpty()){
            return Optional.empty();
        }

        UserModel userModel = user.get();
        BeanUtils.copyProperties(userRecordDto, userModel);
        return Optional.of(userRepository.save(userModel));
    }



    public Optional<UserModel> deleteUser (UUID id){
        Optional<UserModel> userO = userRepository.findById(id);

        if (userO.isEmpty()){
            return Optional.empty();
        }

        UserModel userModel = userO.get();
        userRepository.delete(userModel);
        return Optional.of(userModel);
    }
}
