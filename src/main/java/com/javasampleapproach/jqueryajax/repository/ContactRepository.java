package com.javasampleapproach.jqueryajax.repository;


import com.javasampleapproach.jqueryajax.model.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

    List<ContactEntity> findByLastName(String lastName);

}
