/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Indexes;
import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreLogRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class CoreLog extends TableImpl<CoreLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>paradise_forums.core_log</code>
     */
    public static final CoreLog CORE_LOG = new CoreLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreLogRecord> getRecordType() {
        return CoreLogRecord.class;
    }

    /**
     * The column <code>paradise_forums.core_log.id</code>. ID Number
     */
    public final TableField<CoreLogRecord, ULong> ID = createField(DSL.name("id"), SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "ID Number");

    /**
     * The column <code>paradise_forums.core_log.exception_class</code>. If the
     * log was an exception, the class name
     */
    public final TableField<CoreLogRecord, String> EXCEPTION_CLASS = createField(DSL.name("exception_class"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "If the log was an exception, the class name");

    /**
     * The column <code>paradise_forums.core_log.exception_code</code>. If the
     * log was an exception, the code
     */
    public final TableField<CoreLogRecord, UInteger> EXCEPTION_CODE = createField(DSL.name("exception_code"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.inline("NULL", SQLDataType.INTEGERUNSIGNED)), this, "If the log was an exception, the code");

    /**
     * The column <code>paradise_forums.core_log.message</code>. The log message
     */
    public final TableField<CoreLogRecord, String> MESSAGE = createField(DSL.name("message"), SQLDataType.CLOB.nullable(false), this, "The log message");

    /**
     * The column <code>paradise_forums.core_log.backtrace</code>. The backtrace
     */
    public final TableField<CoreLogRecord, String> BACKTRACE = createField(DSL.name("backtrace"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "The backtrace");

    /**
     * The column <code>paradise_forums.core_log.time</code>. Unix timestamp of
     * log
     */
    public final TableField<CoreLogRecord, Integer> TIME = createField(DSL.name("time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Unix timestamp of log");

    /**
     * The column <code>paradise_forums.core_log.category</code>. Optional
     * string identifying the type of log
     */
    public final TableField<CoreLogRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(128).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "Optional string identifying the type of log");

    /**
     * The column <code>paradise_forums.core_log.url</code>. URL the error
     * occurred on, if any
     */
    public final TableField<CoreLogRecord, String> URL = createField(DSL.name("url"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "URL the error occurred on, if any");

    /**
     * The column <code>paradise_forums.core_log.member_id</code>. Member that
     * triggered the error, if any
     */
    public final TableField<CoreLogRecord, ULong> MEMBER_ID = createField(DSL.name("member_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "Member that triggered the error, if any");

    /**
     * The column <code>paradise_forums.core_log.loaded_hooks</code>. Any third
     * party hooks loaded
     */
    public final TableField<CoreLogRecord, String> LOADED_HOOKS = createField(DSL.name("loaded_hooks"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "Any third party hooks loaded");

    private CoreLog(Name alias, Table<CoreLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreLog(Name alias, Table<CoreLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.core_log</code> table reference
     */
    public CoreLog(String alias) {
        this(DSL.name(alias), CORE_LOG);
    }

    /**
     * Create an aliased <code>paradise_forums.core_log</code> table reference
     */
    public CoreLog(Name alias) {
        this(alias, CORE_LOG);
    }

    /**
     * Create a <code>paradise_forums.core_log</code> table reference
     */
    public CoreLog() {
        this(DSL.name("core_log"), null);
    }

    public <O extends Record> CoreLog(Table<O> child, ForeignKey<O, CoreLogRecord> key) {
        super(child, key, CORE_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_LOG_CATEGORY, Indexes.CORE_LOG_TIME);
    }

    @Override
    public Identity<CoreLogRecord, ULong> getIdentity() {
        return (Identity<CoreLogRecord, ULong>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreLogRecord> getPrimaryKey() {
        return Keys.KEY_CORE_LOG_PRIMARY;
    }

    @Override
    public CoreLog as(String alias) {
        return new CoreLog(DSL.name(alias), this);
    }

    @Override
    public CoreLog as(Name alias) {
        return new CoreLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreLog rename(String name) {
        return new CoreLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreLog rename(Name name) {
        return new CoreLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, String, UInteger, String, String, Integer, String, String, ULong, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
