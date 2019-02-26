package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by admin on 2019/2/26.
 */
@WebService()
public class Test {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new Test ();
    String address = "http://localhost:9000/Test";
    Endpoint.publish(address, implementor);
  }
}
