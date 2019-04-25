package info.mdhs.mapsy.repository;

import info.mdhs.mapsy.dao.FieldName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldNameRepository extends CrudRepository<FieldName, Long>
{
}
