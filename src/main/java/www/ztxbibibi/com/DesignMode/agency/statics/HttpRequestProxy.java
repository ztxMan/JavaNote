package www.ztxbibibi.com.DesignMode.agency.statics;

public class HttpRequestProxy implements IHttpRequest {
    IHttpRequest client = new OkHttpClient();


    private void doBefore() {

    }

    private void doAfter() {


    }


    @Override
    public void get() {
        client.get();
    }

    @Override
    public void post() {
        client.post();

    }

    @Override
    public void upLoad() {
        client.upLoad();

    }

    @Override
    public void downLoad() {
        client.downLoad();
    }
}
