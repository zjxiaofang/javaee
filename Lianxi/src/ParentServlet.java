public class ParentServlet {
    public void init(){
        System.out.println("初始化");
    }
    public void service(String method) throws Exception {
        if("get".equals(method)){
            doGet();
        }else{
            doPost();
        }
    }

    private void doPost() throws Exception {
        System.out.println("父类post");
        throw new Exception("405错误");
    }

    private void doGet() throws Exception {
        System.out.println("父类get");
        throw new Exception("405错误");
    }
}
