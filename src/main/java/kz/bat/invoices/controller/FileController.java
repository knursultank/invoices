package kz.bat.invoices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kz.bat.invoices.service.FileService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/files")
@AllArgsConstructor
public class FileController {
	
	private final FileService fileService;

	@GetMapping(value = "/{invoiceNum}")
	public ResponseEntity getFileByInvoiceNumber(@PathVariable("invoiceNum") final String invoiceNum) {
		return ResponseEntity.ok(this.fileService.getFileByInvoiceNumber(invoiceNum));
	}
	
	@GetMapping(value = "/{markingCode}")
	public ResponseEntity getFileByMarkingCode(@PathVariable("markingCode") final String markingCode) {
		return ResponseEntity.ok(this.fileService.getFilesByMarkingCode(markingCode));
	}
}
