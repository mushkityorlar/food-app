package uz.pdp.pdpfoodapp.entity.audit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.pdpfoodapp.entity.Auditable;
import uz.pdp.pdpfoodapp.entity.auth.User;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:08
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Complain extends Auditable {

    @OneToOne()
    private User user;

    private String message;


}
