package com.example.localelection.Entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "party", schema = "localelection")
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 11)
    private int id;
    @Basic
    @Column(name = "party_id", nullable = false, length = 4)
    private String partyId;
    @Basic
    @Column(name = "party_name", nullable = false, length = 240)
    private String partyName;

    @OneToMany(
            mappedBy = "party",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Candidate> candidate = new ArrayList<>();

    public Party(int id,String partyId, String partyName) {
        this.id = id;
        this.partyId = partyId;
        this.partyName = partyName;
    }

    public void setCandidate(List<Candidate> candidate) {
        this.candidate = candidate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }
}

