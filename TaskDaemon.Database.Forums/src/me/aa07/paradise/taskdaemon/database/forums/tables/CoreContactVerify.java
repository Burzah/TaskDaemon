/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreContactVerifyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreContactVerify extends TableImpl<CoreContactVerifyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>paradise_forums.core_contact_verify</code>
     */
    public static final CoreContactVerify CORE_CONTACT_VERIFY = new CoreContactVerify();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreContactVerifyRecord> getRecordType() {
        return CoreContactVerifyRecord.class;
    }

    /**
     * The column
     * <code>paradise_forums.core_contact_verify.email_address</code>.
     */
    public final TableField<CoreContactVerifyRecord, String> EMAIL_ADDRESS = createField(DSL.name("email_address"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_contact_verify.verify_key</code>.
     */
    public final TableField<CoreContactVerifyRecord, String> VERIFY_KEY = createField(DSL.name("verify_key"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_contact_verify.verify_time</code>.
     */
    public final TableField<CoreContactVerifyRecord, Long> VERIFY_TIME = createField(DSL.name("verify_time"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>paradise_forums.core_contact_verify.contact_data</code>.
     */
    public final TableField<CoreContactVerifyRecord, String> CONTACT_DATA = createField(DSL.name("contact_data"), SQLDataType.CLOB.nullable(false), this, "");

    private CoreContactVerify(Name alias, Table<CoreContactVerifyRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreContactVerify(Name alias, Table<CoreContactVerifyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.core_contact_verify</code> table
     * reference
     */
    public CoreContactVerify(String alias) {
        this(DSL.name(alias), CORE_CONTACT_VERIFY);
    }

    /**
     * Create an aliased <code>paradise_forums.core_contact_verify</code> table
     * reference
     */
    public CoreContactVerify(Name alias) {
        this(alias, CORE_CONTACT_VERIFY);
    }

    /**
     * Create a <code>paradise_forums.core_contact_verify</code> table reference
     */
    public CoreContactVerify() {
        this(DSL.name("core_contact_verify"), null);
    }

    public <O extends Record> CoreContactVerify(Table<O> child, ForeignKey<O, CoreContactVerifyRecord> key) {
        super(child, key, CORE_CONTACT_VERIFY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public UniqueKey<CoreContactVerifyRecord> getPrimaryKey() {
        return Keys.KEY_CORE_CONTACT_VERIFY_PRIMARY;
    }

    @Override
    public CoreContactVerify as(String alias) {
        return new CoreContactVerify(DSL.name(alias), this);
    }

    @Override
    public CoreContactVerify as(Name alias) {
        return new CoreContactVerify(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreContactVerify rename(String name) {
        return new CoreContactVerify(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreContactVerify rename(Name name) {
        return new CoreContactVerify(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
