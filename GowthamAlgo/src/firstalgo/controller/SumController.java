package firstalgo.controller;

import firstalgo.model.Generator;

import java.util.ArrayList;
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

    @Override
    public List<Generator> split(String numbers) {

        String[] numbersList = numbers.split("(?<=.)");
        ArrayList<Generator> generators = new ArrayList<>();
        for(String number: numbersList){
            Generator generator = new Generator(Integer.parseInt(number));
            generators.add(generator);
        }
        return generators;
    }

}
