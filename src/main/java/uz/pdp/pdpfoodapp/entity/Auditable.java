package uz.pdp.pdpfoodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author : Oyatjon  -> @data :3/2/2022 12:10
 */


@NoArgsConstructor
@AllArgsConstructor
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Convert(disableConversion = true)
    @Column(name = "createdat")
    private LocalDateTime createdat;

    @Column(name = "createby")
    private Long createby;

    @Convert(disableConversion = true)
    @Column(name = "updatedat")
    private LocalDateTime updatedat;

    @Column(name = "updateby")
    private Long updateby;
}
