package Shinewash360.ShineWash360.service;

import Shinewash360.ShineWash360.model.RegistorCustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import Shinewash360.ShineWash360.repository.RegistorCumstomerRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistorCustomerServiceImp implements RegistorCustomerService{

    @Autowired
    private RegistorCumstomerRepository registorCumstomerRepository;

    @Override
    public String CustomerSave(RegistorCustomerModel registorCustomerModel) {
        if(registorCumstomerRepository.findByEmail(registorCustomerModel.getEmail()).isPresent()) {
            return "Email Id already Registered";
        }
        if (registorCumstomerRepository.findByPhone(registorCustomerModel.getPhone()).isPresent()){
            return "Phone Numaber Alredy Registored";
        }
        registorCumstomerRepository.save(registorCustomerModel);
        return "Registration SucessFull Completed";


    }
}
