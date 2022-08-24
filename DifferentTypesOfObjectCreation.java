import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DifferentTypesOfObjectCreation implements Cloneable {
  public void methodType(String a) {
	System.out.println("Type of Object Creation is: "+a );
}
  
  
  
  public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	  DifferentTypesOfObjectCreation obj=new DifferentTypesOfObjectCreation();
	  obj.methodType("New Key word Object");
	  DifferentTypesOfObjectCreation obj2=(DifferentTypesOfObjectCreation) obj.clone();
	  obj2.methodType("Clone Object ctreation");
	  DifferentTypesOfObjectCreation obj3=DifferentTypesOfObjectCreation.class.newInstance();
	  obj3.methodType("Instance  Object ctreation");
	  Constructor<DifferentTypesOfObjectCreation> constructor=DifferentTypesOfObjectCreation.class.getDeclaredConstructor();
	  DifferentTypesOfObjectCreation obj44=constructor.newInstance();
	  obj44.methodType("Constructor Object Cration");}}