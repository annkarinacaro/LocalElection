package com.example.localelection.Controllers;

import com.example.localelection.DTOs.CandidateDTO;
import com.example.localelection.Entities.Candidate;
import com.example.localelection.Entities.Party;
import com.example.localelection.Services.CandidateService;
import com.example.localelection.Services.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {
    CandidateService candidateService;
    PartyService partyService;

    @Autowired
    public CandidateController(CandidateService candidateService){
        this.candidateService = candidateService;
    }
    @GetMapping("/candidates")
    public List<CandidateDTO> showCandidates() throws Exception{
        return candidateService.getCandidates();
    }

}
