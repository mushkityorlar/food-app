package uz.husanov.pdpfoodapp.entity.audit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.husanov.pdpfoodapp.entity.Auditable;

import javax.persistence.Entity;
import java.time.LocalDateTime;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:08
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DailyMenu extends Auditable {

    private LocalDateTime date;

    private String name;



}
