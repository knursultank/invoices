package kz.bat.invoices.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kz.bat.invoices.entity.InvoiceFile;
import kz.bat.invoices.service.FileService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/files")
public class FileController {
	
	private final FileService fileService;

	@GetMapping(value = "/{invoiceNum}")
	public InvoiceFile getFileByInvoiceNumber(@PathVariable String invoiceNum) {
		return fileService.getFileByInvoiceNumber(invoiceNum);
	}
	
	@GetMapping(value = "/{markingCode}")
	public List<InvoiceFile> getFileByMarkingCode(@PathVariable String markingCode) {
		return fileService.getFilesByMarkingCode(markingCode);
	}
}
