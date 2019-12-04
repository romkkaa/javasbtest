package repository;

import entity.PurchaseItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseItemRepository extends CrudRepository<PurchaseItem, Long> {

}
