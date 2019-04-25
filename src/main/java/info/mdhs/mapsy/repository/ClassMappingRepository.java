package info.mdhs.mapsy.repository;

import info.mdhs.mapsy.dao.ClassMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassMappingRepository extends CrudRepository<ClassMapping, Long>
{
}
