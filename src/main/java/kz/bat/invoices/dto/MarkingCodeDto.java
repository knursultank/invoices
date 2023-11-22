package kz.bat.invoices.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class MarkingCodeDto {
	private Long id;
	
	private Long invoice;
	
	@Column(name = "invoice_number")
	private String invoiceNumber;
	
	@Column(name = "code")
	private String code;
}
