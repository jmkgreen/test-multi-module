/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.webapp;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;

/**
 *
 * @author jgreen
 */
public class SoapBaseClass {
    @Resource
    protected WebServiceContext context;

}
