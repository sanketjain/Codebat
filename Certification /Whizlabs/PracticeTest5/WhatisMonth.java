import java.time.LocalDate;

public class WhatisMonth{
	public static void main(String[] args){
		LocalDate ld = LocalDate.ofYearDay(2016, 22);
		System.out.println(ld.getMonthValue());
	}
}