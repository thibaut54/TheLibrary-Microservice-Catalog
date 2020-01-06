package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoordinatesEntity is a Querydsl query type for CoordinatesEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCoordinatesEntity extends EntityPathBase<CoordinatesEntity> {

    private static final long serialVersionUID = 1082800766L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoordinatesEntity coordinatesEntity = new QCoordinatesEntity("coordinatesEntity");

    public final StringPath additionalInformation = createString("additionalInformation");

    public final StringPath city = createString("city");

    public final QEditorEntity editor;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLibraryEntity library;

    public final StringPath phone = createString("phone");

    public final NumberPath<Long> postalCode = createNumber("postalCode", Long.class);

    public final StringPath street = createString("street");

    public final StringPath streetNumber = createString("streetNumber");

    public final QUserEntity user;

    public QCoordinatesEntity(String variable) {
        this(CoordinatesEntity.class, forVariable(variable), INITS);
    }

    public QCoordinatesEntity(Path<? extends CoordinatesEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoordinatesEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoordinatesEntity(PathMetadata metadata, PathInits inits) {
        this(CoordinatesEntity.class, metadata, inits);
    }

    public QCoordinatesEntity(Class<? extends CoordinatesEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.editor = inits.isInitialized("editor") ? new QEditorEntity(forProperty("editor"), inits.get("editor")) : null;
        this.library = inits.isInitialized("library") ? new QLibraryEntity(forProperty("library"), inits.get("library")) : null;
        this.user = inits.isInitialized("user") ? new QUserEntity(forProperty("user"), inits.get("user")) : null;
    }

}

