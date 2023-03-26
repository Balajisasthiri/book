package com.day1.funtion;

public class VoooterAge {
		public String voterAge(int age) {
			if(age>=18) {
				
				return "Eligible to vote";
			}
			else {
				return "Not eliible to vote";
		}
		}
		public static void main(String[] args) {
			VoooterAge a=new VoooterAge();
			System.out.println(a.voterAge(16));
		}
		}

