/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables.records;


import me.aa07.paradise.taskdaemon.database.forums.tables.CoreEmailTemplates;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreEmailTemplatesRecord extends UpdatableRecordImpl<CoreEmailTemplatesRecord> implements Record10<ULong, String, String, String, Long, String, String, String, Boolean, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_forums.core_email_templates.template_id</code>.
     * ID Number
     */
    public void setTemplateId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_forums.core_email_templates.template_id</code>.
     * ID Number
     */
    public ULong getTemplateId() {
        return (ULong) get(0);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_app</code>.
     */
    public void setTemplateApp(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_app</code>.
     */
    public String getTemplateApp() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_name</code>.
     */
    public void setTemplateName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_name</code>.
     */
    public String getTemplateName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_content_html</code>.
     */
    public void setTemplateContentHtml(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_content_html</code>.
     */
    public String getTemplateContentHtml() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_parent</code>. This
     * column holds the template_id of the original un-edited version of the
     * template
     */
    public void setTemplateParent(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_parent</code>. This
     * column holds the template_id of the original un-edited version of the
     * template
     */
    public Long getTemplateParent() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_data</code>.
     */
    public void setTemplateData(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_data</code>.
     */
    public String getTemplateData() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_key</code>.
     */
    public void setTemplateKey(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_key</code>.
     */
    public String getTemplateKey() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_content_plaintext</code>.
     */
    public void setTemplateContentPlaintext(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_content_plaintext</code>.
     */
    public String getTemplateContentPlaintext() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_edited</code>. Flag
     * to indicate if there is a customized version of the template
     */
    public void setTemplateEdited(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_edited</code>. Flag
     * to indicate if there is a customized version of the template
     */
    public Boolean getTemplateEdited() {
        return (Boolean) get(8);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_email_templates.template_pinned</code>.
     */
    public void setTemplatePinned(Byte value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_email_templates.template_pinned</code>.
     */
    public Byte getTemplatePinned() {
        return (Byte) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, String, String, String, Long, String, String, String, Boolean, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<ULong, String, String, String, Long, String, String, String, Boolean, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_ID;
    }

    @Override
    public Field<String> field2() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_APP;
    }

    @Override
    public Field<String> field3() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_NAME;
    }

    @Override
    public Field<String> field4() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_CONTENT_HTML;
    }

    @Override
    public Field<Long> field5() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_PARENT;
    }

    @Override
    public Field<String> field6() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_DATA;
    }

    @Override
    public Field<String> field7() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_KEY;
    }

    @Override
    public Field<String> field8() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_CONTENT_PLAINTEXT;
    }

    @Override
    public Field<Boolean> field9() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_EDITED;
    }

    @Override
    public Field<Byte> field10() {
        return CoreEmailTemplates.CORE_EMAIL_TEMPLATES.TEMPLATE_PINNED;
    }

    @Override
    public ULong component1() {
        return getTemplateId();
    }

    @Override
    public String component2() {
        return getTemplateApp();
    }

    @Override
    public String component3() {
        return getTemplateName();
    }

    @Override
    public String component4() {
        return getTemplateContentHtml();
    }

    @Override
    public Long component5() {
        return getTemplateParent();
    }

    @Override
    public String component6() {
        return getTemplateData();
    }

    @Override
    public String component7() {
        return getTemplateKey();
    }

    @Override
    public String component8() {
        return getTemplateContentPlaintext();
    }

    @Override
    public Boolean component9() {
        return getTemplateEdited();
    }

    @Override
    public Byte component10() {
        return getTemplatePinned();
    }

    @Override
    public ULong value1() {
        return getTemplateId();
    }

    @Override
    public String value2() {
        return getTemplateApp();
    }

    @Override
    public String value3() {
        return getTemplateName();
    }

    @Override
    public String value4() {
        return getTemplateContentHtml();
    }

    @Override
    public Long value5() {
        return getTemplateParent();
    }

    @Override
    public String value6() {
        return getTemplateData();
    }

    @Override
    public String value7() {
        return getTemplateKey();
    }

    @Override
    public String value8() {
        return getTemplateContentPlaintext();
    }

    @Override
    public Boolean value9() {
        return getTemplateEdited();
    }

    @Override
    public Byte value10() {
        return getTemplatePinned();
    }

    @Override
    public CoreEmailTemplatesRecord value1(ULong value) {
        setTemplateId(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value2(String value) {
        setTemplateApp(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value3(String value) {
        setTemplateName(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value4(String value) {
        setTemplateContentHtml(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value5(Long value) {
        setTemplateParent(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value6(String value) {
        setTemplateData(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value7(String value) {
        setTemplateKey(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value8(String value) {
        setTemplateContentPlaintext(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value9(Boolean value) {
        setTemplateEdited(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord value10(Byte value) {
        setTemplatePinned(value);
        return this;
    }

    @Override
    public CoreEmailTemplatesRecord values(ULong value1, String value2, String value3, String value4, Long value5, String value6, String value7, String value8, Boolean value9, Byte value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreEmailTemplatesRecord
     */
    public CoreEmailTemplatesRecord() {
        super(CoreEmailTemplates.CORE_EMAIL_TEMPLATES);
    }

    /**
     * Create a detached, initialised CoreEmailTemplatesRecord
     */
    public CoreEmailTemplatesRecord(ULong templateId, String templateApp, String templateName, String templateContentHtml, Long templateParent, String templateData, String templateKey, String templateContentPlaintext, Boolean templateEdited, Byte templatePinned) {
        super(CoreEmailTemplates.CORE_EMAIL_TEMPLATES);

        setTemplateId(templateId);
        setTemplateApp(templateApp);
        setTemplateName(templateName);
        setTemplateContentHtml(templateContentHtml);
        setTemplateParent(templateParent);
        setTemplateData(templateData);
        setTemplateKey(templateKey);
        setTemplateContentPlaintext(templateContentPlaintext);
        setTemplateEdited(templateEdited);
        setTemplatePinned(templatePinned);
    }
}
