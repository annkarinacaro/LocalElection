package com.example.localelection.Repositories;

import com.example.localelection.Entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    Candidate findCandidateByPartyId(Integer id);
}