package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLoanEntity is a Querydsl query type for LoanEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLoanEntity extends EntityPathBase<LoanEntity> {

    private static final long serialVersionUID = -1973743105L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLoanEntity loanEntity = new QLoanEntity("loanEntity");

    public final QBookEntity book;

    public final DatePath<java.time.LocalDate> extendedEndDate = createDate("extendedEndDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> initialEndDate = createDate("initialEndDate", java.time.LocalDate.class);

    public final BooleanPath returned = createBoolean("returned");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final QUserEntity user;

    public QLoanEntity(String variable) {
        this(LoanEntity.class, forVariable(variable), INITS);
    }

    public QLoanEntity(Path<? extends LoanEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLoanEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLoanEntity(PathMetadata metadata, PathInits inits) {
        this(LoanEntity.class, metadata, inits);
    }

    public QLoanEntity(Class<? extends LoanEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.book = inits.isInitialized("book") ? new QBookEntity(forProperty("book"), inits.get("book")) : null;
        this.user = inits.isInitialized("user") ? new QUserEntity(forProperty("user"), inits.get("user")) : null;
    }

}

