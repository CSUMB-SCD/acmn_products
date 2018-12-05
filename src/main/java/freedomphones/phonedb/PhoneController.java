package freedomphones.phonedb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import freedomphones.phonedb.phones.Phone;
@CrossOrigin(origins = "*", allowedHeaders= "*")
@RestController
public class PhoneController{
    @Autowired
    IPhoneRepository phoneRepository;

    @GetMapping("/allPhones")
    @ResponseBody
    PhoneList getAll(){
        List<Phone> phones = phoneRepository.findAll();
        PhoneList phonelist = new PhoneList();
        phonelist.phones = phones;
        return phonelist; 
    }
    @GetMapping("/findById/{id}")
    Optional<Phone> getById(@PathVariable String id){
        Optional<Phone> phone = phoneRepository.findById(id);
        return phone;
    }
}