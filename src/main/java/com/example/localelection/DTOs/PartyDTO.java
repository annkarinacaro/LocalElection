package com.example.localelection.DTOs;

import com.example.localelection.Entities.Party;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartyDTO {


    String partyId;
    String partyName;


    public PartyDTO(Party p) {
        this.partyId = p.getPartyId();
        this.partyName = p.getPartyName();
    }


}
