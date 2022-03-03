package uz.husanov.pdpfoodapp.entity.audit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.husanov.pdpfoodapp.entity.Auditable;

import javax.persistence.Entity;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:08
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department extends Auditable {

    private String name;

    private String chatId;


}
