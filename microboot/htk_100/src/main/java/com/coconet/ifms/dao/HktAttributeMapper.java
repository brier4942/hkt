package com.coconet.ifms.dao;


import com.coconet.ifms.vo.HktAttribute;

public interface HktAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_attribute
     *
     * @mbg.generated
     */
    int insert(HktAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_attribute
     *
     * @mbg.generated
     */
    int insertSelective(HktAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_attribute
     *
     * @mbg.generated
     */
    HktAttribute selectByPrimaryKey(Short attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HktAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(HktAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HktAttribute record);
}