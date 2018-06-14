package com.delivarius.delivarius_api.dto;

import java.math.BigDecimal;

public class ItemOrderDto implements DataTranferObject{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private ProductDto productDto;
	
	private Integer amount;
	
	private BigDecimal totalPrice;
	
	public ItemOrderDto() {}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductDto getProductDto() {
		return productDto;
	}

	public void setProductDto(ProductDto productDto) {
		this.productDto = productDto;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}