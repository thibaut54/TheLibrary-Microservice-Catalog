package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookLibraryId is a Querydsl query type for BookLibraryId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QBookLibraryId extends BeanPath<BookLibraryId> {

    private static final long serialVersionUID = 889208589L;

    public static final QBookLibraryId bookLibraryId = new QBookLibraryId("bookLibraryId");

    public final NumberPath<Integer> bookId = createNumber("bookId", Integer.class);

    public final NumberPath<Integer> libraryId = createNumber("libraryId", Integer.class);

    public QBookLibraryId(String variable) {
        super(BookLibraryId.class, forVariable(variable));
    }

    public QBookLibraryId(Path<? extends BookLibraryId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookLibraryId(PathMetadata metadata) {
        super(BookLibraryId.class, metadata);
    }

}

