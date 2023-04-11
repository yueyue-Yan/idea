package com.work.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Value implements Serializable {
    String id;
    String value;
    String text;
    int orderNo;
    String typeCode;
    Type type;



}







