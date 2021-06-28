package com.company.Assignment_7;

import com.company.Assignment_7.Cycle_module.Bicycle;
import com.company.Assignment_7.Cycle_module.Cycle;
import com.company.Assignment_7.Cycle_module.Tricycle;
import com.company.Assignment_7.Cycle_module.Unicycle;
import com.company.Assignment_7.Interface_Example.Implementation;
import com.company.Assignment_7.Rodent.Gerbil;
import com.company.Assignment_7.Rodent.Hamster;
import com.company.Assignment_7.Rodent.Mouse;
import com.company.Assignment_7.Rodent.Rodent;

public class Driver {
    public static void main(String[]args) {
        int n = 3;
        Rodent[] rodents = new Rodent[n];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        rodents[0].description();
        rodents[1].description();
        rodents[2].description();

        Cycle[] cycles = new Cycle[n];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();

        Implementation imp = new Implementation();
        imp.implementation_Isample1(imp);
        imp.implementation_Isample2(imp);
        imp.implementation_Isample3(imp);
        imp.combined();
        imp.implementation_Icombinedof3(imp);


        First_InOut f_O = new First_InOut();
        First_InOut.InnerClass f_I = f_O.new InnerClass("Inner");
        Second_InOut s_O = new Second_InOut();
        Second_InOut.Second_Inner s_I = s_O.new Second_Inner("second Inner");
    }
}
