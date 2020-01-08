package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookLibraryIdDTO is a Querydsl query type for BookLibraryIdDTO
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QBookLibraryIdDTO extends BeanPath<BookLibraryIdDTO> {

    private static final long serialVersionUID = -711836578L;

    public static final QBookLibraryIdDTO bookLibraryIdDTO = new QBookLibraryIdDTO("bookLibraryIdDTO");

    public final NumberPath<Integer> bookId = createNumber("bookId", Integer.class);

    public final NumberPath<Integer> libraryId = createNumber("libraryId", Integer.class);

    public QBookLibraryIdDTO(String variable) {
        super(BookLibraryIdDTO.class, forVariable(variable));
    }

    public QBookLibraryIdDTO(Path<? extends BookLibraryIdDTO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookLibraryIdDTO(PathMetadata metadata) {
        super(BookLibraryIdDTO.class, metadata);
    }

}

