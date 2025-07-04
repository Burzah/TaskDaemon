/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables;


import java.util.Arrays;
import java.util.List;

import me.aa07.paradise.taskdaemon.database.forums.Indexes;
import me.aa07.paradise.taskdaemon.database.forums.Keys;
import me.aa07.paradise.taskdaemon.database.forums.ParadiseForums;
import me.aa07.paradise.taskdaemon.database.forums.tables.records.ForumsTopicsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForumsTopics extends TableImpl<ForumsTopicsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>paradise_forums.forums_topics</code>
     */
    public static final ForumsTopics FORUMS_TOPICS = new ForumsTopics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForumsTopicsRecord> getRecordType() {
        return ForumsTopicsRecord.class;
    }

    /**
     * The column <code>paradise_forums.forums_topics.tid</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> TID = createField(DSL.name("tid"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.title</code>.
     */
    public final TableField<ForumsTopicsRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.state</code>.
     */
    public final TableField<ForumsTopicsRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(8).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.posts</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> POSTS = createField(DSL.name("posts"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.starter_id</code>.
     */
    public final TableField<ForumsTopicsRecord, ULong> STARTER_ID = createField(DSL.name("starter_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.start_date</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> START_DATE = createField(DSL.name("start_date"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.last_poster_id</code>.
     */
    public final TableField<ForumsTopicsRecord, ULong> LAST_POSTER_ID = createField(DSL.name("last_poster_id"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.last_post</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> LAST_POST = createField(DSL.name("last_post"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.starter_name</code>.
     */
    public final TableField<ForumsTopicsRecord, String> STARTER_NAME = createField(DSL.name("starter_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.last_poster_name</code>.
     */
    public final TableField<ForumsTopicsRecord, String> LAST_POSTER_NAME = createField(DSL.name("last_poster_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.poll_state</code>.
     */
    public final TableField<ForumsTopicsRecord, String> POLL_STATE = createField(DSL.name("poll_state"), SQLDataType.VARCHAR(8).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.last_vote</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> LAST_VOTE = createField(DSL.name("last_vote"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.views</code>.
     */
    public final TableField<ForumsTopicsRecord, UInteger> VIEWS = createField(DSL.name("views"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.forum_id</code>.
     */
    public final TableField<ForumsTopicsRecord, Short> FORUM_ID = createField(DSL.name("forum_id"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.approved</code>.
     */
    public final TableField<ForumsTopicsRecord, Byte> APPROVED = createField(DSL.name("approved"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.author_mode</code>.
     */
    public final TableField<ForumsTopicsRecord, Byte> AUTHOR_MODE = createField(DSL.name("author_mode"), SQLDataType.TINYINT.defaultValue(DSL.inline("NULL", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.pinned</code>.
     */
    public final TableField<ForumsTopicsRecord, Byte> PINNED = createField(DSL.name("pinned"), SQLDataType.TINYINT.defaultValue(DSL.inline("NULL", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.moved_to</code>.
     */
    public final TableField<ForumsTopicsRecord, String> MOVED_TO = createField(DSL.name("moved_to"), SQLDataType.VARCHAR(64).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_firstpost</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> TOPIC_FIRSTPOST = createField(DSL.name("topic_firstpost"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_queuedposts</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> TOPIC_QUEUEDPOSTS = createField(DSL.name("topic_queuedposts"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_open_time</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> TOPIC_OPEN_TIME = createField(DSL.name("topic_open_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_close_time</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> TOPIC_CLOSE_TIME = createField(DSL.name("topic_close_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_rating_total</code>.
     */
    public final TableField<ForumsTopicsRecord, UShort> TOPIC_RATING_TOTAL = createField(DSL.name("topic_rating_total"), SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_rating_hits</code>.
     */
    public final TableField<ForumsTopicsRecord, UShort> TOPIC_RATING_HITS = createField(DSL.name("topic_rating_hits"), SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.title_seo</code>.
     */
    public final TableField<ForumsTopicsRecord, String> TITLE_SEO = createField(DSL.name("title_seo"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.moved_on</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> MOVED_ON = createField(DSL.name("moved_on"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>paradise_forums.forums_topics.topic_archive_status</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> TOPIC_ARCHIVE_STATUS = createField(DSL.name("topic_archive_status"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.last_real_post</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> LAST_REAL_POST = createField(DSL.name("last_real_post"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_answered_pid</code>.
     */
    public final TableField<ForumsTopicsRecord, Integer> TOPIC_ANSWERED_PID = createField(DSL.name("topic_answered_pid"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.popular_time</code>.
     * Timestamp of when this topic will stop being popular.
     */
    public final TableField<ForumsTopicsRecord, Integer> POPULAR_TIME = createField(DSL.name("popular_time"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "Timestamp of when this topic will stop being popular.");

    /**
     * The column <code>paradise_forums.forums_topics.featured</code>. Topic is
     * featured?
     */
    public final TableField<ForumsTopicsRecord, UByte> FEATURED = createField(DSL.name("featured"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "Topic is featured?");

    /**
     * The column <code>paradise_forums.forums_topics.question_rating</code>. If
     * this topic is a question, it's current rating
     */
    public final TableField<ForumsTopicsRecord, Integer> QUESTION_RATING = createField(DSL.name("question_rating"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "If this topic is a question, it's current rating");

    /**
     * The column <code>paradise_forums.forums_topics.topic_hiddenposts</code>.
     */
    public final TableField<ForumsTopicsRecord, UInteger> TOPIC_HIDDENPOSTS = createField(DSL.name("topic_hiddenposts"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.inline("NULL", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.topic_meta_data</code>.
     */
    public final TableField<ForumsTopicsRecord, UByte> TOPIC_META_DATA = createField(DSL.name("topic_meta_data"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.is_anon</code>.
     */
    public final TableField<ForumsTopicsRecord, UByte> IS_ANON = createField(DSL.name("is_anon"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.last_poster_anon</code>.
     */
    public final TableField<ForumsTopicsRecord, UByte> LAST_POSTER_ANON = createField(DSL.name("last_poster_anon"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.is_future_entry</code>.
     */
    public final TableField<ForumsTopicsRecord, UByte> IS_FUTURE_ENTRY = createField(DSL.name("is_future_entry"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>paradise_forums.forums_topics.publish_date</code>.
     */
    public final TableField<ForumsTopicsRecord, UInteger> PUBLISH_DATE = createField(DSL.name("publish_date"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column
     * <code>paradise_forums.forums_topics.solved_reminder_sent</code>.
     */
    public final TableField<ForumsTopicsRecord, UInteger> SOLVED_REMINDER_SENT = createField(DSL.name("solved_reminder_sent"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    private ForumsTopics(Name alias, Table<ForumsTopicsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForumsTopics(Name alias, Table<ForumsTopicsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>paradise_forums.forums_topics</code> table
     * reference
     */
    public ForumsTopics(String alias) {
        this(DSL.name(alias), FORUMS_TOPICS);
    }

    /**
     * Create an aliased <code>paradise_forums.forums_topics</code> table
     * reference
     */
    public ForumsTopics(Name alias) {
        this(alias, FORUMS_TOPICS);
    }

    /**
     * Create a <code>paradise_forums.forums_topics</code> table reference
     */
    public ForumsTopics() {
        this(DSL.name("forums_topics"), null);
    }

    public <O extends Record> ForumsTopics(Table<O> child, ForeignKey<O, ForumsTopicsRecord> key) {
        super(child, key, FORUMS_TOPICS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : ParadiseForums.PARADISE_FORUMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FORUMS_TOPICS_APPROVED, Indexes.FORUMS_TOPICS_FEATURED_TOPICS, Indexes.FORUMS_TOPICS_FORUM_ID, Indexes.FORUMS_TOPICS_LAST_POST, Indexes.FORUMS_TOPICS_LAST_TRUE_POST, Indexes.FORUMS_TOPICS_LAST_X_TOPICS, Indexes.FORUMS_TOPICS_MOST_RECENT_POST, Indexes.FORUMS_TOPICS_MOVED_REDIRECTS, Indexes.FORUMS_TOPICS_POPULAR_TOPICS, Indexes.FORUMS_TOPICS_START_DATE, Indexes.FORUMS_TOPICS_STARTER_ID, Indexes.FORUMS_TOPICS_TOPIC_ARCHIVE_STATUS, Indexes.FORUMS_TOPICS_TOPIC_FIRSTPOST);
    }

    @Override
    public Identity<ForumsTopicsRecord, Integer> getIdentity() {
        return (Identity<ForumsTopicsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ForumsTopicsRecord> getPrimaryKey() {
        return Keys.KEY_FORUMS_TOPICS_PRIMARY;
    }

    @Override
    public ForumsTopics as(String alias) {
        return new ForumsTopics(DSL.name(alias), this);
    }

    @Override
    public ForumsTopics as(Name alias) {
        return new ForumsTopics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForumsTopics rename(String name) {
        return new ForumsTopics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForumsTopics rename(Name name) {
        return new ForumsTopics(name, null);
    }
}
