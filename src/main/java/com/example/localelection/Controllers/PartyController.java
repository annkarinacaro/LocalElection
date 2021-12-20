package com.example.localelection.Controllers;

import com.example.localelection.Services.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PartyController {

    PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService){
        this.partyService = partyService;
    }

    @GetMapping("/party/{id}")
    public Map<String, String> getParty(@PathVariable Integer id) throws Exception{
        return partyService.findParty(id);
    }
}
