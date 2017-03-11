package app;

import controller.Controller;
import controller.SumController;
import model.Generator;

import java.util.ArrayList;

/**
 * Created by WinHan on 11/3/17.
 */
public class App {

    public static void main(String[] args){

        String numbers = "385";

        String[] numbersList = numbers.split("(?<=.)");
        ArrayList<Generator> generators = new ArrayList<>();


        for(String number: numbersList){
            Generator generator = new Generator(Integer.parseInt(number));
            generators.add(generator);
        }

        Controller sumController = new SumController();
        System.out.println( sumController.calculate(generators));

    }
}
