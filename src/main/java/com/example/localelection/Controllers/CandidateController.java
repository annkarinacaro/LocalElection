package com.example.localelection.Controllers;

import com.example.localelection.DTOs.CandidateDTO;
import com.example.localelection.Entities.Candidate;
import com.example.localelection.Repositories.PartyRepository;
import com.example.localelection.Services.CandidateService;
import com.example.localelection.Services.PartyService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class CandidateController {

    CandidateService candidateService;


    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    //WORKS
    @GetMapping("/candidates")
    public List<Candidate> getAllCandidates(){
        return candidateService.showAllCandidates();
    }


    //WORKS
    @DeleteMapping("/candidate/{id}")
    void deleteCandidate(@PathVariable int id){
        candidateService.deleteCandidate(id);
    }

    //WORKS
    @PostMapping("/candidate")
    CandidateDTO newCandidate(@RequestBody ObjectNode body) throws Exception {
        return candidateService.addCandidate(body.get("name").asText(), body.get("party_id").asInt());
    }

}
