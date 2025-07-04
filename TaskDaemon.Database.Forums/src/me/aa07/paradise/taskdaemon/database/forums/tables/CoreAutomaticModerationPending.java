/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreAutomaticModerationPendingRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreAutomaticModerationPending extends TableImpl<CoreAutomaticModerationPendingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>paradise_forums.core_automatic_moderation_pending</code>
     */
    public static final CoreAutomaticModerationPending CORE_AUTOMATIC_MODERATION_PENDING = new CoreAutomaticModerationPending();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreAutomaticModerationPendingRecord> getRecordType() {
        return CoreAutomaticModerationPendingRecord.class;
    }

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_pending.pending_object_class</code>.
     */
    public final TableField<CoreAutomaticModerationPendingRecord, String> PENDING_OBJECT_CLASS = createField(DSL.name("pending_object_class"), SQLDataType.VARCHAR(150).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_pending.pending_object_id</code>.
     */
    public final TableField<CoreAutomaticModerationPendingRecord, Long> PENDING_OBJECT_ID = createField(DSL.name("pending_object_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_pending.pending_report_id</code>.
     */
    public final TableField<CoreAutomaticModerationPendingRecord, Long> PENDING_REPORT_ID = createField(DSL.name("pending_report_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_pending.pending_added</code>.
     */
    public final TableField<CoreAutomaticModerationPendingRecord, Integer> PENDING_ADDED = createField(DSL.name("pending_added"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_pending.pending_rule_id</code>.
     */
    public final TableField<CoreAutomaticModerationPendingRecord, Integer> PENDING_RULE_ID = createField(DSL.name("pending_rule_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    private CoreAutomaticModerationPending(Name alias, Table<CoreAutomaticModerationPendingRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreAutomaticModerationPending(Name alias, Table<CoreAutomaticModerationPendingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>paradise_forums.core_automatic_moderation_pending</code> table
     * reference
     */
    public CoreAutomaticModerationPending(String alias) {
        this(DSL.name(alias), CORE_AUTOMATIC_MODERATION_PENDING);
    }

    /**
     * Create an aliased
     * <code>paradise_forums.core_automatic_moderation_pending</code> table
     * reference
     */
    public CoreAutomaticModerationPending(Name alias) {
        this(alias, CORE_AUTOMATIC_MODERATION_PENDING);
    }

    /**
     * Create a <code>paradise_forums.core_automatic_moderation_pending</code>
     * table reference
     */
    public CoreAutomaticModerationPending() {
        this(DSL.name("core_automatic_moderation_pending"), null);
    }

    public <O extends Record> CoreAutomaticModerationPending(Table<O> child, ForeignKey<O, CoreAutomaticModerationPendingRecord> key) {
        super(child, key, CORE_AUTOMATIC_MODERATION_PENDING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<UniqueKey<CoreAutomaticModerationPendingRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_CORE_AUTOMATIC_MODERATION_PENDING_PENDING_UNIQUE);
    }

    @Override
    public CoreAutomaticModerationPending as(String alias) {
        return new CoreAutomaticModerationPending(DSL.name(alias), this);
    }

    @Override
    public CoreAutomaticModerationPending as(Name alias) {
        return new CoreAutomaticModerationPending(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAutomaticModerationPending rename(String name) {
        return new CoreAutomaticModerationPending(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAutomaticModerationPending rename(Name name) {
        return new CoreAutomaticModerationPending(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, Long, Long, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
