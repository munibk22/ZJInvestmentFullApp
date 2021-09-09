package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "holdings")
public class CurrentHoldings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int holdingsId;

	@Column(name = "current_Usd")
	private double currentUsd;
	@Column(name = "current_Bitcion")
	private double currentBitcoin;
	@Column(name = "current_stockValue")
	private double stockValue;

	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	@JoinColumn(name="user_id")
	private User user;
	


	public CurrentHoldings() {
		super();
	}

	



	public CurrentHoldings(int holdingsId, double currentUsd, double currentBitcoin, double stockValue, User user) {
		super();
		this.holdingsId = holdingsId;
		this.currentUsd = currentUsd;
		this.currentBitcoin = currentBitcoin;
		this.stockValue = stockValue;
		this.user = user;
	}





	public int getHoldingsId() {
		return holdingsId;
	}





	public void setHoldingsId(int holdingsId) {
		this.holdingsId = holdingsId;
	}





	public double getCurrentUsd() {
		return currentUsd;
	}





	public void setCurrentUsd(double currentUsd) {
		this.currentUsd = currentUsd;
	}





	public double getCurrentBitcoin() {
		return currentBitcoin;
	}





	public void setCurrentBitcoin(double currentBitcoin) {
		this.currentBitcoin = currentBitcoin;
	}





	public double getStockValue() {
		return stockValue;
	}





	public void setStockValue(double stockValue) {
		this.stockValue = stockValue;
	}





	public User getUser() {
		return user;
	}





	public void setUser(User user) {
		this.user = user;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(currentBitcoin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(currentUsd);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + holdingsId;
		temp = Double.doubleToLongBits(stockValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentHoldings other = (CurrentHoldings) obj;
		if (Double.doubleToLongBits(currentBitcoin) != Double.doubleToLongBits(other.currentBitcoin))
			return false;
		if (Double.doubleToLongBits(currentUsd) != Double.doubleToLongBits(other.currentUsd))
			return false;
		if (holdingsId != other.holdingsId)
			return false;
		if (Double.doubleToLongBits(stockValue) != Double.doubleToLongBits(other.stockValue))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurrentHoldings [holdingsId=" + holdingsId + ", currentUsd=" + currentUsd + ", currentBitcoin="
				+ currentBitcoin + ", stockValue=" + stockValue + ", user=" + user + "]";
	}

	

}
