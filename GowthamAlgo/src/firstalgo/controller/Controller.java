package firstalgo.controller;

import firstalgo.model.Generator;

import java.util.List;
import java.util.Map;

/**
 * Created by WinHan on 11/3/17.
 */
public interface Controller {

    int calculate(List<Generator> generatorList);

    Map<Integer,List<Generator>> split(String numbers);
}
