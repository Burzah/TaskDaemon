/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables.records;


import me.aa07.paradise.taskdaemon.database.forums.tables.CoreThemes;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreThemesRecord extends UpdatableRecordImpl<CoreThemesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_forums.core_themes.set_id</code>.
     */
    public void setSetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_id</code>.
     */
    public Integer getSetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_name</code>.
     */
    public void setSetName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_name</code>.
     */
    public String getSetName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_key</code>.
     */
    public void setSetKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_key</code>.
     */
    public String getSetKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_parent_id</code>.
     */
    public void setSetParentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_parent_id</code>.
     */
    public Integer getSetParentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_parent_array</code>.
     */
    public void setSetParentArray(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_parent_array</code>.
     */
    public String getSetParentArray() {
        return (String) get(4);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_child_array</code>.
     */
    public void setSetChildArray(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_child_array</code>.
     */
    public String getSetChildArray() {
        return (String) get(5);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_permissions</code>.
     */
    public void setSetPermissions(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_permissions</code>.
     */
    public String getSetPermissions() {
        return (String) get(6);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_is_default</code>.
     */
    public void setSetIsDefault(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_is_default</code>.
     */
    public Integer getSetIsDefault() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_author_name</code>.
     */
    public void setSetAuthorName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_author_name</code>.
     */
    public String getSetAuthorName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_author_url</code>.
     */
    public void setSetAuthorUrl(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_author_url</code>.
     */
    public String getSetAuthorUrl() {
        return (String) get(9);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_emo_dir</code>.
     */
    public void setSetEmoDir(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_emo_dir</code>.
     */
    public String getSetEmoDir() {
        return (String) get(10);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_added</code>.
     */
    public void setSetAdded(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_added</code>.
     */
    public Integer getSetAdded() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_updated</code>.
     */
    public void setSetUpdated(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_updated</code>.
     */
    public Integer getSetUpdated() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_hide_from_list</code>.
     */
    public void setSetHideFromList(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_hide_from_list</code>.
     */
    public Integer getSetHideFromList() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_order</code>.
     */
    public void setSetOrder(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_order</code>.
     */
    public Integer getSetOrder() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_by_skin_gen</code>.
     */
    public void setSetBySkinGen(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_by_skin_gen</code>.
     */
    public Integer getSetBySkinGen() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_skin_gen_data</code>.
     */
    public void setSetSkinGenData(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_skin_gen_data</code>.
     */
    public String getSetSkinGenData() {
        return (String) get(16);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_themes.set_template_settings</code>.
     */
    public void setSetTemplateSettings(String value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_themes.set_template_settings</code>.
     */
    public String getSetTemplateSettings() {
        return (String) get(17);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_editor_skin</code>.
     */
    public void setSetEditorSkin(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_editor_skin</code>.
     */
    public String getSetEditorSkin() {
        return (String) get(18);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_logo_data</code>. JSON
     * data of logo url, width, height
     */
    public void setSetLogoData(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_logo_data</code>. JSON
     * data of logo url, width, height
     */
    public String getSetLogoData() {
        return (String) get(19);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_version</code>. Human
     * skin set version
     */
    public void setSetVersion(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_version</code>. Human
     * skin set version
     */
    public String getSetVersion() {
        return (String) get(20);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_long_version</code>.
     * Integer version
     */
    public void setSetLongVersion(UInteger value) {
        set(21, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_long_version</code>.
     * Integer version
     */
    public UInteger getSetLongVersion() {
        return (UInteger) get(21);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_update_check</code>.
     * Remote URL to retrieve update data
     */
    public void setSetUpdateCheck(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_update_check</code>.
     * Remote URL to retrieve update data
     */
    public String getSetUpdateCheck() {
        return (String) get(22);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_themes.set_update_last_check</code>. Unix
     * timestamp of last check
     */
    public void setSetUpdateLastCheck(UInteger value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_themes.set_update_last_check</code>. Unix
     * timestamp of last check
     */
    public UInteger getSetUpdateLastCheck() {
        return (UInteger) get(23);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_update_data</code>. JSON
     * update data retrieved from remote URL.
     */
    public void setSetUpdateData(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_update_data</code>. JSON
     * update data retrieved from remote URL.
     */
    public String getSetUpdateData() {
        return (String) get(24);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_css_map</code>.
     */
    public void setSetCssMap(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_css_map</code>.
     */
    public String getSetCssMap() {
        return (String) get(25);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_resource_map</code>.
     */
    public void setSetResourceMap(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_resource_map</code>.
     */
    public String getSetResourceMap() {
        return (String) get(26);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_cache_key</code>. The
     * current cache key, updated when any template is changed to force disk
     * caches to rebuild
     */
    public void setSetCacheKey(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_cache_key</code>. The
     * current cache key, updated when any template is changed to force disk
     * caches to rebuild
     */
    public String getSetCacheKey() {
        return (String) get(27);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_customized</code>.
     */
    public void setSetCustomized(UInteger value) {
        set(28, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_customized</code>.
     */
    public UInteger getSetCustomized() {
        return (UInteger) get(28);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_css_updated</code>.
     */
    public void setSetCssUpdated(UInteger value) {
        set(29, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_css_updated</code>.
     */
    public UInteger getSetCssUpdated() {
        return (UInteger) get(29);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_custom_header</code>.
     */
    public void setSetCustomHeader(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_custom_header</code>.
     */
    public String getSetCustomHeader() {
        return (String) get(30);
    }

    /**
     * Setter for <code>paradise_forums.core_themes.set_custom_footer</code>.
     */
    public void setSetCustomFooter(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>paradise_forums.core_themes.set_custom_footer</code>.
     */
    public String getSetCustomFooter() {
        return (String) get(31);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreThemesRecord
     */
    public CoreThemesRecord() {
        super(CoreThemes.CORE_THEMES);
    }

    /**
     * Create a detached, initialised CoreThemesRecord
     */
    public CoreThemesRecord(Integer setId, String setName, String setKey, Integer setParentId, String setParentArray, String setChildArray, String setPermissions, Integer setIsDefault, String setAuthorName, String setAuthorUrl, String setEmoDir, Integer setAdded, Integer setUpdated, Integer setHideFromList, Integer setOrder, Integer setBySkinGen, String setSkinGenData, String setTemplateSettings, String setEditorSkin, String setLogoData, String setVersion, UInteger setLongVersion, String setUpdateCheck, UInteger setUpdateLastCheck, String setUpdateData, String setCssMap, String setResourceMap, String setCacheKey, UInteger setCustomized, UInteger setCssUpdated, String setCustomHeader, String setCustomFooter) {
        super(CoreThemes.CORE_THEMES);

        setSetId(setId);
        setSetName(setName);
        setSetKey(setKey);
        setSetParentId(setParentId);
        setSetParentArray(setParentArray);
        setSetChildArray(setChildArray);
        setSetPermissions(setPermissions);
        setSetIsDefault(setIsDefault);
        setSetAuthorName(setAuthorName);
        setSetAuthorUrl(setAuthorUrl);
        setSetEmoDir(setEmoDir);
        setSetAdded(setAdded);
        setSetUpdated(setUpdated);
        setSetHideFromList(setHideFromList);
        setSetOrder(setOrder);
        setSetBySkinGen(setBySkinGen);
        setSetSkinGenData(setSkinGenData);
        setSetTemplateSettings(setTemplateSettings);
        setSetEditorSkin(setEditorSkin);
        setSetLogoData(setLogoData);
        setSetVersion(setVersion);
        setSetLongVersion(setLongVersion);
        setSetUpdateCheck(setUpdateCheck);
        setSetUpdateLastCheck(setUpdateLastCheck);
        setSetUpdateData(setUpdateData);
        setSetCssMap(setCssMap);
        setSetResourceMap(setResourceMap);
        setSetCacheKey(setCacheKey);
        setSetCustomized(setCustomized);
        setSetCssUpdated(setCssUpdated);
        setSetCustomHeader(setCustomHeader);
        setSetCustomFooter(setCustomFooter);
    }
}
