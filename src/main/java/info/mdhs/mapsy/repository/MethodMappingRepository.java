package info.mdhs.mapsy.repository;

import info.mdhs.mapsy.dao.MethodMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodMappingRepository extends CrudRepository<MethodMapping, Long>
{
}
