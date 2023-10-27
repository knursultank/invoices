package kz.bat.invoices.service;

import kz.bat.invoices.entity.Invoice;

public interface InvoiceService {
	
	Invoice getInvoice(String number);
}
