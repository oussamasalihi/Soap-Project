
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroTooDh")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroTooDh", targetNamespace = "http://ws/", className = "proxy.ConversionEuroTooDh")
    @ResponseWrapper(localName = "ConversionEuroTooDhResponse", targetNamespace = "http://ws/", className = "proxy.ConversionEuroTooDhResponse")
    @Action(input = "http://ws/BanqueService/ConversionEuroTooDhRequest", output = "http://ws/BanqueService/ConversionEuroTooDhResponse")
    public double conversionEuroTooDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://ws/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://ws/", className = "proxy.ListComptesResponse")
    @Action(input = "http://ws/BanqueService/listComptesRequest", output = "http://ws/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
