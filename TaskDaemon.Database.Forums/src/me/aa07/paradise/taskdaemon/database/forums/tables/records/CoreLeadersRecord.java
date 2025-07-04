/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables.records;


import me.aa07.paradise.taskdaemon.database.forums.enums.CoreLeadersLeaderType;
import me.aa07.paradise.taskdaemon.database.forums.tables.CoreLeaders;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreLeadersRecord extends UpdatableRecordImpl<CoreLeadersRecord> implements Record5<ULong, CoreLeadersLeaderType, Long, Integer, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_forums.core_leaders.leader_id</code>. Primary
     * ID
     */
    public void setLeaderId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_forums.core_leaders.leader_id</code>. Primary
     * ID
     */
    public ULong getLeaderId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>paradise_forums.core_leaders.leader_type</code>. Record
     * is for member (m) or group (g)
     */
    public void setLeaderType(CoreLeadersLeaderType value) {
        set(1, value);
    }

    /**
     * Getter for <code>paradise_forums.core_leaders.leader_type</code>. Record
     * is for member (m) or group (g)
     */
    public CoreLeadersLeaderType getLeaderType() {
        return (CoreLeadersLeaderType) get(1);
    }

    /**
     * Setter for <code>paradise_forums.core_leaders.leader_type_id</code>.
     * Member or group ID
     */
    public void setLeaderTypeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>paradise_forums.core_leaders.leader_type_id</code>.
     * Member or group ID
     */
    public Long getLeaderTypeId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>paradise_forums.core_leaders.leader_group_id</code>. The
     * group to display in (core_leaders_group.group_id)
     */
    public void setLeaderGroupId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>paradise_forums.core_leaders.leader_group_id</code>. The
     * group to display in (core_leaders_group.group_id)
     */
    public Integer getLeaderGroupId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>paradise_forums.core_leaders.leader_position</code>.
     * Position
     */
    public void setLeaderPosition(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>paradise_forums.core_leaders.leader_position</code>.
     * Position
     */
    public Long getLeaderPosition() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<ULong, CoreLeadersLeaderType, Long, Integer, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<ULong, CoreLeadersLeaderType, Long, Integer, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return CoreLeaders.CORE_LEADERS.LEADER_ID;
    }

    @Override
    public Field<CoreLeadersLeaderType> field2() {
        return CoreLeaders.CORE_LEADERS.LEADER_TYPE;
    }

    @Override
    public Field<Long> field3() {
        return CoreLeaders.CORE_LEADERS.LEADER_TYPE_ID;
    }

    @Override
    public Field<Integer> field4() {
        return CoreLeaders.CORE_LEADERS.LEADER_GROUP_ID;
    }

    @Override
    public Field<Long> field5() {
        return CoreLeaders.CORE_LEADERS.LEADER_POSITION;
    }

    @Override
    public ULong component1() {
        return getLeaderId();
    }

    @Override
    public CoreLeadersLeaderType component2() {
        return getLeaderType();
    }

    @Override
    public Long component3() {
        return getLeaderTypeId();
    }

    @Override
    public Integer component4() {
        return getLeaderGroupId();
    }

    @Override
    public Long component5() {
        return getLeaderPosition();
    }

    @Override
    public ULong value1() {
        return getLeaderId();
    }

    @Override
    public CoreLeadersLeaderType value2() {
        return getLeaderType();
    }

    @Override
    public Long value3() {
        return getLeaderTypeId();
    }

    @Override
    public Integer value4() {
        return getLeaderGroupId();
    }

    @Override
    public Long value5() {
        return getLeaderPosition();
    }

    @Override
    public CoreLeadersRecord value1(ULong value) {
        setLeaderId(value);
        return this;
    }

    @Override
    public CoreLeadersRecord value2(CoreLeadersLeaderType value) {
        setLeaderType(value);
        return this;
    }

    @Override
    public CoreLeadersRecord value3(Long value) {
        setLeaderTypeId(value);
        return this;
    }

    @Override
    public CoreLeadersRecord value4(Integer value) {
        setLeaderGroupId(value);
        return this;
    }

    @Override
    public CoreLeadersRecord value5(Long value) {
        setLeaderPosition(value);
        return this;
    }

    @Override
    public CoreLeadersRecord values(ULong value1, CoreLeadersLeaderType value2, Long value3, Integer value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreLeadersRecord
     */
    public CoreLeadersRecord() {
        super(CoreLeaders.CORE_LEADERS);
    }

    /**
     * Create a detached, initialised CoreLeadersRecord
     */
    public CoreLeadersRecord(ULong leaderId, CoreLeadersLeaderType leaderType, Long leaderTypeId, Integer leaderGroupId, Long leaderPosition) {
        super(CoreLeaders.CORE_LEADERS);

        setLeaderId(leaderId);
        setLeaderType(leaderType);
        setLeaderTypeId(leaderTypeId);
        setLeaderGroupId(leaderGroupId);
        setLeaderPosition(leaderPosition);
    }
}
