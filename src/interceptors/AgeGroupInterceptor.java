package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeGroupInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("age group interceptor pre processing");
		
		ValueStack stack = arg0.getStack();
		Integer age = (Integer)stack.findValue("age");
		String ageGroup = "";
		
		if (age <= 18)
		{
			ageGroup="children";
		}else if (age > 18 && age <= 50)
		{
			ageGroup="adult";
		}else
		{
			ageGroup="senior";
		}
		
		stack.set("age", age+ageGroup);
		
		String result = arg0.invoke();
		System.out.println("age group interceptor post processing");
	    return result;
	}

}
