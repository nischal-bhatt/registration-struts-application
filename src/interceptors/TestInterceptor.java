package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("test destroy");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("test init");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test pre processing");
		
		String result=ai.invoke();
		System.out.println("test post processing");
		
		return result;
	}

}
