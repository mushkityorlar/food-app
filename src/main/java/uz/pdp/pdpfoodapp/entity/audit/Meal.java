package uz.pdp.pdpfoodapp.entity.audit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.pdpfoodapp.entity.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:35
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Meal extends Auditable {

    @Column(unique = true)
    private String name;

    @Column
    private String profileImage;

    @Column
    private String description;

}
