package info.mdhs.mapsy.repository;

import info.mdhs.mapsy.dao.FieldMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldMappingRepository extends CrudRepository<FieldMapping, Long>
{
}
