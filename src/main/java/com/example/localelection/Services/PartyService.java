package com.example.localelection.Services;

import com.example.localelection.Entities.Party;
import com.example.localelection.Repositories.PartyRepository;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
    private PartyRepository partyRepository;

    @Autowired
    public PartyService(PartyRepository partyRepository){
        this.partyRepository = partyRepository;
    }

    public Map<String, String> findParty(Integer id) throws Exception{
        Party party = partyRepository.findPartyById(id);
        HashMap<String, String> map = new HashMap<>();

        map.put("party_id", party.getPartyId());
        map.put("party_name", party.getPartyName());
        return map;

    }
}
