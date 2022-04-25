package com.company.interfases;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfases.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo el coche");

    }
}
