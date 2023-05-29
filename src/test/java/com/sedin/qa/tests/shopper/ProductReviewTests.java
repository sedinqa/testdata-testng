package com.sedin.qa.tests.shopper;

import com.sedin.qa.tests.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductReviewTests extends BaseTest {
    public static final String RequiresProductReviewWritten="RequiresProductReviewWritten";
    @BeforeMethod(onlyForGroups = RequiresProductReviewWritten)
    public void reviewCreator(){
        System.out.println("test data:create review for further test");
    }
    @Test(groups = RequiresUserCreation)
    public void writeReview(){
        System.out.println("test: check if user can write review");
    }
    @Test(groups = {RequiresUserCreation,RequiresProductReviewWritten})
    public void deleteReview(){
        System.out.println("test: check if user can delete review");
    }
}
