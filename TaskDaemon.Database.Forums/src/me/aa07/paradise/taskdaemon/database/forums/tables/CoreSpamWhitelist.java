/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Indexes;
import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreSpamWhitelistRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class CoreSpamWhitelist extends TableImpl<CoreSpamWhitelistRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>paradise_forums.core_spam_whitelist</code>
     */
    public static final CoreSpamWhitelist CORE_SPAM_WHITELIST = new CoreSpamWhitelist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreSpamWhitelistRecord> getRecordType() {
        return CoreSpamWhitelistRecord.class;
    }

    /**
     * The column <code>paradise_forums.core_spam_whitelist.whitelist_id</code>.
     * ID Number
     */
    public final TableField<CoreSpamWhitelistRecord, ULong> WHITELIST_ID = createField(DSL.name("whitelist_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "ID Number");

    /**
     * The column
     * <code>paradise_forums.core_spam_whitelist.whitelist_type</code>.
     */
    public final TableField<CoreSpamWhitelistRecord, String> WHITELIST_TYPE = createField(DSL.name("whitelist_type"), SQLDataType.VARCHAR(10).nullable(false).defaultValue(DSL.inline("'ip'", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_spam_whitelist.whitelist_content</code>.
     */
    public final TableField<CoreSpamWhitelistRecord, String> WHITELIST_CONTENT = createField(DSL.name("whitelist_content"), SQLDataType.VARCHAR(250).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_spam_whitelist.whitelist_date</code>.
     */
    public final TableField<CoreSpamWhitelistRecord, Integer> WHITELIST_DATE = createField(DSL.name("whitelist_date"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_spam_whitelist.whitelist_reason</code>.
     */
    public final TableField<CoreSpamWhitelistRecord, String> WHITELIST_REASON = createField(DSL.name("whitelist_reason"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    private CoreSpamWhitelist(Name alias, Table<CoreSpamWhitelistRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreSpamWhitelist(Name alias, Table<CoreSpamWhitelistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.core_spam_whitelist</code> table
     * reference
     */
    public CoreSpamWhitelist(String alias) {
        this(DSL.name(alias), CORE_SPAM_WHITELIST);
    }

    /**
     * Create an aliased <code>paradise_forums.core_spam_whitelist</code> table
     * reference
     */
    public CoreSpamWhitelist(Name alias) {
        this(alias, CORE_SPAM_WHITELIST);
    }

    /**
     * Create a <code>paradise_forums.core_spam_whitelist</code> table reference
     */
    public CoreSpamWhitelist() {
        this(DSL.name("core_spam_whitelist"), null);
    }

    public <O extends Record> CoreSpamWhitelist(Table<O> child, ForeignKey<O, CoreSpamWhitelistRecord> key) {
        super(child, key, CORE_SPAM_WHITELIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_SPAM_WHITELIST_WHITELIST);
    }

    @Override
    public Identity<CoreSpamWhitelistRecord, ULong> getIdentity() {
        return (Identity<CoreSpamWhitelistRecord, ULong>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreSpamWhitelistRecord> getPrimaryKey() {
        return Keys.KEY_CORE_SPAM_WHITELIST_PRIMARY;
    }

    @Override
    public CoreSpamWhitelist as(String alias) {
        return new CoreSpamWhitelist(DSL.name(alias), this);
    }

    @Override
    public CoreSpamWhitelist as(Name alias) {
        return new CoreSpamWhitelist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreSpamWhitelist rename(String name) {
        return new CoreSpamWhitelist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreSpamWhitelist rename(Name name) {
        return new CoreSpamWhitelist(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<ULong, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
