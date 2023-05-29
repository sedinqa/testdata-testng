package com.sedin.qa.tests;

import com.sedin.qa.testdata.global.GlobalDataManager;
import com.sedin.qa.testdata.user.User;
import com.sedin.qa.testdata.user.UserManager;
import org.testng.ITestContext;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public static final String RequiresUserCreation="RequiresUserCreation";

    @BeforeGroups(RequiresUserCreation)
    public void createUser(ITestContext testContext){
        User user=UserManager.get().createUser();
        testContext.setAttribute("user",user);
    }
    @AfterGroups(RequiresUserCreation)
    public void deleteUser(ITestContext testContext){
        UserManager.get().deleteUser((User) testContext.getAttribute("user"));
    }
    @BeforeSuite
    public void globalDataSetup(){
        GlobalDataManager.get().setup();
    }
    @AfterSuite
    public void globalDataTEarDown(){
        GlobalDataManager.get().teardown();
    }
}
