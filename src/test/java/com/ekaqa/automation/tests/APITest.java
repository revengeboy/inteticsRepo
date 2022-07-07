package com.ekaqa.automation.tests;

import com.ekaqa.automation.constatnts.UrlConstants;
import com.ekaqa.automation.steps.APISteps;
import org.testng.annotations.Test;

public class APITest {

    @Test
    public void getRequest() {
        APISteps.sendGetRequest(UrlConstants.BASE_URL, UrlConstants.URL_PART, UrlConstants.STATUS_CODE_200);
    }

    @Test
    public void postRequest() {
        APISteps.sendPostRequest(UrlConstants.BASE_URL, UrlConstants.URL_PART, UrlConstants.REQUEST_BODY, UrlConstants.STATUS_CODE_201);
    }
}
