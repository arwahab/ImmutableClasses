
public class ImmutableStudentRunner {
	public static void main(String[] args) {
		// Mutable Age class
		Age age = new Age();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1992);

		// Mutable age object passes into immutable student object
		ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
		System.out.println("Tony age year before modification = " + student.getAge().getYear());
		age.setYear(1993);
		System.out.println("Tony age year after modification = " + student.getAge().getYear());
	}

}
