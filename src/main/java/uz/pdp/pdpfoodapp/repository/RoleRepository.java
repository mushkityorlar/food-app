package uz.pdp.pdpfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pdpfoodapp.entity.auth.Role;

/**
 * @author johnl
 * @since 2/24/2022
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByCode(String roleCode);
}
