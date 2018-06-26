import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		for (String method : new Excel().read(args[0])) {
			Method m = Action.class.getMethod(method, Integer.TYPE, Integer.TYPE);
			m.invoke(new Action(), 1, 2);
		}
	}

}
