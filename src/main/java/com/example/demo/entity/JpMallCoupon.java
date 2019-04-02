package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 平台优惠券表
 * </p>
 *
 * @author super_fan
 * @since 2019-03-30
 */
@TableName("jp_mall_coupon")
public class JpMallCoupon extends Model<JpMallCoupon> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 满足金额
     */
	@TableField("satisfy_money")
	private BigDecimal satisfyMoney;
    /**
     * 减免金额
     */
	@TableField("relief_money")
	private BigDecimal reliefMoney;
    /**
     * 限制商品分类ID
     */
	@TableField("restrict_type_id")
	private String restrictTypeId;
    /**
     * 限制内容
     */
	@TableField("restrict_content")
	private String restrictContent;
    /**
     * 起始时间
     */
	@TableField("start_time")
	private Date startTime;
    /**
     * 截止时间
     */
	@TableField("end_time")
	private Date endTime;
    /**
     * 限领数
     */
	@TableField("limit_number")
	private Integer limitNumber;
    /**
     * 已领数
     */
	private Integer picks;


	public String getId() {
		return id;
	}

	public JpMallCoupon setId(String id) {
		this.id = id;
		return this;
	}

	public BigDecimal getSatisfyMoney() {
		return satisfyMoney;
	}

	public JpMallCoupon setSatisfyMoney(BigDecimal satisfyMoney) {
		this.satisfyMoney = satisfyMoney;
		return this;
	}

	public BigDecimal getReliefMoney() {
		return reliefMoney;
	}

	public JpMallCoupon setReliefMoney(BigDecimal reliefMoney) {
		this.reliefMoney = reliefMoney;
		return this;
	}

	public String getRestrictTypeId() {
		return restrictTypeId;
	}

	public JpMallCoupon setRestrictTypeId(String restrictTypeId) {
		this.restrictTypeId = restrictTypeId;
		return this;
	}

	public String getRestrictContent() {
		return restrictContent;
	}

	public JpMallCoupon setRestrictContent(String restrictContent) {
		this.restrictContent = restrictContent;
		return this;
	}

	public Date getStartTime() {
		return startTime;
	}

	public JpMallCoupon setStartTime(Date startTime) {
		this.startTime = startTime;
		return this;
	}

	public Date getEndTime() {
		return endTime;
	}

	public JpMallCoupon setEndTime(Date endTime) {
		this.endTime = endTime;
		return this;
	}

	public Integer getLimitNumber() {
		return limitNumber;
	}

	public JpMallCoupon setLimitNumber(Integer limitNumber) {
		this.limitNumber = limitNumber;
		return this;
	}

	public Integer getPicks() {
		return picks;
	}

	public JpMallCoupon setPicks(Integer picks) {
		this.picks = picks;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
