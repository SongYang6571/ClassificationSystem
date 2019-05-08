package com.classification.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import javax.persistence.*;

@Entity
@Table(name="api",schema="root")
@Data
@NoArgsConstructor
@Mapper
public class Api {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String label;
    private Integer item;
    private String description;

    public Api(String label, Integer item, String description) {
        this.label = label;
        this.item = item;
        this.description = description;
    }
}
