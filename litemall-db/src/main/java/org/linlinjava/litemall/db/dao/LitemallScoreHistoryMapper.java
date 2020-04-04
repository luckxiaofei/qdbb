package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallScoreHistory;
import org.linlinjava.litemall.db.domain.LitemallScoreHistoryExample;

public interface LitemallScoreHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    long countByExample(LitemallScoreHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallScoreHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int insert(LitemallScoreHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int insertSelective(LitemallScoreHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    LitemallScoreHistory selectOneByExample(LitemallScoreHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    LitemallScoreHistory selectOneByExampleSelective(@Param("example") LitemallScoreHistoryExample example, @Param("selective") LitemallScoreHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    List<LitemallScoreHistory> selectByExampleSelective(@Param("example") LitemallScoreHistoryExample example, @Param("selective") LitemallScoreHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    List<LitemallScoreHistory> selectByExample(LitemallScoreHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    LitemallScoreHistory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallScoreHistory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    LitemallScoreHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallScoreHistory record, @Param("example") LitemallScoreHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallScoreHistory record, @Param("example") LitemallScoreHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallScoreHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_score_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallScoreHistory record);
}