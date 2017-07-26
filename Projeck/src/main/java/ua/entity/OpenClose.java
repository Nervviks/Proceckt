package ua.entity;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="open_close")
public class OpenClose {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private List<Cafe> openedCafes=new ArrayList<>();
	
	private String time;

	public Integer getRate() {
		return id;
	}

	public void setRate(Integer rate) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
