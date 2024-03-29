package com.work.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type implements Serializable {
    String code;
    String name;
    String description;
//    List<Value> values;
}
