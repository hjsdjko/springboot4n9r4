package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 车辆销售
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
@TableName("cheliangxiaoshou")
public class CheliangxiaoshouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangxiaoshouEntity() {
		
	}
	
	public CheliangxiaoshouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 车辆编号
	 */
					
	private String cheliangbianhao;
	
	/**
	 * 车辆品牌
	 */
					
	private String cheliangpinpai;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 售价
	 */
					
	private Integer shoujia;
	
	/**
	 * 是否支付
	 */
					
	private String shifouzhifu;
	
	/**
	 * 支付方式
	 */
					
	private String zhifufangshi;
	
	/**
	 * 客户姓名
	 */
					
	private String kehuxingming;
	
	/**
	 * 预计交车时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yujijiaocheshijian;
	
	/**
	 * 销售日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiaoshouriqi;
	
	/**
	 * 销售账号
	 */
					
	private String xiaoshouzhanghao;
	
	/**
	 * 销售姓名
	 */
					
	private String xiaoshouxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：车辆编号
	 */
	public void setCheliangbianhao(String cheliangbianhao) {
		this.cheliangbianhao = cheliangbianhao;
	}
	/**
	 * 获取：车辆编号
	 */
	public String getCheliangbianhao() {
		return cheliangbianhao;
	}
	/**
	 * 设置：车辆品牌
	 */
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：售价
	 */
	public void setShoujia(Integer shoujia) {
		this.shoujia = shoujia;
	}
	/**
	 * 获取：售价
	 */
	public Integer getShoujia() {
		return shoujia;
	}
	/**
	 * 设置：是否支付
	 */
	public void setShifouzhifu(String shifouzhifu) {
		this.shifouzhifu = shifouzhifu;
	}
	/**
	 * 获取：是否支付
	 */
	public String getShifouzhifu() {
		return shifouzhifu;
	}
	/**
	 * 设置：支付方式
	 */
	public void setZhifufangshi(String zhifufangshi) {
		this.zhifufangshi = zhifufangshi;
	}
	/**
	 * 获取：支付方式
	 */
	public String getZhifufangshi() {
		return zhifufangshi;
	}
	/**
	 * 设置：客户姓名
	 */
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
	/**
	 * 设置：预计交车时间
	 */
	public void setYujijiaocheshijian(Date yujijiaocheshijian) {
		this.yujijiaocheshijian = yujijiaocheshijian;
	}
	/**
	 * 获取：预计交车时间
	 */
	public Date getYujijiaocheshijian() {
		return yujijiaocheshijian;
	}
	/**
	 * 设置：销售日期
	 */
	public void setXiaoshouriqi(Date xiaoshouriqi) {
		this.xiaoshouriqi = xiaoshouriqi;
	}
	/**
	 * 获取：销售日期
	 */
	public Date getXiaoshouriqi() {
		return xiaoshouriqi;
	}
	/**
	 * 设置：销售账号
	 */
	public void setXiaoshouzhanghao(String xiaoshouzhanghao) {
		this.xiaoshouzhanghao = xiaoshouzhanghao;
	}
	/**
	 * 获取：销售账号
	 */
	public String getXiaoshouzhanghao() {
		return xiaoshouzhanghao;
	}
	/**
	 * 设置：销售姓名
	 */
	public void setXiaoshouxingming(String xiaoshouxingming) {
		this.xiaoshouxingming = xiaoshouxingming;
	}
	/**
	 * 获取：销售姓名
	 */
	public String getXiaoshouxingming() {
		return xiaoshouxingming;
	}

}
