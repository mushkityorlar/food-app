package uz.pdp.pdpfoodapp.entity.auth;

import lombok.*;

import javax.persistence.*;

/**
 * @author johnl
 * @since 2/24/2022
 */

@Entity
@Table(name = "auth_role")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_code")
    private String code;

}
