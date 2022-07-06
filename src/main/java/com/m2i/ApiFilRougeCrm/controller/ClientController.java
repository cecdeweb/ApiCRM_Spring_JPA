package com.m2i.ApiFilRougeCrm.controller;

import com.m2i.ApiFilRougeCrm.entity.Client;
import com.m2i.ApiFilRougeCrm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("clients")
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @PostMapping("clients")
    public void createClient(@RequestBody Client client){
        clientService.createClient(client);
    }

    @GetMapping("clients/{id}")
    public Client getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @PutMapping("clients/{id}")
    public void updateClient(@RequestBody Client client){
        clientService.updateClient(client);
    }

}
