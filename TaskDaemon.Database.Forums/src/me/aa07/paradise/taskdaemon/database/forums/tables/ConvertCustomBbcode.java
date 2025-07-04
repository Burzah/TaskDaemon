/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.ConvertCustomBbcodeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row21;
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
public class ConvertCustomBbcode extends TableImpl<ConvertCustomBbcodeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>paradise_forums.convert_custom_bbcode</code>
     */
    public static final ConvertCustomBbcode CONVERT_CUSTOM_BBCODE = new ConvertCustomBbcode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConvertCustomBbcodeRecord> getRecordType() {
        return ConvertCustomBbcodeRecord.class;
    }

    /**
     * The column <code>paradise_forums.convert_custom_bbcode.bbcode_id</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, Integer> BBCODE_ID = createField(DSL.name("bbcode_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_title</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_TITLE = createField(DSL.name("bbcode_title"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_desc</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_DESC = createField(DSL.name("bbcode_desc"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>paradise_forums.convert_custom_bbcode.bbcode_tag</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_TAG = createField(DSL.name("bbcode_tag"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_replace</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_REPLACE = createField(DSL.name("bbcode_replace"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_useoption</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, Byte> BBCODE_USEOPTION = createField(DSL.name("bbcode_useoption"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_example</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_EXAMPLE = createField(DSL.name("bbcode_example"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_switch_option</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, Integer> BBCODE_SWITCH_OPTION = createField(DSL.name("bbcode_switch_option"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_menu_option_text</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_MENU_OPTION_TEXT = createField(DSL.name("bbcode_menu_option_text"), SQLDataType.VARCHAR(200).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_menu_content_text</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_MENU_CONTENT_TEXT = createField(DSL.name("bbcode_menu_content_text"), SQLDataType.VARCHAR(200).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_single_tag</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, Byte> BBCODE_SINGLE_TAG = createField(DSL.name("bbcode_single_tag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_groups</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_GROUPS = createField(DSL.name("bbcode_groups"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_sections</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_SECTIONS = createField(DSL.name("bbcode_sections"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_php_plugin</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_PHP_PLUGIN = createField(DSL.name("bbcode_php_plugin"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_no_parsing</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, Byte> BBCODE_NO_PARSING = createField(DSL.name("bbcode_no_parsing"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_protected</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, Byte> BBCODE_PROTECTED = createField(DSL.name("bbcode_protected"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_aliases</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_ALIASES = createField(DSL.name("bbcode_aliases"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_optional_option</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, Byte> BBCODE_OPTIONAL_OPTION = createField(DSL.name("bbcode_optional_option"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_image</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_IMAGE = createField(DSL.name("bbcode_image"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.convert_custom_bbcode.bbcode_app</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_APP = createField(DSL.name("bbcode_app"), SQLDataType.VARCHAR(50).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>paradise_forums.convert_custom_bbcode.bbcode_custom_regex</code>.
     */
    public final TableField<ConvertCustomBbcodeRecord, String> BBCODE_CUSTOM_REGEX = createField(DSL.name("bbcode_custom_regex"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    private ConvertCustomBbcode(Name alias, Table<ConvertCustomBbcodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConvertCustomBbcode(Name alias, Table<ConvertCustomBbcodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.convert_custom_bbcode</code>
     * table reference
     */
    public ConvertCustomBbcode(String alias) {
        this(DSL.name(alias), CONVERT_CUSTOM_BBCODE);
    }

    /**
     * Create an aliased <code>paradise_forums.convert_custom_bbcode</code>
     * table reference
     */
    public ConvertCustomBbcode(Name alias) {
        this(alias, CONVERT_CUSTOM_BBCODE);
    }

    /**
     * Create a <code>paradise_forums.convert_custom_bbcode</code> table
     * reference
     */
    public ConvertCustomBbcode() {
        this(DSL.name("convert_custom_bbcode"), null);
    }

    public <O extends Record> ConvertCustomBbcode(Table<O> child, ForeignKey<O, ConvertCustomBbcodeRecord> key) {
        super(child, key, CONVERT_CUSTOM_BBCODE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public Identity<ConvertCustomBbcodeRecord, Integer> getIdentity() {
        return (Identity<ConvertCustomBbcodeRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ConvertCustomBbcodeRecord> getPrimaryKey() {
        return Keys.KEY_CONVERT_CUSTOM_BBCODE_PRIMARY;
    }

    @Override
    public ConvertCustomBbcode as(String alias) {
        return new ConvertCustomBbcode(DSL.name(alias), this);
    }

    @Override
    public ConvertCustomBbcode as(Name alias) {
        return new ConvertCustomBbcode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConvertCustomBbcode rename(String name) {
        return new ConvertCustomBbcode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConvertCustomBbcode rename(Name name) {
        return new ConvertCustomBbcode(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<Integer, String, String, String, String, Byte, String, Integer, String, String, Byte, String, String, String, Byte, Byte, String, Byte, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
