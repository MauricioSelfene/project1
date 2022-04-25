package com.company.interfases;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfases.CocheService;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        return new CocheElectrico();
    }
}
