public class Tomcat extends Thread{
    @Override
    public void run(){
        System.out.println("服务器被请求");
        SonServlet servlet = SonServlet.getInstance();
        System.out.println(servlet);
        try {
            servlet.service("get");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            new Tomcat().start();
        }
    }
}
