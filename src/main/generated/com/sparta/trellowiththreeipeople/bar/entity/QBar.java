package com.sparta.trellowiththreeipeople.bar.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBar is a Querydsl query type for Bar
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBar extends EntityPathBase<Bar> {

    private static final long serialVersionUID = -1936981981L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBar bar = new QBar("bar");

    public final com.sparta.trellowiththreeipeople.common.QBaseEntity _super = new com.sparta.trellowiththreeipeople.common.QBaseEntity(this);

    public final com.sparta.trellowiththreeipeople.board.entity.QBoard board;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> createrId = createNumber("createrId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> lastModifierId = createNumber("lastModifierId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final NumberPath<Long> orderNum = createNumber("orderNum", Long.class);

    public final StringPath title = createString("title");

    public QBar(String variable) {
        this(Bar.class, forVariable(variable), INITS);
    }

    public QBar(Path<? extends Bar> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBar(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBar(PathMetadata metadata, PathInits inits) {
        this(Bar.class, metadata, inits);
    }

    public QBar(Class<? extends Bar> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new com.sparta.trellowiththreeipeople.board.entity.QBoard(forProperty("board")) : null;
    }

}
