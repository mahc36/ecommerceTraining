package com.training.ecommerce.repositoryjpa;

import com.training.ecommerce.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserRepositoryJPA extends JpaRepository<UserModel, Serializable> {

}
