package uz.pdp.pdpfoodapp.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.pdp.pdpfoodapp.entity.auth.Role;
import uz.pdp.pdpfoodapp.service.user.UserService;

import java.net.URI;

/**
 * @author johnl
 * @since 2/24/2022
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/role")
public class RoleResource {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }
}
