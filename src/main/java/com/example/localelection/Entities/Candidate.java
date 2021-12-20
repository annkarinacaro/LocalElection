package com.example.localelection.Entities;

import com.example.localelection.DTOs.PartyDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "candidate", schema = "localelection")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 11)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 240)
    private String name;
    @ManyToOne
    @JoinColumn(name = "party_id", nullable = false)
    private Party partyId;

    public Candidate(String name, Party partyId) {
        this.name = name;
        this.partyId = partyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }
}
