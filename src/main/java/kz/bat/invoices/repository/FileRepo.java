package kz.bat.invoices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.bat.invoices.entity.Files;

@Repository
public interface FileRepo extends JpaRepository<Files, Long> {

}
