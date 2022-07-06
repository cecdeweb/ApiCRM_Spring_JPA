package com.m2i.ApiFilRougeCrm.service;

import com.m2i.ApiFilRougeCrm.entity.Client;
import com.m2i.ApiFilRougeCrm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public void createClient(Client client){
        clientRepository.save(client);
    }

}