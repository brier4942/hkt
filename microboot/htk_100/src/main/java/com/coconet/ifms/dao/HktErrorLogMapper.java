package com.coconet.ifms.dao;



import com.coconet.ifms.vo.HktErrorLog;

public interface HktErrorLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_error_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_error_log
     *
     * @mbg.generated
     */
    int insert(HktErrorLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_error_log
     *
     * @mbg.generated
     */
    int insertSelective(HktErrorLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_error_log
     *
     * @mbg.generated
     */
    HktErrorLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_error_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HktErrorLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_error_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HktErrorLog record);
}