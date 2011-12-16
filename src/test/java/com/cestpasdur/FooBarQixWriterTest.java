package com.cestpasdur;

import org.junit.Test;
import static com.cestpasdur.FooBarQixWriter.*;
import static org.fest.assertions.Assertions.assertThat;


public class FooBarQixWriterTest
{


    @Test
    public void estDivisiblePar(){
        assertThat(estDivisible(5, 5)).isTrue();
        assertThat(estDivisible(6, 5)).isFalse();
    }

    @Test
    public void contientTest(){
        assertThat(contient(33)).isEqualTo("FooFoo");
    }





    @Test
    public void estFoo(){
        assertThat(valueOf(6)).isEqualTo("Foo");
        assertThat(valueOf(3)).isEqualTo("FooFoo");
        assertThat(valueOf(33)).isEqualTo("FooFooFoo");
    }

    @Test
    public void estBar(){
        assertThat(valueOf(10)).isEqualTo("Bar");
        assertThat(valueOf(5)).isEqualTo("BarBar");
        assertThat(valueOf(55)).isEqualTo("BarBarBar");
    }

    @Test
    public void estQix(){
        assertThat(valueOf(14)).isEqualTo("Qix");
        assertThat(valueOf(7)).isEqualTo("QixQix");
        assertThat(valueOf(77)).isEqualTo("QixQixQix");
    }

    @Test
    public void verifieMultipleDansOrdre(){
        assertThat(valueOf(21)).isEqualTo("FooQix");
    }

    @Test
    public void verifieOrdreApparition(){
        assertThat(valueOf(53)).isEqualTo("BarFoo");
    }

    @Test
    public void verifieDivisionEtContenance(){
        assertThat(valueOf(15)).isEqualTo("FooBarBar");
    }


}
