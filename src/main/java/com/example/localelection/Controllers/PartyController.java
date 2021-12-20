package com.example.localelection.Controllers;

import com.example.localelection.DTOs.PartyDTO;
import com.example.localelection.Services.PartyService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("newParty")
    public PartyDTO addParty(@RequestBody ObjectNode body) throws Exception {
        return partyService.addParty(body.get("party_id").asText(), body.get("party_name").asText());
    }
}
