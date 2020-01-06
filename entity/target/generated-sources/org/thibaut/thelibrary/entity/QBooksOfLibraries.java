package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBooksOfLibraries is a Querydsl query type for BooksOfLibraries
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBooksOfLibraries extends EntityPathBase<BooksOfLibraries> {

    private static final long serialVersionUID = -1987408712L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBooksOfLibraries booksOfLibraries = new QBooksOfLibraries("booksOfLibraries");

    public final QBookEntity book;

    public final QBookLibraryId id;

    public final QLibraryEntity library;

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    public QBooksOfLibraries(String variable) {
        this(BooksOfLibraries.class, forVariable(variable), INITS);
    }

    public QBooksOfLibraries(Path<? extends BooksOfLibraries> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBooksOfLibraries(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBooksOfLibraries(PathMetadata metadata, PathInits inits) {
        this(BooksOfLibraries.class, metadata, inits);
    }

    public QBooksOfLibraries(Class<? extends BooksOfLibraries> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new QBookEntity(forProperty("book"), inits.get("book")) : null;
        this.id = inits.isInitialized("id") ? new QBookLibraryId(forProperty("id")) : null;
        this.library = inits.isInitialized("library") ? new QLibraryEntity(forProperty("library"), inits.get("library")) : null;
    }

}

