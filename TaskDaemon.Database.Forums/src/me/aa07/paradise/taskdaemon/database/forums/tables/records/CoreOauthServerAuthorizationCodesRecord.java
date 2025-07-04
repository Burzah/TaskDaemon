/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables.records;


import me.aa07.paradise.taskdaemon.database.forums.tables.CoreOauthServerAuthorizationCodes;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreOauthServerAuthorizationCodesRecord extends TableRecordImpl<CoreOauthServerAuthorizationCodesRecord> implements Record11<String, ULong, UInteger, String, String, String, UByte, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.client_id</code>.
     * The client ID
     */
    public void setClientId(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.client_id</code>.
     * The client ID
     */
    public String getClientId() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.member_id</code>.
     * The member ID
     */
    public void setMemberId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.member_id</code>.
     * The member ID
     */
    public ULong getMemberId() {
        return (ULong) get(1);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.expires</code>.
     * Unix timestamp of expiration
     */
    public void setExpires(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.expires</code>.
     * Unix timestamp of expiration
     */
    public UInteger getExpires() {
        return (UInteger) get(2);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.code</code>.
     * The authorization code
     */
    public void setCode(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.code</code>.
     * The authorization code
     */
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.scope</code>.
     * JSON-encoded array of scopes or NULL if no scope was requested
     */
    public void setScope(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.scope</code>.
     * JSON-encoded array of scopes or NULL if no scope was requested
     */
    public String getScope() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.redirect_uri</code>.
     * The redirect_uri provided in the request
     */
    public void setRedirectUri(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.redirect_uri</code>.
     * The redirect_uri provided in the request
     */
    public String getRedirectUri() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.used</code>.
     * Boolean value indicating if code has been used
     */
    public void setUsed(UByte value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.used</code>.
     * Boolean value indicating if code has been used
     */
    public UByte getUsed() {
        return (UByte) get(6);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.code_challenge</code>.
     * The PKCE code challenge, if one was provided by the client
     */
    public void setCodeChallenge(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.code_challenge</code>.
     * The PKCE code challenge, if one was provided by the client
     */
    public String getCodeChallenge() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.code_challenge_method</code>.
     * The PKCE code challenge method, if applicable
     */
    public void setCodeChallengeMethod(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.code_challenge_method</code>.
     * The PKCE code challenge method, if applicable
     */
    public String getCodeChallengeMethod() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.user_agent</code>.
     * The user agent that the user performed authentication on, if known
     */
    public void setUserAgent(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.user_agent</code>.
     * The user agent that the user performed authentication on, if known
     */
    public String getUserAgent() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.device_key</code>.
     * The device key of the device used to obtain this authorization code, if
     * known
     */
    public void setDeviceKey(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>paradise_forums.core_oauth_server_authorization_codes.device_key</code>.
     * The device key of the device used to obtain this authorization code, if
     * known
     */
    public String getDeviceKey() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, ULong, UInteger, String, String, String, UByte, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, ULong, UInteger, String, String, String, UByte, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.CLIENT_ID;
    }

    @Override
    public Field<ULong> field2() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.MEMBER_ID;
    }

    @Override
    public Field<UInteger> field3() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.EXPIRES;
    }

    @Override
    public Field<String> field4() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.CODE;
    }

    @Override
    public Field<String> field5() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.SCOPE;
    }

    @Override
    public Field<String> field6() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.REDIRECT_URI;
    }

    @Override
    public Field<UByte> field7() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.USED;
    }

    @Override
    public Field<String> field8() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.CODE_CHALLENGE;
    }

    @Override
    public Field<String> field9() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.CODE_CHALLENGE_METHOD;
    }

    @Override
    public Field<String> field10() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.USER_AGENT;
    }

    @Override
    public Field<String> field11() {
        return CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES.DEVICE_KEY;
    }

    @Override
    public String component1() {
        return getClientId();
    }

    @Override
    public ULong component2() {
        return getMemberId();
    }

    @Override
    public UInteger component3() {
        return getExpires();
    }

    @Override
    public String component4() {
        return getCode();
    }

    @Override
    public String component5() {
        return getScope();
    }

    @Override
    public String component6() {
        return getRedirectUri();
    }

    @Override
    public UByte component7() {
        return getUsed();
    }

    @Override
    public String component8() {
        return getCodeChallenge();
    }

    @Override
    public String component9() {
        return getCodeChallengeMethod();
    }

    @Override
    public String component10() {
        return getUserAgent();
    }

    @Override
    public String component11() {
        return getDeviceKey();
    }

    @Override
    public String value1() {
        return getClientId();
    }

    @Override
    public ULong value2() {
        return getMemberId();
    }

    @Override
    public UInteger value3() {
        return getExpires();
    }

    @Override
    public String value4() {
        return getCode();
    }

    @Override
    public String value5() {
        return getScope();
    }

    @Override
    public String value6() {
        return getRedirectUri();
    }

    @Override
    public UByte value7() {
        return getUsed();
    }

    @Override
    public String value8() {
        return getCodeChallenge();
    }

    @Override
    public String value9() {
        return getCodeChallengeMethod();
    }

    @Override
    public String value10() {
        return getUserAgent();
    }

    @Override
    public String value11() {
        return getDeviceKey();
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value1(String value) {
        setClientId(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value2(ULong value) {
        setMemberId(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value3(UInteger value) {
        setExpires(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value4(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value5(String value) {
        setScope(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value6(String value) {
        setRedirectUri(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value7(UByte value) {
        setUsed(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value8(String value) {
        setCodeChallenge(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value9(String value) {
        setCodeChallengeMethod(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value10(String value) {
        setUserAgent(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord value11(String value) {
        setDeviceKey(value);
        return this;
    }

    @Override
    public CoreOauthServerAuthorizationCodesRecord values(String value1, ULong value2, UInteger value3, String value4, String value5, String value6, UByte value7, String value8, String value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreOauthServerAuthorizationCodesRecord
     */
    public CoreOauthServerAuthorizationCodesRecord() {
        super(CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES);
    }

    /**
     * Create a detached, initialised CoreOauthServerAuthorizationCodesRecord
     */
    public CoreOauthServerAuthorizationCodesRecord(String clientId, ULong memberId, UInteger expires, String code, String scope, String redirectUri, UByte used, String codeChallenge, String codeChallengeMethod, String userAgent, String deviceKey) {
        super(CoreOauthServerAuthorizationCodes.CORE_OAUTH_SERVER_AUTHORIZATION_CODES);

        setClientId(clientId);
        setMemberId(memberId);
        setExpires(expires);
        setCode(code);
        setScope(scope);
        setRedirectUri(redirectUri);
        setUsed(used);
        setCodeChallenge(codeChallenge);
        setCodeChallengeMethod(codeChallengeMethod);
        setUserAgent(userAgent);
        setDeviceKey(deviceKey);
    }
}
