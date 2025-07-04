/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.gamedb.tables.records;


import me.aa07.paradise.taskdaemon.database.gamedb.tables.Library;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LibraryRecord extends UpdatableRecordImpl<LibraryRecord> implements Record12<Integer, String, String, String, String, String, String, Double, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_gamedb.library.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>paradise_gamedb.library.author</code>.
     */
    public void setAuthor(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.author</code>.
     */
    public String getAuthor() {
        return (String) get(1);
    }

    /**
     * Setter for <code>paradise_gamedb.library.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>paradise_gamedb.library.content</code>.
     */
    public void setContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.content</code>.
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>paradise_gamedb.library.ckey</code>.
     */
    public void setCkey(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.ckey</code>.
     */
    public String getCkey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>paradise_gamedb.library.reports</code>.
     */
    public void setReports(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.reports</code>.
     */
    public String getReports() {
        return (String) get(5);
    }

    /**
     * Setter for <code>paradise_gamedb.library.summary</code>.
     */
    public void setSummary(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.summary</code>.
     */
    public String getSummary() {
        return (String) get(6);
    }

    /**
     * Setter for <code>paradise_gamedb.library.rating</code>.
     */
    public void setRating(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.rating</code>.
     */
    public Double getRating() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>paradise_gamedb.library.raters</code>.
     */
    public void setRaters(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.raters</code>.
     */
    public String getRaters() {
        return (String) get(8);
    }

    /**
     * Setter for <code>paradise_gamedb.library.primary_category</code>.
     */
    public void setPrimaryCategory(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.primary_category</code>.
     */
    public Integer getPrimaryCategory() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>paradise_gamedb.library.secondary_category</code>.
     */
    public void setSecondaryCategory(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.secondary_category</code>.
     */
    public Integer getSecondaryCategory() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>paradise_gamedb.library.tertiary_category</code>.
     */
    public void setTertiaryCategory(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>paradise_gamedb.library.tertiary_category</code>.
     */
    public Integer getTertiaryCategory() {
        return (Integer) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, String, String, Double, String, Integer, Integer, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, String, String, String, String, Double, String, Integer, Integer, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Library.LIBRARY.ID;
    }

    @Override
    public Field<String> field2() {
        return Library.LIBRARY.AUTHOR;
    }

    @Override
    public Field<String> field3() {
        return Library.LIBRARY.TITLE;
    }

    @Override
    public Field<String> field4() {
        return Library.LIBRARY.CONTENT;
    }

    @Override
    public Field<String> field5() {
        return Library.LIBRARY.CKEY;
    }

    @Override
    public Field<String> field6() {
        return Library.LIBRARY.REPORTS;
    }

    @Override
    public Field<String> field7() {
        return Library.LIBRARY.SUMMARY;
    }

    @Override
    public Field<Double> field8() {
        return Library.LIBRARY.RATING;
    }

    @Override
    public Field<String> field9() {
        return Library.LIBRARY.RATERS;
    }

    @Override
    public Field<Integer> field10() {
        return Library.LIBRARY.PRIMARY_CATEGORY;
    }

    @Override
    public Field<Integer> field11() {
        return Library.LIBRARY.SECONDARY_CATEGORY;
    }

    @Override
    public Field<Integer> field12() {
        return Library.LIBRARY.TERTIARY_CATEGORY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAuthor();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public String component4() {
        return getContent();
    }

    @Override
    public String component5() {
        return getCkey();
    }

    @Override
    public String component6() {
        return getReports();
    }

    @Override
    public String component7() {
        return getSummary();
    }

    @Override
    public Double component8() {
        return getRating();
    }

    @Override
    public String component9() {
        return getRaters();
    }

    @Override
    public Integer component10() {
        return getPrimaryCategory();
    }

    @Override
    public Integer component11() {
        return getSecondaryCategory();
    }

    @Override
    public Integer component12() {
        return getTertiaryCategory();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAuthor();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public String value4() {
        return getContent();
    }

    @Override
    public String value5() {
        return getCkey();
    }

    @Override
    public String value6() {
        return getReports();
    }

    @Override
    public String value7() {
        return getSummary();
    }

    @Override
    public Double value8() {
        return getRating();
    }

    @Override
    public String value9() {
        return getRaters();
    }

    @Override
    public Integer value10() {
        return getPrimaryCategory();
    }

    @Override
    public Integer value11() {
        return getSecondaryCategory();
    }

    @Override
    public Integer value12() {
        return getTertiaryCategory();
    }

    @Override
    public LibraryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public LibraryRecord value2(String value) {
        setAuthor(value);
        return this;
    }

    @Override
    public LibraryRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public LibraryRecord value4(String value) {
        setContent(value);
        return this;
    }

    @Override
    public LibraryRecord value5(String value) {
        setCkey(value);
        return this;
    }

    @Override
    public LibraryRecord value6(String value) {
        setReports(value);
        return this;
    }

    @Override
    public LibraryRecord value7(String value) {
        setSummary(value);
        return this;
    }

    @Override
    public LibraryRecord value8(Double value) {
        setRating(value);
        return this;
    }

    @Override
    public LibraryRecord value9(String value) {
        setRaters(value);
        return this;
    }

    @Override
    public LibraryRecord value10(Integer value) {
        setPrimaryCategory(value);
        return this;
    }

    @Override
    public LibraryRecord value11(Integer value) {
        setSecondaryCategory(value);
        return this;
    }

    @Override
    public LibraryRecord value12(Integer value) {
        setTertiaryCategory(value);
        return this;
    }

    @Override
    public LibraryRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, Double value8, String value9, Integer value10, Integer value11, Integer value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LibraryRecord
     */
    public LibraryRecord() {
        super(Library.LIBRARY);
    }

    /**
     * Create a detached, initialised LibraryRecord
     */
    public LibraryRecord(Integer id, String author, String title, String content, String ckey, String reports, String summary, Double rating, String raters, Integer primaryCategory, Integer secondaryCategory, Integer tertiaryCategory) {
        super(Library.LIBRARY);

        setId(id);
        setAuthor(author);
        setTitle(title);
        setContent(content);
        setCkey(ckey);
        setReports(reports);
        setSummary(summary);
        setRating(rating);
        setRaters(raters);
        setPrimaryCategory(primaryCategory);
        setSecondaryCategory(secondaryCategory);
        setTertiaryCategory(tertiaryCategory);
    }
}
