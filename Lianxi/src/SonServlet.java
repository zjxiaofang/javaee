public class SonServlet extends ParentServlet {
    private SonServlet() {

    }
    private static SonServlet ss;
    public static SonServlet getInstance() {
        if (ss == null) {
            synchronized (SonServlet.class) {
                if (ss == null) {
                    ss = new SonServlet();
                    ss.init();
                }
            }
        }
        return ss;
    }
}