package me.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.insta.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
