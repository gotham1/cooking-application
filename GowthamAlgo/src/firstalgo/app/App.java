package firstalgo.app;

import firstalgo.controller.Controller;
import firstalgo.controller.SumController;
import firstalgo.model.Generator;

import java.util.ArrayList;

/**
 * Created by WinHan on 11/3/17.
 */
public class App {

    public static void main(String[] args){

        String numbers = "385";

        Controller sumController = new SumController();
        sumController.split(numbers);


    }
}
