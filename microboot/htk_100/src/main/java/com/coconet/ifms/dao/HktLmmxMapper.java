package com.coconet.ifms.dao;

import java.util.List;

import com.coconet.ifms.vo.HktLmmx;

public interface HktLmmxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_lmmx
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_lmmx
     *
     * @mbg.generated
     */
    int insert(HktLmmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_lmmx
     *
     * @mbg.generated
     */
    int insertSelective(HktLmmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_lmmx
     *
     * @mbg.generated
     */
    HktLmmx selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_lmmx
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HktLmmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_lmmx
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HktLmmx record);
    List<HktLmmx> selectByLmid(Integer lmid);
}