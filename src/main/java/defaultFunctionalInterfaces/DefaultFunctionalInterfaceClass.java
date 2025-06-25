package defaultFunctionalInterfaces;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctionalInterfaceClass {

	public static void main(String[] args) {
		
		//Predicate 
		Predicate<String> pc = x ->x.isEmpty();
		System.out.println(pc.test("Aakash"));
		
		//Function
		Function<Integer,Integer> fn = a -> a*a;
		System.out.println(fn.apply(2));
		
		fn = a -> a*a*a;
		System.out.println(fn.apply(2));
		
		//Supplier
		Supplier<String> sp = () -> {
				SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
				String uniqueId = sdf.format(Calendar.getInstance().getTime());
				return uniqueId;				
		};
		System.out.println(sp.get());
		
		//Consumer
		Consumer<String> cn = x -> System.out.println(x.toUpperCase());
		cn.accept("Aakash");

	}

}
