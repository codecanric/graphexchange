//这个类实现interface NamedElement

//返回对象表明的实体的名字
package xiaoanjie;

import java.lang.*;

public  class NamedElement1 implements NamedElement {

	
	public String getName() {
		
		// returns the Class object associated with this class
		NamedElement1 c1 = new NamedElement1(); 
		Class c1Class = c1.getClass();
		
		// returns the name of the class
	     String name = c1Class.getName();
	     System.out.println("Class Name = " + name);
	}
	

	
		
	}

}
