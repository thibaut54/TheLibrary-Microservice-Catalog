package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEditorEntity is a Querydsl query type for EditorEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEditorEntity extends EntityPathBase<EditorEntity> {

    private static final long serialVersionUID = 1857178044L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEditorEntity editorEntity = new QEditorEntity("editorEntity");

    public final ListPath<BookEntity, QBookEntity> bookList = this.<BookEntity, QBookEntity>createList("bookList", BookEntity.class, QBookEntity.class, PathInits.DIRECT2);

    public final QCoordinatesEntity coordinates;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QEditorEntity(String variable) {
        this(EditorEntity.class, forVariable(variable), INITS);
    }

    public QEditorEntity(Path<? extends EditorEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEditorEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEditorEntity(PathMetadata metadata, PathInits inits) {
        this(EditorEntity.class, metadata, inits);
    }

    public QEditorEntity(Class<? extends EditorEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coordinates = inits.isInitialized("coordinates") ? new QCoordinatesEntity(forProperty("coordinates"), inits.get("coordinates")) : null;
    }

}

