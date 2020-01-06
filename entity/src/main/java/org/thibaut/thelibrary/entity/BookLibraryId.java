package org.thibaut.thelibrary.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BookLibraryId implements Serializable {

	private Integer bookId;
	private Integer libraryId;
}
