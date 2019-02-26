package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by admin on 2019/2/26.
 * webservice Glassfish /JAX_WS2.2 RI /Metro 1.X/JWSDP 2.2 方式搭建服务器
 */
@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, Glassfish /JAX_WS2.2 RI /Metro 1.X/JWSDP 2.2 方式搭建webservice" +
            "服务器 " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    System.out.println("HelloWorld 启动成功");
    Endpoint.publish(address, implementor);
  }
}
