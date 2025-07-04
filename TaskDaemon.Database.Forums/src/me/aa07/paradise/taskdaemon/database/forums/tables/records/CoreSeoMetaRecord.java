/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables.records;


import me.aa07.paradise.taskdaemon.database.forums.tables.CoreSeoMeta;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreSeoMetaRecord extends UpdatableRecordImpl<CoreSeoMetaRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_forums.core_seo_meta.meta_id</code>.
     */
    public void setMetaId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_forums.core_seo_meta.meta_id</code>.
     */
    public Integer getMetaId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>paradise_forums.core_seo_meta.meta_url</code>.
     */
    public void setMetaUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>paradise_forums.core_seo_meta.meta_url</code>.
     */
    public String getMetaUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>paradise_forums.core_seo_meta.meta_tags</code>.
     */
    public void setMetaTags(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>paradise_forums.core_seo_meta.meta_tags</code>.
     */
    public String getMetaTags() {
        return (String) get(2);
    }

    /**
     * Setter for <code>paradise_forums.core_seo_meta.meta_title</code>.
     */
    public void setMetaTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>paradise_forums.core_seo_meta.meta_title</code>.
     */
    public String getMetaTitle() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return CoreSeoMeta.CORE_SEO_META.META_ID;
    }

    @Override
    public Field<String> field2() {
        return CoreSeoMeta.CORE_SEO_META.META_URL;
    }

    @Override
    public Field<String> field3() {
        return CoreSeoMeta.CORE_SEO_META.META_TAGS;
    }

    @Override
    public Field<String> field4() {
        return CoreSeoMeta.CORE_SEO_META.META_TITLE;
    }

    @Override
    public Integer component1() {
        return getMetaId();
    }

    @Override
    public String component2() {
        return getMetaUrl();
    }

    @Override
    public String component3() {
        return getMetaTags();
    }

    @Override
    public String component4() {
        return getMetaTitle();
    }

    @Override
    public Integer value1() {
        return getMetaId();
    }

    @Override
    public String value2() {
        return getMetaUrl();
    }

    @Override
    public String value3() {
        return getMetaTags();
    }

    @Override
    public String value4() {
        return getMetaTitle();
    }

    @Override
    public CoreSeoMetaRecord value1(Integer value) {
        setMetaId(value);
        return this;
    }

    @Override
    public CoreSeoMetaRecord value2(String value) {
        setMetaUrl(value);
        return this;
    }

    @Override
    public CoreSeoMetaRecord value3(String value) {
        setMetaTags(value);
        return this;
    }

    @Override
    public CoreSeoMetaRecord value4(String value) {
        setMetaTitle(value);
        return this;
    }

    @Override
    public CoreSeoMetaRecord values(Integer value1, String value2, String value3, String value4) {
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
     * Create a detached CoreSeoMetaRecord
     */
    public CoreSeoMetaRecord() {
        super(CoreSeoMeta.CORE_SEO_META);
    }

    /**
     * Create a detached, initialised CoreSeoMetaRecord
     */
    public CoreSeoMetaRecord(Integer metaId, String metaUrl, String metaTags, String metaTitle) {
        super(CoreSeoMeta.CORE_SEO_META);

        setMetaId(metaId);
        setMetaUrl(metaUrl);
        setMetaTags(metaTags);
        setMetaTitle(metaTitle);
    }
}
