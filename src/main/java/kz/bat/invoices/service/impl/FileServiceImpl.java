package kz.bat.invoices.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kz.bat.invoices.dto.InvoiceDto;
import kz.bat.invoices.entity.InvoiceFile;
import kz.bat.invoices.entity.MarkingCode;
import kz.bat.invoices.repository.FileRepo;
import kz.bat.invoices.repository.MarkingCodeRepo;
import kz.bat.invoices.service.FileService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FileServiceImpl {
	private final FileRepo fileRepo;
	private final MarkingCodeRepo markingCodeRepo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);
	
	public InvoiceFile getFileByInvoiceNumber(final String invoiceNumber) {
		return this.fileRepo.findByInvoiceNumber(invoiceNumber);
	}
	
	public List<MarkingCode> getFilesByMarkingCode(final String mcode) {
		return this.markingCodeRepo.findAllByCode(mcode);
	}
	
	public List<MarkingCode> getFilesByInvoiceNumber(final String invoiceNumber) {
		return this.markingCodeRepo.findAllByInvoiceNumber(invoiceNumber);
	}
	
	public InvoiceDto readAndSaveInvoice(String filePath) {
		
		return new InvoiceDto();
	}
}
