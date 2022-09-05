package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.couplagefaible.Orchestre;

public class ApplicationAvecSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Orchestre orchestre = context.getBean("orchestre", Orchestre.class);		
		orchestre.jouer();
		((ClassPathXmlApplicationContext) context).close();
	}
}
