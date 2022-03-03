package uz.pdp.pdpfoodapp.service.user;


import org.springframework.security.core.userdetails.UserDetailsService;
import uz.pdp.pdpfoodapp.entity.auth.Role;
import uz.pdp.pdpfoodapp.entity.auth.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author johnl
 * @since 2/24/2022
 */
public interface UserService extends UserDetailsService {
    User saveUser(User user);

    Role saveRole(Role role);

    void attachRoleToUser(String username, String roleCode);

    User getUserByUsername(String username);

    List<User> getAllUsers();

    void getRefreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
