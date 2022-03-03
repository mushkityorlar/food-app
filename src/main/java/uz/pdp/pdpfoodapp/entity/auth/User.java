package uz.pdp.pdpfoodapp.entity.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.pdpfoodapp.entity.Auditable;
import uz.pdp.pdpfoodapp.entity.audit.Department;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:07
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "auth_user")
public class User extends Auditable {
    @Column(unique = true)
    private String username;

    private String password;

    private String fullName;

    @Column(unique = true)
    private String phoneNumber;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = Collections.emptyList();

    private String language;

    private String chatId;

    @OneToOne
    private Department department;

    private boolean active;

    private boolean blocked;

}
