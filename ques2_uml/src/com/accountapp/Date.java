package com.accountapp;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date() {}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public void input(Date date)
	{
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public void print()
	{
		System.out.println("Day: "+ day);
		System.out.println("Month: "+ month);
		System.out.println("Year: "+ year);
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
