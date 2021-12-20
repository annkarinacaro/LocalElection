package com.example.localelection.DTOs;

import com.example.localelection.Entities.Candidate;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateDTO {

    String name;
    PartyDTO party;

    public CandidateDTO(Candidate candidate) {
        this.name = candidate.getName();
        this.party = new PartyDTO(candidate.getParty()) ;
    }

    public static List<CandidateDTO> candidateDTOList(Iterable<Candidate> candidates){
        List<CandidateDTO> candidate1 = StreamSupport.stream(candidates.spliterator(), false)
                .map(candidate -> new CandidateDTO(candidate))
                .collect(Collectors.toList());
        return candidate1;
    }

    public PartyDTO getParty(){
        return party;
    }
}
