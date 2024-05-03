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
 * 客户
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
@TableName("kehu")
public class KehuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KehuEntity() {
		
	}
	
	public KehuEntity(T t) {
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
	 * 客户编号
	 */
					
	private String kehubianhao;
	
	/**
	 * 客户姓名
	 */
					
	private String kehuxingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 车辆品牌
	 */
					
	private String cheliangpinpai;
	
	/**
	 * 购车方式
	 */
					
	private String gouchefangshi;
	
	/**
	 * 交车时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiaocheshijian;
	
	/**
	 * 保险年限
	 */
					
	private String baoxiannianxian;
	
	/**
	 * 维修记录
	 */
					
	private String weixiujilu;
	
	/**
	 * 保养记录
	 */
					
	private String baoyangjilu;
	
	
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
	 * 设置：客户编号
	 */
	public void setKehubianhao(String kehubianhao) {
		this.kehubianhao = kehubianhao;
	}
	/**
	 * 获取：客户编号
	 */
	public String getKehubianhao() {
		return kehubianhao;
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
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
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
	 * 设置：购车方式
	 */
	public void setGouchefangshi(String gouchefangshi) {
		this.gouchefangshi = gouchefangshi;
	}
	/**
	 * 获取：购车方式
	 */
	public String getGouchefangshi() {
		return gouchefangshi;
	}
	/**
	 * 设置：交车时间
	 */
	public void setJiaocheshijian(Date jiaocheshijian) {
		this.jiaocheshijian = jiaocheshijian;
	}
	/**
	 * 获取：交车时间
	 */
	public Date getJiaocheshijian() {
		return jiaocheshijian;
	}
	/**
	 * 设置：保险年限
	 */
	public void setBaoxiannianxian(String baoxiannianxian) {
		this.baoxiannianxian = baoxiannianxian;
	}
	/**
	 * 获取：保险年限
	 */
	public String getBaoxiannianxian() {
		return baoxiannianxian;
	}
	/**
	 * 设置：维修记录
	 */
	public void setWeixiujilu(String weixiujilu) {
		this.weixiujilu = weixiujilu;
	}
	/**
	 * 获取：维修记录
	 */
	public String getWeixiujilu() {
		return weixiujilu;
	}
	/**
	 * 设置：保养记录
	 */
	public void setBaoyangjilu(String baoyangjilu) {
		this.baoyangjilu = baoyangjilu;
	}
	/**
	 * 获取：保养记录
	 */
	public String getBaoyangjilu() {
		return baoyangjilu;
	}

}
