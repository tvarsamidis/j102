package gr.codehub.j101;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;

//    @Override
//    protected void finalize(){
//        System.out.println("object deleted");
//    }

}
