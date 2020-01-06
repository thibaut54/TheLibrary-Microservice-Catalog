package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLibraryEntity is a Querydsl query type for LibraryEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLibraryEntity extends EntityPathBase<LibraryEntity> {

    private static final long serialVersionUID = -1149340354L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLibraryEntity libraryEntity = new QLibraryEntity("libraryEntity");

    public final ListPath<BookEntity, QBookEntity> books = this.<BookEntity, QBookEntity>createList("books", BookEntity.class, QBookEntity.class, PathInits.DIRECT2);

    public final QCoordinatesEntity coordinates;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QLibraryEntity(String variable) {
        this(LibraryEntity.class, forVariable(variable), INITS);
    }

    public QLibraryEntity(Path<? extends LibraryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLibraryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLibraryEntity(PathMetadata metadata, PathInits inits) {
        this(LibraryEntity.class, metadata, inits);
    }

    public QLibraryEntity(Class<? extends LibraryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coordinates = inits.isInitialized("coordinates") ? new QCoordinatesEntity(forProperty("coordinates"), inits.get("coordinates")) : null;
    }

}

