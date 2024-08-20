package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="products")
@FieldDefaults(level=AccessLevel.PUBLIC)
@Getter
public class ProductEntity 
{
		@Id
		Integer productId;
		String productName;
		Integer price;
		String category;
}
