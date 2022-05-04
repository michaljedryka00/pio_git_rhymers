package edu.kis.vh.nursery;


/**
 * klasa FIFORhymer rozszerza klasę DefaultCountingOutRhymer.
 * klasa posiada atrybut temp będacy instancją klasy DefaultCountingOutRhymer.
 * element przejmuje atrybuty i metody z rozszerzanej klasy.
 * metoda countOut jest zmieniona względem rozszerzanej klasy (annotacja @Override)
 * działanie metody countOut: wczytanie liczb do temp w petli while wykonujacej sie do momentu wyczerpania sie liczb,
 * zapisanie do zmiennej ret ostatnio wczytanej do temp liczby za pomocą metody countOut z klasy DefaultCountingOutRhymer,
 * zapisanie pozostałych liczb z powrotem do momentu wyczerpania sie liczb
 * wartoscia zwracana jest ret - ostatnia wczytana liczba
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
//brak setterow w klasach (?)