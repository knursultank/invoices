package kz.bat.invoices.utils;

import kz.bat.invoices.dto.InvoiceDto;
import kz.bat.invoices.entity.Invoice;

public class DtoConverter {
	
	public static InvoiceDto convertInvoiceToDto(Invoice invoice) {
		
		return new InvoiceDto().toDto(invoice);
		
	}
}
