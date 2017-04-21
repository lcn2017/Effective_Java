package Model.test1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*服务供应者框架:总共有三部分组成
1、提供者注册API(Provioder registeration API)
2、服务接口(Service interface)
3、服务访问API(Service Access API)
第四个可选的服务提供者接口(Service Provider Interface)
*/
interface Service{
	//提供的服务都在这里面
}
interface provider{
	Service newService();
}
//非实例化类关于注册和服务
public class Services {
	private Services() {}
	private static final Map<String, provider> providers=
			new ConcurrentHashMap<String, provider>();
	public static final String DEFAULT_PROVIDER_NAME="<def>";
	//提供者注册API
	public static void registerDefaultprovioder(provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME,p);
	}
	public static void registerProvider(String name,provider p) {
		providers.put(name, p);
	}
	//服务访问API
	public static Service newInsetance(){
		return newInsetance(DEFAULT_PROVIDER_NAME);
	}
	public static Service newInsetance(String name){
		provider p = providers.get(name);
		if (p==null) {
			throw new IllegalArgumentException("未找到对应的提供者");
		}
		return p.newService();
	}
}


