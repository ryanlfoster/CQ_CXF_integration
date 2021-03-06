package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2014-06-23T12:38:47.728+05:30
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "ConvertTemperatureHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ConvertTemperatureHttpGet {

    @WebResult(name = "double", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    @WebMethod(operationName = "ConvertTemp")
    public double convertTemp(
        @WebParam(partName = "Temperature", name = "Temperature", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String temperature,
        @WebParam(partName = "FromUnit", name = "FromUnit", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String fromUnit,
        @WebParam(partName = "ToUnit", name = "ToUnit", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String toUnit
    );
}
