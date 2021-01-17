package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Coment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		
		Coment c1 = new Coment("Have a nice trip");
		Coment c2 = new Coment("Meu casal!");
		
		Post p1 = new Post(
				format.parse("21/06/2018 13:05:44"), 
				"Traveling to new Zealand",
				"bla bla", 12);
		
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
	}
}
