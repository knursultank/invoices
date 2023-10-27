package kz.bat.invoices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.bat.invoices.entity.Invoice;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Long> {

}
