package ru.ermolov;

import ru.ermolov.model.Identification;
import ru.ermolov.model.IdentificationBuilder;

import static ru.ermolov.model.Identification.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Identification i = new Identification("qwe", "ew", "sdf");
        IdentificationBuilder ib = new IdentificationBuilder();
        System.out.println(ib.a("qwe1").b(1).build());
        System.out.println(i.toString());
    }
}
