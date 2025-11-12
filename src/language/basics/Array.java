package language.basics;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String SemesterMarks[][][] = {
				{{"Mathematics 1", "Physics", "Chemistry","Computer Programming", "Engineering Drawing","Basic Electrical Eng"},{"Pass(78)","pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"}},
				{{"Mathematics 2", "Mechanics", "Environmental Science","Basic Electronics", "Engineering Physics","Engineering Graphics"},{"Pass(82)","pass(77)","pass(93)","Fail(19)","Fail(24)","Pass(90)"}},
				{{"Data Structures", "Discrete Mathematics", "Digital Electronics","Operating Systems", "Signals and systems","Object oriented prog."},{"Pass(88)","pass(81)","pass(76)","Fail(32)","Pass(85)","Pass(78)"}},
				{{"Algorithms", "Computer Networks", "Database Systems","Micro processors", "Communication Engineering","Software Engineering"},{"Pass(91)","pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"}},
				{{"Probability & Statistics", "Machine Learning", "Compiler Design","Theoryof Computation", "Embedded Systems","Computer Graphics"},{"Pass(86)","pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"}}
		};
		
		System.out.println("Name of Subject 4 and 5 in Semester 2 is "+ SemesterMarks[1][0][3]+" and "+ SemesterMarks[1][0][4]);
		System.out.println("Status/Marks of Subject 3 and Subject 6 in Semester 4 is "+SemesterMarks[3][1][2]+ " and "+SemesterMarks[3][1][5] );
		
	}

}
