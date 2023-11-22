package kz.bat.invoices.dto;

import javax.persistence.Column;

import kz.bat.invoices.entity.Invoice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDto {
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	public InvoiceDto toDto(Invoice invoice) {
		return InvoiceDto.builder()
				.id(invoice.getId())
				.code(invoice.getCode())
				.build();
	}
}
