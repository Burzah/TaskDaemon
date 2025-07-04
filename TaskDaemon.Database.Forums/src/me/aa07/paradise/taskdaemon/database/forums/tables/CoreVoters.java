/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Indexes;
import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreVotersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class CoreVoters extends TableImpl<CoreVotersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>paradise_forums.core_voters</code>
     */
    public static final CoreVoters CORE_VOTERS = new CoreVoters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreVotersRecord> getRecordType() {
        return CoreVotersRecord.class;
    }

    /**
     * The column <code>paradise_forums.core_voters.vid</code>.
     */
    public final TableField<CoreVotersRecord, Integer> VID = createField(DSL.name("vid"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>paradise_forums.core_voters.vote_date</code>.
     */
    public final TableField<CoreVotersRecord, Integer> VOTE_DATE = createField(DSL.name("vote_date"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.core_voters.tid</code>.
     */
    public final TableField<CoreVotersRecord, Integer> TID = createField(DSL.name("tid"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.core_voters.member_id</code>.
     */
    public final TableField<CoreVotersRecord, ULong> MEMBER_ID = createField(DSL.name("member_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.core_voters.forum_id</code>.
     */
    public final TableField<CoreVotersRecord, Short> FORUM_ID = createField(DSL.name("forum_id"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>paradise_forums.core_voters.member_choices</code>.
     */
    public final TableField<CoreVotersRecord, String> MEMBER_CHOICES = createField(DSL.name("member_choices"), SQLDataType.CLOB.defaultValue(DSL.inline("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>paradise_forums.core_voters.ip_address</code>.
     */
    public final TableField<CoreVotersRecord, String> IP_ADDRESS = createField(DSL.name("ip_address"), SQLDataType.VARCHAR(46).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.core_voters.poll</code>. The poll ID
     */
    public final TableField<CoreVotersRecord, UInteger> POLL = createField(DSL.name("poll"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "The poll ID");

    private CoreVoters(Name alias, Table<CoreVotersRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreVoters(Name alias, Table<CoreVotersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.core_voters</code> table
     * reference
     */
    public CoreVoters(String alias) {
        this(DSL.name(alias), CORE_VOTERS);
    }

    /**
     * Create an aliased <code>paradise_forums.core_voters</code> table
     * reference
     */
    public CoreVoters(Name alias) {
        this(alias, CORE_VOTERS);
    }

    /**
     * Create a <code>paradise_forums.core_voters</code> table reference
     */
    public CoreVoters() {
        this(DSL.name("core_voters"), null);
    }

    public <O extends Record> CoreVoters(Table<O> child, ForeignKey<O, CoreVotersRecord> key) {
        super(child, key, CORE_VOTERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_VOTERS_IP_ADDRESS, Indexes.CORE_VOTERS_MEMBER, Indexes.CORE_VOTERS_POLL);
    }

    @Override
    public Identity<CoreVotersRecord, Integer> getIdentity() {
        return (Identity<CoreVotersRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreVotersRecord> getPrimaryKey() {
        return Keys.KEY_CORE_VOTERS_PRIMARY;
    }

    @Override
    public CoreVoters as(String alias) {
        return new CoreVoters(DSL.name(alias), this);
    }

    @Override
    public CoreVoters as(Name alias) {
        return new CoreVoters(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreVoters rename(String name) {
        return new CoreVoters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreVoters rename(Name name) {
        return new CoreVoters(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, ULong, Short, String, String, UInteger> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
