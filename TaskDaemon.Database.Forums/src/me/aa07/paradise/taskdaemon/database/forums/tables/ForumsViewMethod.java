/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.ForumsViewMethodRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForumsViewMethod extends TableImpl<ForumsViewMethodRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>paradise_forums.forums_view_method</code>
     */
    public static final ForumsViewMethod FORUMS_VIEW_METHOD = new ForumsViewMethod();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForumsViewMethodRecord> getRecordType() {
        return ForumsViewMethodRecord.class;
    }

    /**
     * The column <code>paradise_forums.forums_view_method.member_id</code>.
     */
    public final TableField<ForumsViewMethodRecord, ULong> MEMBER_ID = createField(DSL.name("member_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_view_method.method</code>.
     */
    public final TableField<ForumsViewMethodRecord, String> METHOD = createField(DSL.name("method"), SQLDataType.VARCHAR(10).nullable(false).defaultValue(DSL.inline("'table'", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_view_method.type</code>.
     */
    public final TableField<ForumsViewMethodRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(16).nullable(false).defaultValue(DSL.inline("'index'", SQLDataType.VARCHAR)), this, "");

    private ForumsViewMethod(Name alias, Table<ForumsViewMethodRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForumsViewMethod(Name alias, Table<ForumsViewMethodRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.forums_view_method</code> table
     * reference
     */
    public ForumsViewMethod(String alias) {
        this(DSL.name(alias), FORUMS_VIEW_METHOD);
    }

    /**
     * Create an aliased <code>paradise_forums.forums_view_method</code> table
     * reference
     */
    public ForumsViewMethod(Name alias) {
        this(alias, FORUMS_VIEW_METHOD);
    }

    /**
     * Create a <code>paradise_forums.forums_view_method</code> table reference
     */
    public ForumsViewMethod() {
        this(DSL.name("forums_view_method"), null);
    }

    public <O extends Record> ForumsViewMethod(Table<O> child, ForeignKey<O, ForumsViewMethodRecord> key) {
        super(child, key, FORUMS_VIEW_METHOD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<UniqueKey<ForumsViewMethodRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_FORUMS_VIEW_METHOD_MEMBER_ID);
    }

    @Override
    public ForumsViewMethod as(String alias) {
        return new ForumsViewMethod(DSL.name(alias), this);
    }

    @Override
    public ForumsViewMethod as(Name alias) {
        return new ForumsViewMethod(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForumsViewMethod rename(String name) {
        return new ForumsViewMethod(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForumsViewMethod rename(Name name) {
        return new ForumsViewMethod(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
