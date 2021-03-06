/**
 * 
 */
package dev.atanu.ecom.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This entity class is mapped with the table COLOUR_DETAILS in database
 * 
 * @see ProductEntity
 * @see BrandEntity
 * @see CategoryEntity
 * @see AvailableProductEntity
 * 
 * @author Atanu Bhowmick
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "COLOUR_DETAILS", uniqueConstraints = {
		@UniqueConstraint(name = "UNIQUE_COLOUR_NAME", columnNames = "COLOUR_NAME") })
public class ColourEntity extends BaseEntity {

	private static final long serialVersionUID = -8100606870046052611L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COLOUR_ID")
	private Long colourId;

	@Column(name = "COLOUR_NAME")
	private String colourName;
}
