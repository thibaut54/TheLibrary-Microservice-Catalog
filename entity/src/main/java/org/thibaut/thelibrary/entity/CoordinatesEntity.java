package org.thibaut.thelibrary.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "coordinates")
@Getter
@Setter
@EqualsAndHashCode
public class CoordinatesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String street;
	private String streetNumber;
	private String additionalInformation;
	private String city;
	private Long postalCode;
	private String phone;
	private String email;


	@OneToOne(mappedBy = "coordinates") //--> la value de mappedBy, c'est le nom de la Classe qui porte la relation ou le nom de la Table en DB
	private UserEntity user;

	@OneToOne(mappedBy = "coordinates")
	private EditorEntity editor;

	@OneToOne(mappedBy = "coordinates")
	private LibraryEntity library;

}//end CoordinatesEntity
