package java_part2;

// packages are set of classes and interfaces
// java lang - is a default package which comes from java compiler
// java util - all collections interfaces comes from this - syntax: import.package.classnames(ArrayList)
// java.io - for file reading and writing
// these are java inbuilt packages

// user defined packages - our own packages like udemy.part1, udemy.part2...etc, if someone wants to use our packages, they can import in their classes
public class packages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// - imp points:

//  - class A can use class B directly by creating object if both the classes A and B belongs to same package
// -  if class A is in 'udemy.part1' and class B is in udemy.part2 package, then if we want to create Class A 
//    obj in Class B, then we have import class B Package(import.udemy.part1.classA)
// - eg: if we have multiple classes in same package, then we for code redundancy we move one to another package