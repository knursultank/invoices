package kz.bat.invoices.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kz.bat.invoices.entity.InvoiceFile;
import kz.bat.invoices.repository.FileRepo;
import kz.bat.invoices.repository.MarkingCodeRepo;
import kz.bat.invoices.service.FileService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FileServiceImpl implements FileService {
	
	private final FileRepo fileRepo;
	private final MarkingCodeRepo markingCodeRepo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);
	
	@Override
	public InvoiceFile getFileByInvoiceNumber(final String invoiceNumber) {
		return this.fileRepo.finbyInvoiceNumber(invoiceNumber);
	}
	
	@Override
	public List<InvoiceFile> getFilesByMarkingCode(final String mcode) {
		return this.markingCodeRepo.findAllByCode(mcode);
	}
}
