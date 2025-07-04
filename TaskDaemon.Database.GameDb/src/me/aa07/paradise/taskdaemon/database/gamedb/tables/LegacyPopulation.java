/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.gamedb.tables;


import java.time.LocalDateTime;

import me.aa07.paradise.taskdaemon.database.gamedb.Keys;
import me.aa07.paradise.taskdaemon.database.gamedb.ParadiseGamedb;
import me.aa07.paradise.taskdaemon.database.gamedb.tables.records.LegacyPopulationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class LegacyPopulation extends TableImpl<LegacyPopulationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>paradise_gamedb.legacy_population</code>
     */
    public static final LegacyPopulation LEGACY_POPULATION = new LegacyPopulation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LegacyPopulationRecord> getRecordType() {
        return LegacyPopulationRecord.class;
    }

    /**
     * The column <code>paradise_gamedb.legacy_population.id</code>.
     */
    public final TableField<LegacyPopulationRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>paradise_gamedb.legacy_population.playercount</code>.
     */
    public final TableField<LegacyPopulationRecord, Integer> PLAYERCOUNT = createField(DSL.name("playercount"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_gamedb.legacy_population.admincount</code>.
     */
    public final TableField<LegacyPopulationRecord, Integer> ADMINCOUNT = createField(DSL.name("admincount"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_gamedb.legacy_population.server_id</code>.
     */
    public final TableField<LegacyPopulationRecord, String> SERVER_ID = createField(DSL.name("server_id"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_gamedb.legacy_population.time</code>.
     */
    public final TableField<LegacyPopulationRecord, LocalDateTime> TIME = createField(DSL.name("time"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    private LegacyPopulation(Name alias, Table<LegacyPopulationRecord> aliased) {
        this(alias, aliased, null);
    }

    private LegacyPopulation(Name alias, Table<LegacyPopulationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_gamedb.legacy_population</code> table
     * reference
     */
    public LegacyPopulation(String alias) {
        this(DSL.name(alias), LEGACY_POPULATION);
    }

    /**
     * Create an aliased <code>paradise_gamedb.legacy_population</code> table
     * reference
     */
    public LegacyPopulation(Name alias) {
        this(alias, LEGACY_POPULATION);
    }

    /**
     * Create a <code>paradise_gamedb.legacy_population</code> table reference
     */
    public LegacyPopulation() {
        this(DSL.name("legacy_population"), null);
    }

    public <O extends Record> LegacyPopulation(Table<O> child, ForeignKey<O, LegacyPopulationRecord> key) {
        super(child, key, LEGACY_POPULATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseGamedb.PARADISE_GAMEDB;
    }

    @Override
    public Identity<LegacyPopulationRecord, Integer> getIdentity() {
        return (Identity<LegacyPopulationRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LegacyPopulationRecord> getPrimaryKey() {
        return Keys.KEY_LEGACY_POPULATION_PRIMARY;
    }

    @Override
    public LegacyPopulation as(String alias) {
        return new LegacyPopulation(DSL.name(alias), this);
    }

    @Override
    public LegacyPopulation as(Name alias) {
        return new LegacyPopulation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LegacyPopulation rename(String name) {
        return new LegacyPopulation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LegacyPopulation rename(Name name) {
        return new LegacyPopulation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, Integer, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
