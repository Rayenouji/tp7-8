package com.rayen.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rayen.produits.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}