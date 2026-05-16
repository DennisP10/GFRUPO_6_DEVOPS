package com.cat.user.service.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cat.user.service.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByCorreoIgnoreCase(String correo);
}
