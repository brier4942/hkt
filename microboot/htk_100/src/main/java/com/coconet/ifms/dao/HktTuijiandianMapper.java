package com.coconet.ifms.dao;


import com.coconet.ifms.vo.HktTuijiandian;

public interface HktTuijiandianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_tuijiandian
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_tuijiandian
     *
     * @mbg.generated
     */
    int insert(HktTuijiandian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_tuijiandian
     *
     * @mbg.generated
     */
    int insertSelective(HktTuijiandian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_tuijiandian
     *
     * @mbg.generated
     */
    HktTuijiandian selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_tuijiandian
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HktTuijiandian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_tuijiandian
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HktTuijiandian record);
}