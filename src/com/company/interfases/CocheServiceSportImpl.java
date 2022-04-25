package com.company.interfases;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfases.CocheService;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
