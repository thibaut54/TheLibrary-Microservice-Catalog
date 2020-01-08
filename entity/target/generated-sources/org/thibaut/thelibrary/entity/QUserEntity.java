package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = -450926438L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final QCoordinatesEntity coordinates;

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    public final ListPath<LoanEntity, QLoanEntity> loanList = this.<LoanEntity, QLoanEntity>createList("loanList", LoanEntity.class, QLoanEntity.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final DateTimePath<org.joda.time.DateTime> registrationDate = createDateTime("registrationDate", org.joda.time.DateTime.class);

    public final ListPath<RoleEntity, QRoleEntity> roleList = this.<RoleEntity, QRoleEntity>createList("roleList", RoleEntity.class, QRoleEntity.class, PathInits.DIRECT2);

    public final StringPath userName = createString("userName");

    public QUserEntity(String variable) {
        this(UserEntity.class, forVariable(variable), INITS);
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserEntity(PathMetadata metadata, PathInits inits) {
        this(UserEntity.class, metadata, inits);
    }

    public QUserEntity(Class<? extends UserEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coordinates = inits.isInitialized("coordinates") ? new QCoordinatesEntity(forProperty("coordinates"), inits.get("coordinates")) : null;
    }

}

