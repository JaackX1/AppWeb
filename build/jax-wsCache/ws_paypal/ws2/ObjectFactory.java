
package ws2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Validacion_QNAME = new QName("http://ws/", "validacion");
    private final static QName _ValidacionResponse_QNAME = new QName("http://ws/", "validacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Validacion }
     * 
     */
    public Validacion createValidacion() {
        return new Validacion();
    }

    /**
     * Create an instance of {@link ValidacionResponse }
     * 
     */
    public ValidacionResponse createValidacionResponse() {
        return new ValidacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "validacion")
    public JAXBElement<Validacion> createValidacion(Validacion value) {
        return new JAXBElement<Validacion>(_Validacion_QNAME, Validacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "validacionResponse")
    public JAXBElement<ValidacionResponse> createValidacionResponse(ValidacionResponse value) {
        return new JAXBElement<ValidacionResponse>(_ValidacionResponse_QNAME, ValidacionResponse.class, null, value);
    }

}
