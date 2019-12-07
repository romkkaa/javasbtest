package task.repository;

import task.model.entity.DetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<DetailsEntity, Long> {
}
