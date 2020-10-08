package rga.spring.two.shop.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import rga.spring.two.shop.dto.UserDto;


public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);
}
