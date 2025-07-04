/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Indexes;
import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.CoreAcpNotifcationsDismissalsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreAcpNotifcationsDismissals extends TableImpl<CoreAcpNotifcationsDismissalsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>paradise_forums.core_acp_notifcations_dismissals</code>
     */
    public static final CoreAcpNotifcationsDismissals CORE_ACP_NOTIFCATIONS_DISMISSALS = new CoreAcpNotifcationsDismissals();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreAcpNotifcationsDismissalsRecord> getRecordType() {
        return CoreAcpNotifcationsDismissalsRecord.class;
    }

    /**
     * The column
     * <code>paradise_forums.core_acp_notifcations_dismissals.notification</code>.
     * Notification ID Number
     */
    public final TableField<CoreAcpNotifcationsDismissalsRecord, ULong> NOTIFICATION = createField(DSL.name("notification"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Notification ID Number");

    /**
     * The column
     * <code>paradise_forums.core_acp_notifcations_dismissals.member</code>.
     * Member ID Number
     */
    public final TableField<CoreAcpNotifcationsDismissalsRecord, ULong> MEMBER = createField(DSL.name("member"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Member ID Number");

    /**
     * The column
     * <code>paradise_forums.core_acp_notifcations_dismissals.time</code>. Unix
     * timestamp of when the notification was dismissed
     */
    public final TableField<CoreAcpNotifcationsDismissalsRecord, UInteger> TIME = createField(DSL.name("time"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Unix timestamp of when the notification was dismissed");

    private CoreAcpNotifcationsDismissals(Name alias, Table<CoreAcpNotifcationsDismissalsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreAcpNotifcationsDismissals(Name alias, Table<CoreAcpNotifcationsDismissalsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>paradise_forums.core_acp_notifcations_dismissals</code> table
     * reference
     */
    public CoreAcpNotifcationsDismissals(String alias) {
        this(DSL.name(alias), CORE_ACP_NOTIFCATIONS_DISMISSALS);
    }

    /**
     * Create an aliased
     * <code>paradise_forums.core_acp_notifcations_dismissals</code> table
     * reference
     */
    public CoreAcpNotifcationsDismissals(Name alias) {
        this(alias, CORE_ACP_NOTIFCATIONS_DISMISSALS);
    }

    /**
     * Create a <code>paradise_forums.core_acp_notifcations_dismissals</code>
     * table reference
     */
    public CoreAcpNotifcationsDismissals() {
        this(DSL.name("core_acp_notifcations_dismissals"), null);
    }

    public <O extends Record> CoreAcpNotifcationsDismissals(Table<O> child, ForeignKey<O, CoreAcpNotifcationsDismissalsRecord> key) {
        super(child, key, CORE_ACP_NOTIFCATIONS_DISMISSALS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_ACP_NOTIFCATIONS_DISMISSALS_MEMBER);
    }

    @Override
    public UniqueKey<CoreAcpNotifcationsDismissalsRecord> getPrimaryKey() {
        return Keys.KEY_CORE_ACP_NOTIFCATIONS_DISMISSALS_PRIMARY;
    }

    @Override
    public CoreAcpNotifcationsDismissals as(String alias) {
        return new CoreAcpNotifcationsDismissals(DSL.name(alias), this);
    }

    @Override
    public CoreAcpNotifcationsDismissals as(Name alias) {
        return new CoreAcpNotifcationsDismissals(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAcpNotifcationsDismissals rename(String name) {
        return new CoreAcpNotifcationsDismissals(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAcpNotifcationsDismissals rename(Name name) {
        return new CoreAcpNotifcationsDismissals(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, ULong, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
