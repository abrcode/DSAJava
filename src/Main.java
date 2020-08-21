
public class Main {

	public static void main(String[] args) {
		IntStack sc=new IntStack();
		if(!sc.isFull()){
			sc.push(2);
			sc.push(4);
			sc.push(6);
		
		}
		

		System.out.println(sc.pop());
		System.out.println(sc.pop());
	}
}
