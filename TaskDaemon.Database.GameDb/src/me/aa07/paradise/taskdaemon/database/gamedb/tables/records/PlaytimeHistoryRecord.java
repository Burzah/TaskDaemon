/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.gamedb.tables.records;


import java.time.LocalDate;

import me.aa07.paradise.taskdaemon.database.gamedb.tables.PlaytimeHistory;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Record2;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaytimeHistoryRecord extends UpdatableRecordImpl<PlaytimeHistoryRecord> implements Record14<String, LocalDate, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_gamedb.playtime_history.ckey</code>.
     */
    public void setCkey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.ckey</code>.
     */
    public String getCkey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.date</code>.
     */
    public void setDate(LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_living</code>.
     */
    public void setTimeLiving(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_living</code>.
     */
    public Short getTimeLiving() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_crew</code>.
     */
    public void setTimeCrew(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_crew</code>.
     */
    public Short getTimeCrew() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_special</code>.
     */
    public void setTimeSpecial(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_special</code>.
     */
    public Short getTimeSpecial() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_ghost</code>.
     */
    public void setTimeGhost(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_ghost</code>.
     */
    public Short getTimeGhost() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_command</code>.
     */
    public void setTimeCommand(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_command</code>.
     */
    public Short getTimeCommand() {
        return (Short) get(6);
    }

    /**
     * Setter for
     * <code>paradise_gamedb.playtime_history.time_engineering</code>.
     */
    public void setTimeEngineering(Short value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>paradise_gamedb.playtime_history.time_engineering</code>.
     */
    public Short getTimeEngineering() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_medical</code>.
     */
    public void setTimeMedical(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_medical</code>.
     */
    public Short getTimeMedical() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_science</code>.
     */
    public void setTimeScience(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_science</code>.
     */
    public Short getTimeScience() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_supply</code>.
     */
    public void setTimeSupply(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_supply</code>.
     */
    public Short getTimeSupply() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_security</code>.
     */
    public void setTimeSecurity(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_security</code>.
     */
    public Short getTimeSecurity() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_silicon</code>.
     */
    public void setTimeSilicon(Short value) {
        set(12, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_silicon</code>.
     */
    public Short getTimeSilicon() {
        return (Short) get(12);
    }

    /**
     * Setter for <code>paradise_gamedb.playtime_history.time_service</code>.
     */
    public void setTimeService(Short value) {
        set(13, value);
    }

    /**
     * Getter for <code>paradise_gamedb.playtime_history.time_service</code>.
     */
    public Short getTimeService() {
        return (Short) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, LocalDate> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, LocalDate, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, LocalDate, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short, Short> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PlaytimeHistory.PLAYTIME_HISTORY.CKEY;
    }

    @Override
    public Field<LocalDate> field2() {
        return PlaytimeHistory.PLAYTIME_HISTORY.DATE;
    }

    @Override
    public Field<Short> field3() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_LIVING;
    }

    @Override
    public Field<Short> field4() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_CREW;
    }

    @Override
    public Field<Short> field5() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_SPECIAL;
    }

    @Override
    public Field<Short> field6() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_GHOST;
    }

    @Override
    public Field<Short> field7() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_COMMAND;
    }

    @Override
    public Field<Short> field8() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_ENGINEERING;
    }

    @Override
    public Field<Short> field9() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_MEDICAL;
    }

    @Override
    public Field<Short> field10() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_SCIENCE;
    }

    @Override
    public Field<Short> field11() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_SUPPLY;
    }

    @Override
    public Field<Short> field12() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_SECURITY;
    }

    @Override
    public Field<Short> field13() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_SILICON;
    }

    @Override
    public Field<Short> field14() {
        return PlaytimeHistory.PLAYTIME_HISTORY.TIME_SERVICE;
    }

    @Override
    public String component1() {
        return getCkey();
    }

    @Override
    public LocalDate component2() {
        return getDate();
    }

    @Override
    public Short component3() {
        return getTimeLiving();
    }

    @Override
    public Short component4() {
        return getTimeCrew();
    }

    @Override
    public Short component5() {
        return getTimeSpecial();
    }

    @Override
    public Short component6() {
        return getTimeGhost();
    }

    @Override
    public Short component7() {
        return getTimeCommand();
    }

    @Override
    public Short component8() {
        return getTimeEngineering();
    }

    @Override
    public Short component9() {
        return getTimeMedical();
    }

    @Override
    public Short component10() {
        return getTimeScience();
    }

    @Override
    public Short component11() {
        return getTimeSupply();
    }

    @Override
    public Short component12() {
        return getTimeSecurity();
    }

    @Override
    public Short component13() {
        return getTimeSilicon();
    }

    @Override
    public Short component14() {
        return getTimeService();
    }

    @Override
    public String value1() {
        return getCkey();
    }

    @Override
    public LocalDate value2() {
        return getDate();
    }

    @Override
    public Short value3() {
        return getTimeLiving();
    }

    @Override
    public Short value4() {
        return getTimeCrew();
    }

    @Override
    public Short value5() {
        return getTimeSpecial();
    }

    @Override
    public Short value6() {
        return getTimeGhost();
    }

    @Override
    public Short value7() {
        return getTimeCommand();
    }

    @Override
    public Short value8() {
        return getTimeEngineering();
    }

    @Override
    public Short value9() {
        return getTimeMedical();
    }

    @Override
    public Short value10() {
        return getTimeScience();
    }

    @Override
    public Short value11() {
        return getTimeSupply();
    }

    @Override
    public Short value12() {
        return getTimeSecurity();
    }

    @Override
    public Short value13() {
        return getTimeSilicon();
    }

    @Override
    public Short value14() {
        return getTimeService();
    }

    @Override
    public PlaytimeHistoryRecord value1(String value) {
        setCkey(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value2(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value3(Short value) {
        setTimeLiving(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value4(Short value) {
        setTimeCrew(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value5(Short value) {
        setTimeSpecial(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value6(Short value) {
        setTimeGhost(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value7(Short value) {
        setTimeCommand(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value8(Short value) {
        setTimeEngineering(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value9(Short value) {
        setTimeMedical(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value10(Short value) {
        setTimeScience(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value11(Short value) {
        setTimeSupply(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value12(Short value) {
        setTimeSecurity(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value13(Short value) {
        setTimeSilicon(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord value14(Short value) {
        setTimeService(value);
        return this;
    }

    @Override
    public PlaytimeHistoryRecord values(String value1, LocalDate value2, Short value3, Short value4, Short value5, Short value6, Short value7, Short value8, Short value9, Short value10, Short value11, Short value12, Short value13, Short value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlaytimeHistoryRecord
     */
    public PlaytimeHistoryRecord() {
        super(PlaytimeHistory.PLAYTIME_HISTORY);
    }

    /**
     * Create a detached, initialised PlaytimeHistoryRecord
     */
    public PlaytimeHistoryRecord(String ckey, LocalDate date, Short timeLiving, Short timeCrew, Short timeSpecial, Short timeGhost, Short timeCommand, Short timeEngineering, Short timeMedical, Short timeScience, Short timeSupply, Short timeSecurity, Short timeSilicon, Short timeService) {
        super(PlaytimeHistory.PLAYTIME_HISTORY);

        setCkey(ckey);
        setDate(date);
        setTimeLiving(timeLiving);
        setTimeCrew(timeCrew);
        setTimeSpecial(timeSpecial);
        setTimeGhost(timeGhost);
        setTimeCommand(timeCommand);
        setTimeEngineering(timeEngineering);
        setTimeMedical(timeMedical);
        setTimeScience(timeScience);
        setTimeSupply(timeSupply);
        setTimeSecurity(timeSecurity);
        setTimeSilicon(timeSilicon);
        setTimeService(timeService);
    }
}
