package com.ing.mortgage.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Loan {
@Id
@GeneratedValue(strategy=GenerationType.AUTO) 	
 private Long loanId;
@Column(name="loan_amount")
 private Double loanAmount;
 @Column(name="tenure")
 private Integer tenure;
 @Column(name="rate_of_interest")
 private Double rateOfInterest;
@Column(name="balance_amount")
 private Double balanceAmount;
@Column(name="emi")
 private Double emi;
 @Column(name="loan_account_no")
 private Long loanAccountNo;
 @Column(name="loan_created_date")
 private Date loanCreatedDate;
	/*
	 * @ManyToOne(cascade={CascadeType.ALL})
	 * 
	 * @JoinColumn(name="customerId") private Customer customer;
	 */
public Long getLoanId() {
	return loanId;
}
public void setLoanId(Long loanId) {
	this.loanId = loanId;
}
public Double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(Double loanAmount) {
	this.loanAmount = loanAmount;
}
public Integer getTenure() {
	return tenure;
}
public void setTenure(Integer tenure) {
	this.tenure = tenure;
}
public Double getRateOfInterest() {
	return rateOfInterest;
}
public void setRateOfInterest(Double rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
}
public Double getBalanceAmount() {
	return balanceAmount;
}
public void setBalanceAmount(Double balanceAmount) {
	this.balanceAmount = balanceAmount;
}
public Double getEmi() {
	return emi;
}
public void setEmi(Double emi) {
	this.emi = emi;
}
public Long getLoanAccountNo() {
	return loanAccountNo;
}
public void setLoanAccountNo(Long loanAccountNo) {
	this.loanAccountNo = loanAccountNo;
}
public Date getLoanCreatedDate() {
	return loanCreatedDate;
}
public void setLoanCreatedDate(Date loanCreatedDate) {
	this.loanCreatedDate = loanCreatedDate;
}
 
 
}
