/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.webapp;

import javax.jws.WebService;

/**
 *
 * @author jgreen
 */
@WebService(targetNamespace = "http://www.example.net/2013-11-20",
        name = "SoapService",
        portName = "SoapServicePort",
        serviceName = "SoapService")
public class SoapService extends SoapBaseClass {

    public String helloWorld() {
        return "Hello, world";
    }
}
