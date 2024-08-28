package br.com.Thiwoldrs.API_Rest_register.repository;

import br.com.Thiwoldrs.API_Rest_register.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
