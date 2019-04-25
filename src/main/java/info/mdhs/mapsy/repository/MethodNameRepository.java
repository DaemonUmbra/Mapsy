package info.mdhs.mapsy.repository;

import info.mdhs.mapsy.dao.MethodName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MethodNameRepository extends CrudRepository<MethodName, Long>
{
}
