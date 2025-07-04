/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * A hint for how to display the form (NULL is generic custom)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum CoreOauthClientsOauthType implements EnumType {

    invision("invision"),

    wordpress("wordpress"),

    mobile("mobile");

    private final String literal;

    private CoreOauthClientsOauthType(String literal) {
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
        return "core_oauth_clients_oauth_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
