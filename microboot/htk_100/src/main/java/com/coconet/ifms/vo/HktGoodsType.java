package com.coconet.ifms.vo;

public class HktGoodsType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hkt_goods_type.cat_id
     *
     * @mbg.generated
     */
    private Short catId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hkt_goods_type.cat_name
     *
     * @mbg.generated
     */
    private String catName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hkt_goods_type.enabled
     *
     * @mbg.generated
     */
    private Boolean enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hkt_goods_type.attr_group
     *
     * @mbg.generated
     */
    private String attrGroup;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hkt_goods_type.cat_id
     *
     * @return the value of hkt_goods_type.cat_id
     *
     * @mbg.generated
     */
    public Short getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hkt_goods_type.cat_id
     *
     * @param catId the value for hkt_goods_type.cat_id
     *
     * @mbg.generated
     */
    public void setCatId(Short catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hkt_goods_type.cat_name
     *
     * @return the value of hkt_goods_type.cat_name
     *
     * @mbg.generated
     */
    public String getCatName() {
        return catName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hkt_goods_type.cat_name
     *
     * @param catName the value for hkt_goods_type.cat_name
     *
     * @mbg.generated
     */
    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hkt_goods_type.enabled
     *
     * @return the value of hkt_goods_type.enabled
     *
     * @mbg.generated
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hkt_goods_type.enabled
     *
     * @param enabled the value for hkt_goods_type.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hkt_goods_type.attr_group
     *
     * @return the value of hkt_goods_type.attr_group
     *
     * @mbg.generated
     */
    public String getAttrGroup() {
        return attrGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hkt_goods_type.attr_group
     *
     * @param attrGroup the value for hkt_goods_type.attr_group
     *
     * @mbg.generated
     */
    public void setAttrGroup(String attrGroup) {
        this.attrGroup = attrGroup == null ? null : attrGroup.trim();
    }
}