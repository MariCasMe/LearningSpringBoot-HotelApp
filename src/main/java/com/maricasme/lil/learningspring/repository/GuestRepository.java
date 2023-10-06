package com.maricasme.lil.learningspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.maricasme.lil.learningspring.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {

}
