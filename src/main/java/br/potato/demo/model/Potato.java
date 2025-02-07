package br.potato.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name="potato")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Potato {

    //@Id
    //private Long id;

    //@Column(name="name")
    private String name;
}
