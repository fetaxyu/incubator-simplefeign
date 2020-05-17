/*
 * This file is generated by jOOQ.
 */
package io.hikari.jooq.domain;


import io.hikari.jooq.domain.tables.OauthAccessToken;
import io.hikari.jooq.domain.tables.OauthApprovals;
import io.hikari.jooq.domain.tables.OauthClientDetails;
import io.hikari.jooq.domain.tables.OauthClientToken;
import io.hikari.jooq.domain.tables.OauthCode;
import io.hikari.jooq.domain.tables.OauthRefreshToken;
import io.hikari.jooq.domain.tables.SysRole;
import io.hikari.jooq.domain.tables.SysUser;
import io.hikari.jooq.domain.tables.SysUserRole;
import io.hikari.jooq.domain.tables.TbStockBasics;


/**
 * Convenience access to all tables in hikari
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>hikari.oauth_access_token</code>.
     */
    public static final OauthAccessToken OAUTH_ACCESS_TOKEN = io.hikari.jooq.domain.tables.OauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>hikari.oauth_approvals</code>.
     */
    public static final OauthApprovals OAUTH_APPROVALS = io.hikari.jooq.domain.tables.OauthApprovals.OAUTH_APPROVALS;

    /**
     * The table <code>hikari.oauth_client_details</code>.
     */
    public static final OauthClientDetails OAUTH_CLIENT_DETAILS = io.hikari.jooq.domain.tables.OauthClientDetails.OAUTH_CLIENT_DETAILS;

    /**
     * The table <code>hikari.oauth_client_token</code>.
     */
    public static final OauthClientToken OAUTH_CLIENT_TOKEN = io.hikari.jooq.domain.tables.OauthClientToken.OAUTH_CLIENT_TOKEN;

    /**
     * The table <code>hikari.oauth_code</code>.
     */
    public static final OauthCode OAUTH_CODE = io.hikari.jooq.domain.tables.OauthCode.OAUTH_CODE;

    /**
     * The table <code>hikari.oauth_refresh_token</code>.
     */
    public static final OauthRefreshToken OAUTH_REFRESH_TOKEN = io.hikari.jooq.domain.tables.OauthRefreshToken.OAUTH_REFRESH_TOKEN;

    /**
     * The table <code>hikari.sys_role</code>.
     */
    public static final SysRole SYS_ROLE = io.hikari.jooq.domain.tables.SysRole.SYS_ROLE;

    /**
     * The table <code>hikari.sys_user</code>.
     */
    public static final SysUser SYS_USER = io.hikari.jooq.domain.tables.SysUser.SYS_USER;

    /**
     * The table <code>hikari.sys_user_role</code>.
     */
    public static final SysUserRole SYS_USER_ROLE = io.hikari.jooq.domain.tables.SysUserRole.SYS_USER_ROLE;

    /**
     * The table <code>hikari.tb_stock_basics</code>.
     */
    public static final TbStockBasics TB_STOCK_BASICS = io.hikari.jooq.domain.tables.TbStockBasics.TB_STOCK_BASICS;
}
