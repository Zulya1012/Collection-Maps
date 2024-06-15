package maps;
import java.util.*;
public class Dispatcher {
	public static void main(String[] args) {
		NavigableMap<String, Car> m = new TreeMap();
		m.put("Serg", new Car(7000));
		Car c = new Car(8000);
		m.put("Ann", c);
		m.put("Mary", new Car(5000));
//		System.out.println(m);
		m.put("Mary", new Car(6000));
//		System.out.println(m);
//		System.out.println(m.get("Serg"));
//		System.out.println(m.containsKey("Ann"));
//		System.out.println(m.containsValue(new Car(8000)));
//		System.out.println(m.containsValue(c));
		Set<String> keys = m.keySet();
		Collection<Car> cars = m.values();
		System.out.println(keys);
		System.out.println(cars);
		Set<Map.Entry<String, Car>> s = m.entrySet();
		System.out.println(s);
		for(Map.Entry<String, Car> temp : s) {
			temp.setValue(new Car(10000));			
		}
		System.out.println(s);
	}
}
class Car {
	int price;
	Car(int price){
		this.price = price;
	}
	public String toString() {
		return "" + this.price;
	}
}
