package kz.bat.invoices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.bat.invoices.entity.InvoiceFile;
import kz.bat.invoices.entity.MarkingCode;

@Repository
public interface MarkingCodeRepo extends JpaRepository<MarkingCode, Long> {
	
	List<MarkingCode> findAllByCode(String code);
	List<MarkingCode> findAllByInvoiceNumber(String invoiceNumber);
}
