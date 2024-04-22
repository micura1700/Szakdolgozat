package com.goldentable.restaurant.Repository;

import com.goldentable.restaurant.Entity.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {
    Email findByEmailName(String email);
}
