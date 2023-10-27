package kz.bat.invoices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kz.bat.invoices.entity.InvoiceFile;

@Service
public interface FileService {
	
	InvoiceFile getFileByInvoiceNumber(String invoiceNumber);
	List<InvoiceFile> getFilesByMarkingCode(String mcode);
}
