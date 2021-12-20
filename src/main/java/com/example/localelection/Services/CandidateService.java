package com.example.localelection.Services;

import com.example.localelection.DTOs.CandidateDTO;
import com.example.localelection.Entities.Candidate;
import com.example.localelection.Entities.Party;
import com.example.localelection.Repositories.CandidateRepository;
import com.example.localelection.Repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CandidateService {
    CandidateRepository candidateRepository;
    PartyRepository partyRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository, PartyRepository partyRepository) {
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
    }

    public List<Candidate> showAllCandidates(){
        return  candidateRepository.findAll();
    }


   public void deleteCandidate(int id){
        candidateRepository.deleteById(id);
   }

    public CandidateDTO addCandidate(String name, Integer id) throws Exception{
        Party pId = partyRepository.findPartyById(id);
        Candidate candidate = candidateRepository.save(new Candidate(name, pId));
        CandidateDTO candidateDTO = new CandidateDTO(candidate);
        return null;
    }

    }



