package uz.pdp.pdpfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pdpfoodapp.entity.audit.DailyMenu;

public interface DailyMenuRepository extends JpaRepository<DailyMenu, Long>, AbstractRepository {
}
