package kz.bat.invoices.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class InvoiceFileDto {
	private Long id;
	
	private Long invoice;
	
	@Column(name = "invoice_number")
	private String invoiceNumber;
}
