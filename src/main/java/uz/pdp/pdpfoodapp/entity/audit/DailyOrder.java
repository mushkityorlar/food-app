package uz.pdp.pdpfoodapp.entity.audit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.pdpfoodapp.entity.Auditable;
import uz.pdp.pdpfoodapp.entity.auth.User;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:08
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DailyOrder extends Auditable {

    @OneToOne
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id", referencedColumnName = "id")
    private Meal meal;


    private LocalDateTime dateTime;

    private Boolean accepted;
}
