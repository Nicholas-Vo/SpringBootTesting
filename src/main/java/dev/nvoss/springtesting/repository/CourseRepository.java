package dev.nvoss.springtesting.repository;

import dev.nvoss.springtesting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<User, String> {
}
