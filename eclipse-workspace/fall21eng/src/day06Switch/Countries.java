package day06Switch;

import java.util.Scanner;

public class Countries {

	public static void main(String[] args) {
		/*
	 	Ask user to enter country name among "America, England, Germany, Turkey,
	    India, Peru, Spain, Bulgaria, Albania, France"
	 	Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
	 	
	 */	Scanner scan = new Scanner(System.in);
		System.out.println("Enter any country name from the list; "
		+ "{America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France}");
        String c=scan.next().toLowerCase();
        
        switch(c.toLowerCase()) {
        case "america": System.out.println("USA");
        break;
        case "england" :System.out.println("UK");
        break;
        case "germany": System.out.println("DE");
        break;
        case "turkey" :System.out.println("TR");
        break;
        case "bulgaria": System.out.println("BG");
        break;
        case "albenia" :System.out.println("AL");
        break;
        case "india": System.out.println("IN");
        break;
        case "spain" :System.out.println("UK");
        break;
        case "peru": System.out.println("PR");
        break;
        case "france" :System.out.println("FR");
        break;
        default:
        System.out.println("Select the country names from the list");
        }
        	

		
		
		
		
		
		
		
		
		
		
		
	}

}
