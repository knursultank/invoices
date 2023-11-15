package kz.bat.invoices.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kz.bat.invoices.entity.InvoiceFile;
import kz.bat.invoices.entity.MarkingCode;
import kz.bat.invoices.service.impl.FileServiceImpl;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/files")
public class FileController {
	
	private final FileServiceImpl fileService;

	@GetMapping(value = "/invoice/{invoiceNum}")
	public InvoiceFile getFileByInvoiceNumber(@PathVariable String invoiceNum) {
		return fileService.getFileByInvoiceNumber(invoiceNum);
	}
	
	@GetMapping(value = "/invoice/km")
	public List<MarkingCode> getFilesByInvoiceNumber(@RequestParam String invoiceNum) {
		return fileService.getFilesByInvoiceNumber(invoiceNum);
	}
	
	@GetMapping(value = "/km/{markingCode}")
	public List<MarkingCode> getFileByMarkingCode(@PathVariable String markingCode) {
		return fileService.getFilesByMarkingCode(markingCode);
	}
}
