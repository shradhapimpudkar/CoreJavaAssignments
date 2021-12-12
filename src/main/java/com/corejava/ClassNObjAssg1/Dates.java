package com.corejava.ClassNObjAssg1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Dates(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Dates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void printDate() {

		if (day != 0 && month != 0 && year != 0) {

			try {

				String sDate1 = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);

				if (isValid(sDate1)) {

					Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

					System.out.println("Date is " + "\t" + date1);
				} else {
					System.out.println("Invalid date provided");
				}

			} catch (Exception e) {
				System.out.println("Invalid date provided Exception ");
			}

		} else {
			System.out.println("To print a date kindly provide one before calling printDate() method");
		}
	}

	public void swapDates(Date[] dates) {

		System.out.println("Before swap : Date1 =" + dates[0] + " Date2 = " + dates[1]);

		Date tempDate;

		tempDate = dates[0];
		dates[0] = dates[1];
		dates[1] = tempDate;

		System.out.println("After swap : Date1 = " + dates[0] + " Date2 = " + dates[1]);

	}

	public Date getDate(String strDate) {

		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date1;
	}

	public boolean isValid(String dateStr) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(dateStr);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
	Dates dates = new Dates();

	dates.setDay(28);
	dates.setMonth(2);
	dates.setYear(2021);
	dates.printDate();
	}
}
