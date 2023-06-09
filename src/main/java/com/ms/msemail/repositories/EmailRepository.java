package com.ms.msemail.repositories;

import com.ms.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {


}
