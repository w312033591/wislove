package com.wislove.uc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_base_info")
public class UserBaseInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.head_img_url
     *
     * @mbggenerated
     */
    private String headImgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.mobile_phone
     *
     * @mbggenerated
     */
    private String mobilePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.county
     *
     * @mbggenerated
     */
    private String county;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.intro
     *
     * @mbggenerated
     */
    private String intro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_base_info.version_no
     *
     * @mbggenerated
     */
    private Integer versionNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.id
     *
     * @return the value of user_base_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.id
     *
     * @param id the value for user_base_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.nickname
     *
     * @return the value of user_base_info.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.nickname
     *
     * @param nickname the value for user_base_info.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.head_img_url
     *
     * @return the value of user_base_info.head_img_url
     *
     * @mbggenerated
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.head_img_url
     *
     * @param headImgUrl the value for user_base_info.head_img_url
     *
     * @mbggenerated
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.mobile_phone
     *
     * @return the value of user_base_info.mobile_phone
     *
     * @mbggenerated
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.mobile_phone
     *
     * @param mobilePhone the value for user_base_info.mobile_phone
     *
     * @mbggenerated
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.province
     *
     * @return the value of user_base_info.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.province
     *
     * @param province the value for user_base_info.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.city
     *
     * @return the value of user_base_info.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.city
     *
     * @param city the value for user_base_info.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.county
     *
     * @return the value of user_base_info.county
     *
     * @mbggenerated
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.county
     *
     * @param county the value for user_base_info.county
     *
     * @mbggenerated
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.intro
     *
     * @return the value of user_base_info.intro
     *
     * @mbggenerated
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.intro
     *
     * @param intro the value for user_base_info.intro
     *
     * @mbggenerated
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.status
     *
     * @return the value of user_base_info.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.status
     *
     * @param status the value for user_base_info.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.update_time
     *
     * @return the value of user_base_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.update_time
     *
     * @param updateTime the value for user_base_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.create_time
     *
     * @return the value of user_base_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.create_time
     *
     * @param createTime the value for user_base_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_base_info.version_no
     *
     * @return the value of user_base_info.version_no
     *
     * @mbggenerated
     */
    public Integer getVersionNo() {
        return versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_base_info.version_no
     *
     * @param versionNo the value for user_base_info.version_no
     *
     * @mbggenerated
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }
}