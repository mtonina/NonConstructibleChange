package com.marcostonina.nonconstructiblechange.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCurrencyService {

    @Test
    public void testGetNonConstructibleChange(){

        int[] coins = {1,1,2,3,5,7,22};

        CurrencyService currencyService = new CurrencyService();
        int minChange = currencyService.getNonConstructibleChange(coins);
        assertEquals(20, minChange);

    }
    @Test
    public void testGetNonConstructibleChange_case2(){

        int[] coins = {1, 5, 1, 1, 1, 10, 15, 20, 100};

        CurrencyService currencyService = new CurrencyService();
        int minChange = currencyService.getNonConstructibleChange(coins);
        assertEquals(55, minChange);

    }
    @Test
    public void testGetNonConstructibleChange_case3(){

        int[] coins = {87};

        CurrencyService currencyService = new CurrencyService();
        int minChange = currencyService.getNonConstructibleChange(coins);
        assertEquals(1, minChange);

    }
    @Test
    public void testGetNonConstructibleChange_case4(){

        int[] coins = {1};

        CurrencyService currencyService = new CurrencyService();
        int minChange = currencyService.getNonConstructibleChange(coins);
        assertEquals(2, minChange);

    }
}