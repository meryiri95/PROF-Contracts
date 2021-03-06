package es.upm.grise.profundizacion2018.tema6.course;

import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion2018.tema6.values.CourseData;

@Invariant("this.getCredits()>=1 && this.getCredits()<=6")
public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;
	
	@Requires("course.getLevel().equals(\"MASTER\")")
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
