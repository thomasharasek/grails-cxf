package org.grails.cxf.test.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-07-26T15:19:18.214-04:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "http://customerservice.example.com/", name = "CustomerService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCustomersByName", targetNamespace = "http://customerservice.example.com/", className = "org.grails.cxf.soap.GetCustomersByName")
    @WebMethod
    @ResponseWrapper(localName = "getCustomersByNameResponse", targetNamespace = "http://customerservice.example.com/", className = "org.grails.cxf.soap.GetCustomersByNameResponse")
    public java.util.List<Customer> getCustomersByName(@WebParam(name = "name", targetNamespace = "") String name) throws NoSuchCustomerException;
}
