package com.example.localelection.Repositories;

import com.example.localelection.Entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Integer> {

    Party findPartyById(Integer id);

}
