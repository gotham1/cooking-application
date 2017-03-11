package firstalgo.controller;

import firstalgo.model.Generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    /**
     * Split the original numbers and map spliiterNumber and orginal Number into the amp
     * @param numbers
     * @return splitterMap
     */
    @Override
    public Map<Integer,List<Generator>> split(String numbers) {

        //to contain original numbers and split numbers
        Map<Integer,List<Generator>> splitterMap = new HashMap<>();

        String[] numbersList = numbers.split("(?<=.)");
        ArrayList<Generator> generators = new ArrayList<>();
        //getting split numbers
        for(String number: numbersList){
            Generator generator = new Generator(Integer.parseInt(number));
            generators.add(generator);
        }

        splitterMap.put(Integer.parseInt(numbers),generators);
        return splitterMap;
    }

}
