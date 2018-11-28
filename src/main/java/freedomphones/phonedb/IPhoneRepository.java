package freedomphones.phonedb;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import freedomphones.phonedb.phones.Phone;

@Repository
public interface IPhoneRepository extends MongoRepository<Phone, String> {
    @Query(value = "{'id':?0}")
    Optional<Phone> findById(String id);
}