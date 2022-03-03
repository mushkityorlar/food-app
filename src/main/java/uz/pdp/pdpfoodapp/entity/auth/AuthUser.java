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

    private String password;

    private String fullName;

    private String phoneNumber;

    private String role;

    private String language;

    private String chatId;

    private Long departmentId;

    private boolean active;

    private boolean blocked;
}
