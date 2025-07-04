/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Indexes;
import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreTagsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class CoreTags extends TableImpl<CoreTagsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>paradise_forums.core_tags</code>
     */
    public static final CoreTags CORE_TAGS = new CoreTags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreTagsRecord> getRecordType() {
        return CoreTagsRecord.class;
    }

    /**
     * The column <code>paradise_forums.core_tags.tag_id</code>.
     */
    public final TableField<CoreTagsRecord, Long> TAG_ID = createField(DSL.name("tag_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_aai_lookup</code>.
     */
    public final TableField<CoreTagsRecord, String> TAG_AAI_LOOKUP = createField(DSL.name("tag_aai_lookup"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("''", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_aap_lookup</code>.
     */
    public final TableField<CoreTagsRecord, String> TAG_AAP_LOOKUP = createField(DSL.name("tag_aap_lookup"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("''", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_meta_app</code>.
     */
    public final TableField<CoreTagsRecord, String> TAG_META_APP = createField(DSL.name("tag_meta_app"), SQLDataType.VARCHAR(200).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_meta_area</code>.
     */
    public final TableField<CoreTagsRecord, String> TAG_META_AREA = createField(DSL.name("tag_meta_area"), SQLDataType.VARCHAR(200).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_meta_id</code>.
     */
    public final TableField<CoreTagsRecord, Integer> TAG_META_ID = createField(DSL.name("tag_meta_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_meta_parent_id</code>.
     */
    public final TableField<CoreTagsRecord, Integer> TAG_META_PARENT_ID = createField(DSL.name("tag_meta_parent_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_member_id</code>.
     */
    public final TableField<CoreTagsRecord, Long> TAG_MEMBER_ID = createField(DSL.name("tag_member_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_added</code>.
     */
    public final TableField<CoreTagsRecord, Integer> TAG_ADDED = createField(DSL.name("tag_added"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_prefix</code>.
     */
    public final TableField<CoreTagsRecord, Integer> TAG_PREFIX = createField(DSL.name("tag_prefix"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.core_tags.tag_text</code>.
     */
    public final TableField<CoreTagsRecord, String> TAG_TEXT = createField(DSL.name("tag_text"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    private CoreTags(Name alias, Table<CoreTagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreTags(Name alias, Table<CoreTagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.core_tags</code> table reference
     */
    public CoreTags(String alias) {
        this(DSL.name(alias), CORE_TAGS);
    }

    /**
     * Create an aliased <code>paradise_forums.core_tags</code> table reference
     */
    public CoreTags(Name alias) {
        this(alias, CORE_TAGS);
    }

    /**
     * Create a <code>paradise_forums.core_tags</code> table reference
     */
    public CoreTags() {
        this(DSL.name("core_tags"), null);
    }

    public <O extends Record> CoreTags(Table<O> child, ForeignKey<O, CoreTagsRecord> key) {
        super(child, key, CORE_TAGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_TAGS_TAG_AAI_LOOKUP, Indexes.CORE_TAGS_TAG_AAP_LOOKUP, Indexes.CORE_TAGS_TAG_ADDED, Indexes.CORE_TAGS_TAG_APP, Indexes.CORE_TAGS_TAG_MEMBER_ID, Indexes.CORE_TAGS_TAG_TEXT);
    }

    @Override
    public Identity<CoreTagsRecord, Long> getIdentity() {
        return (Identity<CoreTagsRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreTagsRecord> getPrimaryKey() {
        return Keys.KEY_CORE_TAGS_PRIMARY;
    }

    @Override
    public CoreTags as(String alias) {
        return new CoreTags(DSL.name(alias), this);
    }

    @Override
    public CoreTags as(Name alias) {
        return new CoreTags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreTags rename(String name) {
        return new CoreTags(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreTags rename(Name name) {
        return new CoreTags(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, String, String, Integer, Integer, Long, Integer, Integer, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
