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

    private CandidateRepository candidateRepository;
    private PartyRepository partyRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository, PartyRepository partyRepository){
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
    }

    public List<CandidateDTO> getCandidates() throws Exception{
        Iterable<Candidate> candidates = candidateRepository.findAll();
        return CandidateDTO.candidateDTOList(candidates);
    }
}
