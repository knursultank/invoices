package kz.bat.invoices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.bat.invoices.entity.InvoiceFile;

@Repository
public interface FileRepo extends JpaRepository<InvoiceFile, Long> {
	
	InvoiceFile findByInvoiceNumber(String invoiceNum);
}
