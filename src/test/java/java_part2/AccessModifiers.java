package java_part2;

// AccessModifiers - public, private, protected, default

// 1. default(no modifier specified): if we dont mention any modifier in method, then java considers it as default,accessible by the classes of the same package
//eg: void getData(){} - we can access this modifier only in that package - same applies for variables(eg: int i=0)

// 2. public: if we mark variable or method as public, then we will have access across all the packages(accessible from everywhere)

// 3. private: if we mark variable or method as private, then you cannot access method/variable outside the class of same package
//eg: payment gateway pages for payment(credit cards-sensitive details) in e-commerce sites and also for bank applications
//accessible within the same class only

//4. protected: if we mark variable or method as protected, can be accessible by the classes of the same package and the subclasses
//residing in any package - for inheriting classes using 'extends' keyword
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
