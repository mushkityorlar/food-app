package uz.pdp.pdpfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pdpfoodapp.entity.auth.User;

/**
 * @author johnl
 * @since 2/24/2022
 */
public interface UserRepository extends JpaRepository<User, Long>, AbstractRepository {
    User findByUsername(String username);
}
