package freedomphones.phonedb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import freedomphones.phonedb.phones.Phone;

@Repository
public interface IPhoneRepository extends MongoRepository<Phone, String> {

}