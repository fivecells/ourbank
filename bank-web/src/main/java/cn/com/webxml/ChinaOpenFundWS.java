package cn.com.webxml;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * ，当日的最新开放式基金净值数据每天15：30以后及时更新。输出数据包括：证券代码、证券简称、单位净值、累计单位净值、前单位净值、净值涨跌额、净值增长率(%)、净值日期。此中国开放式基金数据WEB服务仅作为用户获取信息之目的，并不构成投资建议。 和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。。只有商业用户可获得此中国开放式基金数据Web Services的全部功能，若有需要测试、开发和使用请QQ：8409035或获得用户ID。！
 *         
 *
 * This class was generated by Apache CXF 3.1.14
 * 2018-02-01T21:23:22.078+08:00
 * Generated source version: 3.1.14
 * 
 */
@WebServiceClient(name = "ChinaOpenFundWS", 
                  wsdlLocation = "http://ws.webxml.com.cn/WebServices/ChinaOpenFundWS.asmx?wsdl",
                  targetNamespace = "http://WebXml.com.cn/") 
public class ChinaOpenFundWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://WebXml.com.cn/", "ChinaOpenFundWS");
    public final static QName ChinaOpenFundWSHttpGet = new QName("http://WebXml.com.cn/", "ChinaOpenFundWSHttpGet");
    public final static QName ChinaOpenFundWSHttpPost = new QName("http://WebXml.com.cn/", "ChinaOpenFundWSHttpPost");
    public final static QName ChinaOpenFundWSSoap = new QName("http://WebXml.com.cn/", "ChinaOpenFundWSSoap");
    public final static QName ChinaOpenFundWSSoap12 = new QName("http://WebXml.com.cn/", "ChinaOpenFundWSSoap12");
    static {
        URL url = ChinaOpenFundWS.class.getResource("http://ws.webxml.com.cn/WebServices/ChinaOpenFundWS.asmx?wsdl");
        if (url == null) {
            url = ChinaOpenFundWS.class.getClassLoader().getResource("http://ws.webxml.com.cn/WebServices/ChinaOpenFundWS.asmx?wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(ChinaOpenFundWS.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://ws.webxml.com.cn/WebServices/ChinaOpenFundWS.asmx?wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ChinaOpenFundWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ChinaOpenFundWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChinaOpenFundWS() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ChinaOpenFundWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ChinaOpenFundWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ChinaOpenFundWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ChinaOpenFundWSHttpGet
     */
    @WebEndpoint(name = "ChinaOpenFundWSHttpGet")
    public ChinaOpenFundWSHttpGet getChinaOpenFundWSHttpGet() {
        return super.getPort(ChinaOpenFundWSHttpGet, ChinaOpenFundWSHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaOpenFundWSHttpGet
     */
    @WebEndpoint(name = "ChinaOpenFundWSHttpGet")
    public ChinaOpenFundWSHttpGet getChinaOpenFundWSHttpGet(WebServiceFeature... features) {
        return super.getPort(ChinaOpenFundWSHttpGet, ChinaOpenFundWSHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns ChinaOpenFundWSHttpPost
     */
    @WebEndpoint(name = "ChinaOpenFundWSHttpPost")
    public ChinaOpenFundWSHttpPost getChinaOpenFundWSHttpPost() {
        return super.getPort(ChinaOpenFundWSHttpPost, ChinaOpenFundWSHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaOpenFundWSHttpPost
     */
    @WebEndpoint(name = "ChinaOpenFundWSHttpPost")
    public ChinaOpenFundWSHttpPost getChinaOpenFundWSHttpPost(WebServiceFeature... features) {
        return super.getPort(ChinaOpenFundWSHttpPost, ChinaOpenFundWSHttpPost.class, features);
    }


    /**
     *
     * @return
     *     returns ChinaOpenFundWSSoap
     */
    @WebEndpoint(name = "ChinaOpenFundWSSoap")
    public ChinaOpenFundWSSoap getChinaOpenFundWSSoap() {
        return super.getPort(ChinaOpenFundWSSoap, ChinaOpenFundWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaOpenFundWSSoap
     */
    @WebEndpoint(name = "ChinaOpenFundWSSoap")
    public ChinaOpenFundWSSoap getChinaOpenFundWSSoap(WebServiceFeature... features) {
        return super.getPort(ChinaOpenFundWSSoap, ChinaOpenFundWSSoap.class, features);
    }


    /**
     *
     * @return
     *     returns ChinaOpenFundWSSoap
     */
    @WebEndpoint(name = "ChinaOpenFundWSSoap12")
    public ChinaOpenFundWSSoap getChinaOpenFundWSSoap12() {
        return super.getPort(ChinaOpenFundWSSoap12, ChinaOpenFundWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaOpenFundWSSoap
     */
    @WebEndpoint(name = "ChinaOpenFundWSSoap12")
    public ChinaOpenFundWSSoap getChinaOpenFundWSSoap12(WebServiceFeature... features) {
        return super.getPort(ChinaOpenFundWSSoap12, ChinaOpenFundWSSoap.class, features);
    }

}
