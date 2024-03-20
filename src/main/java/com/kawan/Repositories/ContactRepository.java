package com.kawan.Repositories;

import com.kawan.Domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact,String> {
    Optional<Contact> findById (String id);
}
