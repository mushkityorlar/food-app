package uz.pdp.pdpfoodapp.entity.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.pdpfoodapp.entity.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:07
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AuthUser extends Auditable {

    @Column(unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String position;

    @Column(name = "active")
    private boolean active;

    private String fullName;

    private String chatId;

    private String role;
}
