package vn.com.cqrs.models;

import lombok.Data;

@Data
public class Logging {

    private String id;
    private String createdBy;
    private String createdDt;
    private String message;
    private String lever;
    private String event;
}
