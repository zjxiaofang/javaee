import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author edz
 */
public class HelloCreateCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)



            throws ServletException, IOException {

        //创建cookie信息
        Cookie cookie01 = new Cookie("apple", "iphoneX");
        Cookie cookie02 = new Cookie("vivo", "vivoX23");
        Cookie cookie03 = new Cookie("apple", "iphoneXSM");
        Cookie cookie04 = new Cookie("xiaomi","xiaomi10");
        //设置中文
        Cookie cookie05 = new Cookie("name", URLEncoder.encode("张三", "utf-8"));

        //设置有效期--三天
        cookie02.setMaxAge(3*24*3600);
        //设置cookie的访问路径
        cookie04.setPath("/a/b");

        //把cookie信息响应给客户端
        resp.addCookie(cookie01);
        resp.addCookie(cookie02);
        resp.addCookie(cookie03);
        resp.addCookie(cookie04);
        resp.addCookie(cookie05);
    }
}
