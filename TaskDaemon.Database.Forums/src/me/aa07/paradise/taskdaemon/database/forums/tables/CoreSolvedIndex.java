/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Indexes;
import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreSolvedIndexRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreSolvedIndex extends TableImpl<CoreSolvedIndexRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>paradise_forums.core_solved_index</code>
     */
    public static final CoreSolvedIndex CORE_SOLVED_INDEX = new CoreSolvedIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreSolvedIndexRecord> getRecordType() {
        return CoreSolvedIndexRecord.class;
    }

    /**
     * The column <code>paradise_forums.core_solved_index.id</code>.
     */
    public final TableField<CoreSolvedIndexRecord, ULong> ID = createField(DSL.name("id"), SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>paradise_forums.core_solved_index.member_id</code>.
     */
    public final TableField<CoreSolvedIndexRecord, ULong> MEMBER_ID = createField(DSL.name("member_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.core_solved_index.app</code>.
     */
    public final TableField<CoreSolvedIndexRecord, String> APP = createField(DSL.name("app"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_solved_index.comment_class</code>.
     */
    public final TableField<CoreSolvedIndexRecord, String> COMMENT_CLASS = createField(DSL.name("comment_class"), SQLDataType.VARCHAR(100).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_solved_index.comment_id</code>.
     */
    public final TableField<CoreSolvedIndexRecord, UInteger> COMMENT_ID = createField(DSL.name("comment_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.core_solved_index.item_id</code>.
     */
    public final TableField<CoreSolvedIndexRecord, UInteger> ITEM_ID = createField(DSL.name("item_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.core_solved_index.solved_date</code>.
     */
    public final TableField<CoreSolvedIndexRecord, UInteger> SOLVED_DATE = createField(DSL.name("solved_date"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    private CoreSolvedIndex(Name alias, Table<CoreSolvedIndexRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreSolvedIndex(Name alias, Table<CoreSolvedIndexRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.core_solved_index</code> table
     * reference
     */
    public CoreSolvedIndex(String alias) {
        this(DSL.name(alias), CORE_SOLVED_INDEX);
    }

    /**
     * Create an aliased <code>paradise_forums.core_solved_index</code> table
     * reference
     */
    public CoreSolvedIndex(Name alias) {
        this(alias, CORE_SOLVED_INDEX);
    }

    /**
     * Create a <code>paradise_forums.core_solved_index</code> table reference
     */
    public CoreSolvedIndex() {
        this(DSL.name("core_solved_index"), null);
    }

    public <O extends Record> CoreSolvedIndex(Table<O> child, ForeignKey<O, CoreSolvedIndexRecord> key) {
        super(child, key, CORE_SOLVED_INDEX);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_SOLVED_INDEX_APP, Indexes.CORE_SOLVED_INDEX_MEMBER_SOLVED, Indexes.CORE_SOLVED_INDEX_SOLVED_CLASS, Indexes.CORE_SOLVED_INDEX_SOLVED_DATE);
    }

    @Override
    public Identity<CoreSolvedIndexRecord, ULong> getIdentity() {
        return (Identity<CoreSolvedIndexRecord, ULong>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreSolvedIndexRecord> getPrimaryKey() {
        return Keys.KEY_CORE_SOLVED_INDEX_PRIMARY;
    }

    @Override
    public CoreSolvedIndex as(String alias) {
        return new CoreSolvedIndex(DSL.name(alias), this);
    }

    @Override
    public CoreSolvedIndex as(Name alias) {
        return new CoreSolvedIndex(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreSolvedIndex rename(String name) {
        return new CoreSolvedIndex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreSolvedIndex rename(Name name) {
        return new CoreSolvedIndex(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, ULong, String, String, UInteger, UInteger, UInteger> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
