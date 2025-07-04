/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * If this attachment has been flagged for moderation by the image scanner, the
 * status of that
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum CoreAttachmentsAttachModerationStatus implements EnumType {

    skipped("skipped"),

    approved("approved"),

    pending("pending");

    private final String literal;

    private CoreAttachmentsAttachModerationStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "core_attachments_attach_moderation_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
