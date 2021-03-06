package org.linlinjava.litemall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallUserFriend {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.userId
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.friend_user_id
     *
     * @mbg.generated
     */
    private Integer friendUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.friend_user_name
     *
     * @mbg.generated
     */
    private String friendUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.commission
     *
     * @mbg.generated
     */
    private BigDecimal commission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.score_commission
     *
     * @mbg.generated
     */
    private Integer scoreCommission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_friend.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.id
     *
     * @return the value of litemall_user_friend.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.id
     *
     * @param id the value for litemall_user_friend.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.userId
     *
     * @return the value of litemall_user_friend.userId
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.userId
     *
     * @param userid the value for litemall_user_friend.userId
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.friend_user_id
     *
     * @return the value of litemall_user_friend.friend_user_id
     *
     * @mbg.generated
     */
    public Integer getFriendUserId() {
        return friendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.friend_user_id
     *
     * @param friendUserId the value for litemall_user_friend.friend_user_id
     *
     * @mbg.generated
     */
    public void setFriendUserId(Integer friendUserId) {
        this.friendUserId = friendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.friend_user_name
     *
     * @return the value of litemall_user_friend.friend_user_name
     *
     * @mbg.generated
     */
    public String getFriendUserName() {
        return friendUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.friend_user_name
     *
     * @param friendUserName the value for litemall_user_friend.friend_user_name
     *
     * @mbg.generated
     */
    public void setFriendUserName(String friendUserName) {
        this.friendUserName = friendUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.commission
     *
     * @return the value of litemall_user_friend.commission
     *
     * @mbg.generated
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.commission
     *
     * @param commission the value for litemall_user_friend.commission
     *
     * @mbg.generated
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.score_commission
     *
     * @return the value of litemall_user_friend.score_commission
     *
     * @mbg.generated
     */
    public Integer getScoreCommission() {
        return scoreCommission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.score_commission
     *
     * @param scoreCommission the value for litemall_user_friend.score_commission
     *
     * @mbg.generated
     */
    public void setScoreCommission(Integer scoreCommission) {
        this.scoreCommission = scoreCommission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.add_time
     *
     * @return the value of litemall_user_friend.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.add_time
     *
     * @param addTime the value for litemall_user_friend.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_friend.update_time
     *
     * @return the value of litemall_user_friend.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_friend.update_time
     *
     * @param updateTime the value for litemall_user_friend.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_friend
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", friendUserId=").append(friendUserId);
        sb.append(", friendUserName=").append(friendUserName);
        sb.append(", commission=").append(commission);
        sb.append(", scoreCommission=").append(scoreCommission);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_friend
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallUserFriend other = (LitemallUserFriend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getFriendUserId() == null ? other.getFriendUserId() == null : this.getFriendUserId().equals(other.getFriendUserId()))
            && (this.getFriendUserName() == null ? other.getFriendUserName() == null : this.getFriendUserName().equals(other.getFriendUserName()))
            && (this.getCommission() == null ? other.getCommission() == null : this.getCommission().equals(other.getCommission()))
            && (this.getScoreCommission() == null ? other.getScoreCommission() == null : this.getScoreCommission().equals(other.getScoreCommission()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_friend
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getFriendUserId() == null) ? 0 : getFriendUserId().hashCode());
        result = prime * result + ((getFriendUserName() == null) ? 0 : getFriendUserName().hashCode());
        result = prime * result + ((getCommission() == null) ? 0 : getCommission().hashCode());
        result = prime * result + ((getScoreCommission() == null) ? 0 : getScoreCommission().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_user_friend
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        userid("userId", "userid", "INTEGER", false),
        friendUserId("friend_user_id", "friendUserId", "INTEGER", false),
        friendUserName("friend_user_name", "friendUserName", "VARCHAR", false),
        commission("commission", "commission", "DECIMAL", false),
        scoreCommission("score_commission", "scoreCommission", "INTEGER", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_friend
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}