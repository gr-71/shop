package rga.spring.two.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rga.spring.two.shop.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByName(String name);
}
