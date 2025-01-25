package lld.src.main.java.org.lokeshdarla.designpatterns.decorator;

import org.lokeshdarla.designpatterns.decorator.addons.ChocoChips;
import org.lokeshdarla.designpatterns.decorator.addons.ChocoSyrup;
import org.lokeshdarla.designpatterns.decorator.addons.VanillaScoop;
import org.lokeshdarla.designpatterns.decorator.baseaddons.OrangeCone;
import org.lokeshdarla.designpatterns.decorator.baseaddons.VanillaCone;

public class Client {
        public static void main(String[] args) {
                IceCream iceCream = new OrangeCone(
                                new ChocoSyrup(
                                                new VanillaCone(
                                                                new VanillaScoop(
                                                                                new VanillaScoop(
                                                                                                new ChocoChips(
                                                                                                                new ChocoSyrup()))))));

                System.out.println(iceCream.getCost());
                System.out.println(iceCream.getDescription());
        }
}
