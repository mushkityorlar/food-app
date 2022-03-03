package uz.pdp.pdpfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pdpfoodapp.entity.audit.Complain;

public interface ComplainRepository extends JpaRepository<Complain, Long>, AbstractRepository {
}
