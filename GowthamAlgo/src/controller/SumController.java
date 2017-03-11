package controller;

import model.Generator;

import java.util.List;


public class SumController implements Controller {

    private int total;

    @Override
    public int calculate(List<Generator> generators) {
        total = 0;
       for(Generator generator:generators){
           total =total + generator.getNumber();
       }
       return total;
    }
}
