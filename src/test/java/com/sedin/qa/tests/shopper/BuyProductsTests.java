package com.sedin.qa.tests.shopper;

import com.sedin.qa.tests.BaseTest;
import org.testng.annotations.Test;

public class BuyProductsTests extends BaseTest {
    @Test(groups = RequiresUserCreation)
    public void checkAddToCart(){
        System.out.println("test: check if add to cart works");
    }
}
