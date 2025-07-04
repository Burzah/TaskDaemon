/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables.records;


import me.aa07.paradise.taskdaemon.database.forums.tables.CoreAchievementsLog;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreAchievementsLogRecord extends UpdatableRecordImpl<CoreAchievementsLogRecord> implements Record4<ULong, UInteger, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_forums.core_achievements_log.id</code>. ID
     * Number
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_forums.core_achievements_log.id</code>. ID
     * Number
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>paradise_forums.core_achievements_log.datetime</code>. A
     * unix timestamp of when this occurred
     */
    public void setDatetime(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>paradise_forums.core_achievements_log.datetime</code>. A
     * unix timestamp of when this occurred
     */
    public UInteger getDatetime() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>paradise_forums.core_achievements_log.identifier</code>.
     * An identifier for the thing the action is being performed on (e.g. if
     * this is for making a post, the post ID)
     */
    public void setIdentifier(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>paradise_forums.core_achievements_log.identifier</code>.
     * An identifier for the thing the action is being performed on (e.g. if
     * this is for making a post, the post ID)
     */
    public String getIdentifier() {
        return (String) get(2);
    }

    /**
     * Setter for <code>paradise_forums.core_achievements_log.action</code>. The
     * action that was performed
     */
    public void setAction(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>paradise_forums.core_achievements_log.action</code>. The
     * action that was performed
     */
    public String getAction() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<ULong, UInteger, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<ULong, UInteger, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return CoreAchievementsLog.CORE_ACHIEVEMENTS_LOG.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return CoreAchievementsLog.CORE_ACHIEVEMENTS_LOG.DATETIME;
    }

    @Override
    public Field<String> field3() {
        return CoreAchievementsLog.CORE_ACHIEVEMENTS_LOG.IDENTIFIER;
    }

    @Override
    public Field<String> field4() {
        return CoreAchievementsLog.CORE_ACHIEVEMENTS_LOG.ACTION;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getDatetime();
    }

    @Override
    public String component3() {
        return getIdentifier();
    }

    @Override
    public String component4() {
        return getAction();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getDatetime();
    }

    @Override
    public String value3() {
        return getIdentifier();
    }

    @Override
    public String value4() {
        return getAction();
    }

    @Override
    public CoreAchievementsLogRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public CoreAchievementsLogRecord value2(UInteger value) {
        setDatetime(value);
        return this;
    }

    @Override
    public CoreAchievementsLogRecord value3(String value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public CoreAchievementsLogRecord value4(String value) {
        setAction(value);
        return this;
    }

    @Override
    public CoreAchievementsLogRecord values(ULong value1, UInteger value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreAchievementsLogRecord
     */
    public CoreAchievementsLogRecord() {
        super(CoreAchievementsLog.CORE_ACHIEVEMENTS_LOG);
    }

    /**
     * Create a detached, initialised CoreAchievementsLogRecord
     */
    public CoreAchievementsLogRecord(ULong id, UInteger datetime, String identifier, String action) {
        super(CoreAchievementsLog.CORE_ACHIEVEMENTS_LOG);

        setId(id);
        setDatetime(datetime);
        setIdentifier(identifier);
        setAction(action);
    }
}
