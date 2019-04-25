package info.mdhs.mapsy.repository;

import info.mdhs.mapsy.dao.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
}
