import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GremlimTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Gremlim gremlim = new Gremlim(60, "Fred", true,true);
        if(gremlim.isMolhado() == true){
            Gremlim gremlimClone = gremlim.clone();
            gremlimClone.setAltura(68);
            gremlimClone.setNome("Jorge");
            gremlimClone.setBagunceiro(true);
            gremlimClone.setMolhado(false);

            assertEquals("Gremlim {Altura=60.0, Nome=Fred, Bagunceiro=true, Molhado=true}",
                    gremlim.toString());
            assertEquals("Gremlim {Altura=68.0, Nome=Jorge, Bagunceiro=true, Molhado=false}",
                    gremlimClone.toString());

        }
    }

}