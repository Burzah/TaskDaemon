/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreAutomaticModerationRulesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class CoreAutomaticModerationRules extends TableImpl<CoreAutomaticModerationRulesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>paradise_forums.core_automatic_moderation_rules</code>
     */
    public static final CoreAutomaticModerationRules CORE_AUTOMATIC_MODERATION_RULES = new CoreAutomaticModerationRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreAutomaticModerationRulesRecord> getRecordType() {
        return CoreAutomaticModerationRulesRecord.class;
    }

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_rules.rule_id</code>.
     */
    public final TableField<CoreAutomaticModerationRulesRecord, Integer> RULE_ID = createField(DSL.name("rule_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_rules.rule_types</code>.
     */
    public final TableField<CoreAutomaticModerationRulesRecord, String> RULE_TYPES = createField(DSL.name("rule_types"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_rules.rule_points_needed</code>.
     */
    public final TableField<CoreAutomaticModerationRulesRecord, Integer> RULE_POINTS_NEEDED = createField(DSL.name("rule_points_needed"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_rules.rule_position</code>.
     */
    public final TableField<CoreAutomaticModerationRulesRecord, Integer> RULE_POSITION = createField(DSL.name("rule_position"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_rules.rule_enabled</code>.
     */
    public final TableField<CoreAutomaticModerationRulesRecord, Integer> RULE_ENABLED = createField(DSL.name("rule_enabled"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>paradise_forums.core_automatic_moderation_rules.rule_filters</code>.
     */
    public final TableField<CoreAutomaticModerationRulesRecord, String> RULE_FILTERS = createField(DSL.name("rule_filters"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    private CoreAutomaticModerationRules(Name alias, Table<CoreAutomaticModerationRulesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreAutomaticModerationRules(Name alias, Table<CoreAutomaticModerationRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>paradise_forums.core_automatic_moderation_rules</code> table
     * reference
     */
    public CoreAutomaticModerationRules(String alias) {
        this(DSL.name(alias), CORE_AUTOMATIC_MODERATION_RULES);
    }

    /**
     * Create an aliased
     * <code>paradise_forums.core_automatic_moderation_rules</code> table
     * reference
     */
    public CoreAutomaticModerationRules(Name alias) {
        this(alias, CORE_AUTOMATIC_MODERATION_RULES);
    }

    /**
     * Create a <code>paradise_forums.core_automatic_moderation_rules</code>
     * table reference
     */
    public CoreAutomaticModerationRules() {
        this(DSL.name("core_automatic_moderation_rules"), null);
    }

    public <O extends Record> CoreAutomaticModerationRules(Table<O> child, ForeignKey<O, CoreAutomaticModerationRulesRecord> key) {
        super(child, key, CORE_AUTOMATIC_MODERATION_RULES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public Identity<CoreAutomaticModerationRulesRecord, Integer> getIdentity() {
        return (Identity<CoreAutomaticModerationRulesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreAutomaticModerationRulesRecord> getPrimaryKey() {
        return Keys.KEY_CORE_AUTOMATIC_MODERATION_RULES_PRIMARY;
    }

    @Override
    public CoreAutomaticModerationRules as(String alias) {
        return new CoreAutomaticModerationRules(DSL.name(alias), this);
    }

    @Override
    public CoreAutomaticModerationRules as(Name alias) {
        return new CoreAutomaticModerationRules(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAutomaticModerationRules rename(String name) {
        return new CoreAutomaticModerationRules(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAutomaticModerationRules rename(Name name) {
        return new CoreAutomaticModerationRules(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Integer, Integer, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
