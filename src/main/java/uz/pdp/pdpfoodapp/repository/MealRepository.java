package uz.pdp.pdpfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pdpfoodapp.entity.audit.Meal;

public interface MealRepository extends JpaRepository<Meal, Long>, AbstractRepository {
}
