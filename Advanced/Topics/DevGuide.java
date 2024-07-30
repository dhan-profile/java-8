package Topics;

@HelloWorld
public class DevGuide {
	public static void main(String[] args) {
            HelloWorld hello = DevGuide.class.getAnnotation(HelloWorld.class);
            System.out.println(hello.message());
	}
}



//System.out.println(hello);
//System.out.println(HelloWorld.message);