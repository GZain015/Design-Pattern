/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asgn2;

/**
 *
 * @author Zain
 */
public class Request {
    private String requestId;
    private String requestType;
    private String requestData;

    public Request(String requestId, String requestType, String requestData) {
        this.requestId = requestId;
        this.requestType = requestType;
        this.requestData = requestData;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getRequestData() {
        return requestData;
    }

    @Override
    public String toString() {
        return "Request [ID: " + requestId + ", Type: " + requestType + ", Data: " + requestData + "]";
    }
}
