/**
 * 
 */
package com.atanu.spring.product.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AvailableProductDetails implements Serializable {

	private static final long serialVersionUID = 5588204732117103617L;

	private Long productId;
	private Long productCount;

}