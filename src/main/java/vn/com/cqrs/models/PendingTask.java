package vn.com.cqrs.models;

import lombok.Data;

@Data
public class PendingTask {
    private String id;
    private String createdBy;
    private String createdDt;
    private String amount;
    private String currency;
    private String sourceAccountNo;
    private String benAccountNo;
}
