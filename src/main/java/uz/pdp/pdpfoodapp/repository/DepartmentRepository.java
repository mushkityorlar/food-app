package uz.pdp.pdpfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pdpfoodapp.entity.audit.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>, AbstractRepository {
}
