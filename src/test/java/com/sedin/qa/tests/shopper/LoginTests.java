package com.sedin.qa.tests.shopper;

import com.sedin.qa.tests.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test(groups = RequiresUserCreation)
    public void userIsAbleToLoginWithValidCredentials(){
        System.out.println("test: check if login works");
    }
}
