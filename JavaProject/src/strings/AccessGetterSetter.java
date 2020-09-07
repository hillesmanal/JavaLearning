package strings;

public class AccessGetterSetter {

	public static void main(String[] args) {


		SetterGetter sg = new SetterGetter();
		sg.setId(600);
		sg.setName("Manal");
		
		System.out.println(sg.getId() + "  " + sg.getName());

	}

}
