package uz.pdp.pdpfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pdpfoodapp.entity.audit.DailyOrder;

public interface DailyOrderRepository extends JpaRepository<DailyOrder, Long>, AbstractRepository {
}
