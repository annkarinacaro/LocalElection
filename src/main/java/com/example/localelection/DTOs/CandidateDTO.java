package com.example.localelection.DTOs;

import com.example.localelection.Entities.Candidate;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateDTO {

    String name;
    PartyDTO party;

    public CandidateDTO(Candidate candidate){
        this.name = candidate.getName();
        this.party = new PartyDTO(candidate.getPartyId());
    }




}
