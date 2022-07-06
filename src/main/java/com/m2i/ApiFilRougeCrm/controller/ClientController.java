package com.m2i.ApiFilRougeCrm.controller;

import com.m2i.ApiFilRougeCrm.entity.Client;
import com.m2i.ApiFilRougeCrm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("clients")
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

}
