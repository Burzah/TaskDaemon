/*
 * This file is generated by jOOQ.
 */
package me.aa07.paradise.taskdaemon.database.forums.tables.records;


import me.aa07.paradise.taskdaemon.database.forums.enums.CoreStreamsDateType;
import me.aa07.paradise.taskdaemon.database.forums.enums.CoreStreamsDefaultView;
import me.aa07.paradise.taskdaemon.database.forums.enums.CoreStreamsFollow;
import me.aa07.paradise.taskdaemon.database.forums.enums.CoreStreamsOwnership;
import me.aa07.paradise.taskdaemon.database.forums.enums.CoreStreamsRead;
import me.aa07.paradise.taskdaemon.database.forums.enums.CoreStreamsSolved;
import me.aa07.paradise.taskdaemon.database.forums.enums.CoreStreamsSort;
import me.aa07.paradise.taskdaemon.database.forums.tables.CoreStreams;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreStreamsRecord extends UpdatableRecordImpl<CoreStreamsRecord> implements Record22<ULong, String, String, CoreStreamsOwnership, CoreStreamsRead, CoreStreamsFollow, CoreStreamsDateType, Integer, Integer, Integer, Long, CoreStreamsSort, UInteger, String, String, String, Byte, String, UByte, CoreStreamsDefaultView, String, CoreStreamsSolved> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>paradise_forums.core_streams.id</code>. ID Number
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.id</code>. ID Number
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.classes</code>. The classes
     * this stream will pull from or null for all
     */
    public void setClasses(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.classes</code>. The classes
     * this stream will pull from or null for all
     */
    public String getClasses() {
        return (String) get(1);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.containers</code>. A
     * JSON-encoded array of classes to allowed containers or NULL for all
     */
    public void setContainers(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.containers</code>. A
     * JSON-encoded array of classes to allowed containers or NULL for all
     */
    public String getContainers() {
        return (String) get(2);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.ownership</code>. Stream
     * pulls all content or only content the viewer has started or posted in
     */
    public void setOwnership(CoreStreamsOwnership value) {
        set(3, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.ownership</code>. Stream
     * pulls all content or only content the viewer has started or posted in
     */
    public CoreStreamsOwnership getOwnership() {
        return (CoreStreamsOwnership) get(3);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.read</code>. If the stream
     * only includes unread items
     */
    public void setRead(CoreStreamsRead value) {
        set(4, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.read</code>. If the stream
     * only includes unread items
     */
    public CoreStreamsRead getRead() {
        return (CoreStreamsRead) get(4);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.follow</code>. If the
     * stream only shows followed content
     */
    public void setFollow(CoreStreamsFollow value) {
        set(5, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.follow</code>. If the
     * stream only shows followed content
     */
    public CoreStreamsFollow getFollow() {
        return (CoreStreamsFollow) get(5);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.date_type</code>. The date
     * range for the stream
     */
    public void setDateType(CoreStreamsDateType value) {
        set(6, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.date_type</code>. The date
     * range for the stream
     */
    public CoreStreamsDateType getDateType() {
        return (CoreStreamsDateType) get(6);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.date_start</code>. If using
     * a custom date, the start date
     */
    public void setDateStart(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.date_start</code>. If using
     * a custom date, the start date
     */
    public Integer getDateStart() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.date_end</code>. If using a
     * custom date, the end date
     */
    public void setDateEnd(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.date_end</code>. If using a
     * custom date, the end date
     */
    public Integer getDateEnd() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.position</code>. The
     * position in the list
     */
    public void setPosition(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.position</code>. The
     * position in the list
     */
    public Integer getPosition() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.member</code>. The member
     * who created the stream or null for a global stream
     */
    public void setMember(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.member</code>. The member
     * who created the stream or null for a global stream
     */
    public Long getMember() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.sort</code>. Whether the
     * stream sorts newest first or oldest first by default
     */
    public void setSort(CoreStreamsSort value) {
        set(11, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.sort</code>. Whether the
     * stream sorts newest first or oldest first by default
     */
    public CoreStreamsSort getSort() {
        return (CoreStreamsSort) get(11);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.date_relative_days</code>.
     * If using a relative date period, the number of days
     */
    public void setDateRelativeDays(UInteger value) {
        set(12, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.date_relative_days</code>.
     * If using a relative date period, the number of days
     */
    public UInteger getDateRelativeDays() {
        return (UInteger) get(12);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.custom_members</code>. If
     * using custom ownership, the member IDs
     */
    public void setCustomMembers(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.custom_members</code>. If
     * using custom ownership, the member IDs
     */
    public String getCustomMembers() {
        return (String) get(13);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.tags</code>. Tags to match
     */
    public void setTags(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.tags</code>. Tags to match
     */
    public String getTags() {
        return (String) get(14);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.followed_types</code>. If
     * filtering by followed content, what kind of follows to include
     */
    public void setFollowedTypes(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.followed_types</code>. If
     * filtering by followed content, what kind of follows to include
     */
    public String getFollowedTypes() {
        return (String) get(15);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.include_comments</code>.
     * Should comments and reviews be included?
     */
    public void setIncludeComments(Byte value) {
        set(16, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.include_comments</code>.
     * Should comments and reviews be included?
     */
    public Byte getIncludeComments() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.title</code>. If this is a
     * member-created stream, the title (admin created streams use language
     * strings)
     */
    public void setTitle(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.title</code>. If this is a
     * member-created stream, the title (admin created streams use language
     * strings)
     */
    public String getTitle() {
        return (String) get(17);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.default</code>. Default
     * item shows to the right of the top breadcrumb navigation
     */
    public void setDefault(UByte value) {
        set(18, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.default</code>. Default
     * item shows to the right of the top breadcrumb navigation
     */
    public UByte getDefault() {
        return (UByte) get(18);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.default_view</code>. Should
     * a stream show in a condensed or expanded layout by default
     */
    public void setDefaultView(CoreStreamsDefaultView value) {
        set(19, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.default_view</code>. Should
     * a stream show in a condensed or expanded layout by default
     */
    public CoreStreamsDefaultView getDefaultView() {
        return (CoreStreamsDefaultView) get(19);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.clubs</code>.
     * Comma-delimited list of club IDs or 0 to exclude clubs, or NULL to not
     * filter by clubs
     */
    public void setClubs(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.clubs</code>.
     * Comma-delimited list of club IDs or 0 to exclude clubs, or NULL to not
     * filter by clubs
     */
    public String getClubs() {
        return (String) get(20);
    }

    /**
     * Setter for <code>paradise_forums.core_streams.solved</code>. The solved
     * status of the item
     */
    public void setSolved(CoreStreamsSolved value) {
        set(21, value);
    }

    /**
     * Getter for <code>paradise_forums.core_streams.solved</code>. The solved
     * status of the item
     */
    public CoreStreamsSolved getSolved() {
        return (CoreStreamsSolved) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<ULong, String, String, CoreStreamsOwnership, CoreStreamsRead, CoreStreamsFollow, CoreStreamsDateType, Integer, Integer, Integer, Long, CoreStreamsSort, UInteger, String, String, String, Byte, String, UByte, CoreStreamsDefaultView, String, CoreStreamsSolved> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<ULong, String, String, CoreStreamsOwnership, CoreStreamsRead, CoreStreamsFollow, CoreStreamsDateType, Integer, Integer, Integer, Long, CoreStreamsSort, UInteger, String, String, String, Byte, String, UByte, CoreStreamsDefaultView, String, CoreStreamsSolved> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return CoreStreams.CORE_STREAMS.ID;
    }

    @Override
    public Field<String> field2() {
        return CoreStreams.CORE_STREAMS.CLASSES;
    }

    @Override
    public Field<String> field3() {
        return CoreStreams.CORE_STREAMS.CONTAINERS;
    }

    @Override
    public Field<CoreStreamsOwnership> field4() {
        return CoreStreams.CORE_STREAMS.OWNERSHIP;
    }

    @Override
    public Field<CoreStreamsRead> field5() {
        return CoreStreams.CORE_STREAMS.READ;
    }

    @Override
    public Field<CoreStreamsFollow> field6() {
        return CoreStreams.CORE_STREAMS.FOLLOW;
    }

    @Override
    public Field<CoreStreamsDateType> field7() {
        return CoreStreams.CORE_STREAMS.DATE_TYPE;
    }

    @Override
    public Field<Integer> field8() {
        return CoreStreams.CORE_STREAMS.DATE_START;
    }

    @Override
    public Field<Integer> field9() {
        return CoreStreams.CORE_STREAMS.DATE_END;
    }

    @Override
    public Field<Integer> field10() {
        return CoreStreams.CORE_STREAMS.POSITION;
    }

    @Override
    public Field<Long> field11() {
        return CoreStreams.CORE_STREAMS.MEMBER;
    }

    @Override
    public Field<CoreStreamsSort> field12() {
        return CoreStreams.CORE_STREAMS.SORT;
    }

    @Override
    public Field<UInteger> field13() {
        return CoreStreams.CORE_STREAMS.DATE_RELATIVE_DAYS;
    }

    @Override
    public Field<String> field14() {
        return CoreStreams.CORE_STREAMS.CUSTOM_MEMBERS;
    }

    @Override
    public Field<String> field15() {
        return CoreStreams.CORE_STREAMS.TAGS;
    }

    @Override
    public Field<String> field16() {
        return CoreStreams.CORE_STREAMS.FOLLOWED_TYPES;
    }

    @Override
    public Field<Byte> field17() {
        return CoreStreams.CORE_STREAMS.INCLUDE_COMMENTS;
    }

    @Override
    public Field<String> field18() {
        return CoreStreams.CORE_STREAMS.TITLE;
    }

    @Override
    public Field<UByte> field19() {
        return CoreStreams.CORE_STREAMS.DEFAULT;
    }

    @Override
    public Field<CoreStreamsDefaultView> field20() {
        return CoreStreams.CORE_STREAMS.DEFAULT_VIEW;
    }

    @Override
    public Field<String> field21() {
        return CoreStreams.CORE_STREAMS.CLUBS;
    }

    @Override
    public Field<CoreStreamsSolved> field22() {
        return CoreStreams.CORE_STREAMS.SOLVED;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getClasses();
    }

    @Override
    public String component3() {
        return getContainers();
    }

    @Override
    public CoreStreamsOwnership component4() {
        return getOwnership();
    }

    @Override
    public CoreStreamsRead component5() {
        return getRead();
    }

    @Override
    public CoreStreamsFollow component6() {
        return getFollow();
    }

    @Override
    public CoreStreamsDateType component7() {
        return getDateType();
    }

    @Override
    public Integer component8() {
        return getDateStart();
    }

    @Override
    public Integer component9() {
        return getDateEnd();
    }

    @Override
    public Integer component10() {
        return getPosition();
    }

    @Override
    public Long component11() {
        return getMember();
    }

    @Override
    public CoreStreamsSort component12() {
        return getSort();
    }

    @Override
    public UInteger component13() {
        return getDateRelativeDays();
    }

    @Override
    public String component14() {
        return getCustomMembers();
    }

    @Override
    public String component15() {
        return getTags();
    }

    @Override
    public String component16() {
        return getFollowedTypes();
    }

    @Override
    public Byte component17() {
        return getIncludeComments();
    }

    @Override
    public String component18() {
        return getTitle();
    }

    @Override
    public UByte component19() {
        return getDefault();
    }

    @Override
    public CoreStreamsDefaultView component20() {
        return getDefaultView();
    }

    @Override
    public String component21() {
        return getClubs();
    }

    @Override
    public CoreStreamsSolved component22() {
        return getSolved();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getClasses();
    }

    @Override
    public String value3() {
        return getContainers();
    }

    @Override
    public CoreStreamsOwnership value4() {
        return getOwnership();
    }

    @Override
    public CoreStreamsRead value5() {
        return getRead();
    }

    @Override
    public CoreStreamsFollow value6() {
        return getFollow();
    }

    @Override
    public CoreStreamsDateType value7() {
        return getDateType();
    }

    @Override
    public Integer value8() {
        return getDateStart();
    }

    @Override
    public Integer value9() {
        return getDateEnd();
    }

    @Override
    public Integer value10() {
        return getPosition();
    }

    @Override
    public Long value11() {
        return getMember();
    }

    @Override
    public CoreStreamsSort value12() {
        return getSort();
    }

    @Override
    public UInteger value13() {
        return getDateRelativeDays();
    }

    @Override
    public String value14() {
        return getCustomMembers();
    }

    @Override
    public String value15() {
        return getTags();
    }

    @Override
    public String value16() {
        return getFollowedTypes();
    }

    @Override
    public Byte value17() {
        return getIncludeComments();
    }

    @Override
    public String value18() {
        return getTitle();
    }

    @Override
    public UByte value19() {
        return getDefault();
    }

    @Override
    public CoreStreamsDefaultView value20() {
        return getDefaultView();
    }

    @Override
    public String value21() {
        return getClubs();
    }

    @Override
    public CoreStreamsSolved value22() {
        return getSolved();
    }

    @Override
    public CoreStreamsRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value2(String value) {
        setClasses(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value3(String value) {
        setContainers(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value4(CoreStreamsOwnership value) {
        setOwnership(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value5(CoreStreamsRead value) {
        setRead(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value6(CoreStreamsFollow value) {
        setFollow(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value7(CoreStreamsDateType value) {
        setDateType(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value8(Integer value) {
        setDateStart(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value9(Integer value) {
        setDateEnd(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value10(Integer value) {
        setPosition(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value11(Long value) {
        setMember(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value12(CoreStreamsSort value) {
        setSort(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value13(UInteger value) {
        setDateRelativeDays(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value14(String value) {
        setCustomMembers(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value15(String value) {
        setTags(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value16(String value) {
        setFollowedTypes(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value17(Byte value) {
        setIncludeComments(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value18(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value19(UByte value) {
        setDefault(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value20(CoreStreamsDefaultView value) {
        setDefaultView(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value21(String value) {
        setClubs(value);
        return this;
    }

    @Override
    public CoreStreamsRecord value22(CoreStreamsSolved value) {
        setSolved(value);
        return this;
    }

    @Override
    public CoreStreamsRecord values(ULong value1, String value2, String value3, CoreStreamsOwnership value4, CoreStreamsRead value5, CoreStreamsFollow value6, CoreStreamsDateType value7, Integer value8, Integer value9, Integer value10, Long value11, CoreStreamsSort value12, UInteger value13, String value14, String value15, String value16, Byte value17, String value18, UByte value19, CoreStreamsDefaultView value20, String value21, CoreStreamsSolved value22) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreStreamsRecord
     */
    public CoreStreamsRecord() {
        super(CoreStreams.CORE_STREAMS);
    }

    /**
     * Create a detached, initialised CoreStreamsRecord
     */
    public CoreStreamsRecord(ULong id, String classes, String containers, CoreStreamsOwnership ownership, CoreStreamsRead read, CoreStreamsFollow follow, CoreStreamsDateType dateType, Integer dateStart, Integer dateEnd, Integer position, Long member, CoreStreamsSort sort, UInteger dateRelativeDays, String customMembers, String tags, String followedTypes, Byte includeComments, String title, UByte default_, CoreStreamsDefaultView defaultView, String clubs, CoreStreamsSolved solved) {
        super(CoreStreams.CORE_STREAMS);

        setId(id);
        setClasses(classes);
        setContainers(containers);
        setOwnership(ownership);
        setRead(read);
        setFollow(follow);
        setDateType(dateType);
        setDateStart(dateStart);
        setDateEnd(dateEnd);
        setPosition(position);
        setMember(member);
        setSort(sort);
        setDateRelativeDays(dateRelativeDays);
        setCustomMembers(customMembers);
        setTags(tags);
        setFollowedTypes(followedTypes);
        setIncludeComments(includeComments);
        setTitle(title);
        setDefault(default_);
        setDefaultView(defaultView);
        setClubs(clubs);
        setSolved(solved);
    }
}
