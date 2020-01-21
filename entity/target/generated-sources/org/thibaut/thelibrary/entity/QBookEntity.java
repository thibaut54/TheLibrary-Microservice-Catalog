package org.thibaut.thelibrary.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookEntity is a Querydsl query type for BookEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBookEntity extends EntityPathBase<BookEntity> {

    private static final long serialVersionUID = 253389112L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookEntity bookEntity = new QBookEntity("bookEntity");

    public final ListPath<AuthorEntity, QAuthorEntity> authorList = this.<AuthorEntity, QAuthorEntity>createList("authorList", AuthorEntity.class, QAuthorEntity.class, PathInits.DIRECT2);

    public final ListPath<CategoryEntity, QCategoryEntity> categorieList = this.<CategoryEntity, QCategoryEntity>createList("categorieList", CategoryEntity.class, QCategoryEntity.class, PathInits.DIRECT2);

    public final QEditorEntity editor;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> isbn = createNumber("isbn", Long.class);

    public final StringPath language = createString("language");

    public final ListPath<LibraryEntity, QLibraryEntity> librarieList = this.<LibraryEntity, QLibraryEntity>createList("librarieList", LibraryEntity.class, QLibraryEntity.class, PathInits.DIRECT2);

    public final ListPath<LoanEntity, QLoanEntity> loanList = this.<LoanEntity, QLoanEntity>createList("loanList", LoanEntity.class, QLoanEntity.class, PathInits.DIRECT2);

    public final NumberPath<Integer> numberOfPages = createNumber("numberOfPages", Integer.class);

    public final DateTimePath<org.joda.time.DateTime> publicationDate = createDateTime("publicationDate", org.joda.time.DateTime.class);

    public final StringPath title = createString("title");

    public QBookEntity(String variable) {
        this(BookEntity.class, forVariable(variable), INITS);
    }

    public QBookEntity(Path<? extends BookEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookEntity(PathMetadata metadata, PathInits inits) {
        this(BookEntity.class, metadata, inits);
    }

    public QBookEntity(Class<? extends BookEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.editor = inits.isInitialized("editor") ? new QEditorEntity(forProperty("editor"), inits.get("editor")) : null;
    }

}

