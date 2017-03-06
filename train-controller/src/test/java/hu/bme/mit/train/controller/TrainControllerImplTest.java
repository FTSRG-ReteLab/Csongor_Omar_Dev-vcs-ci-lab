package hu.bme.mit.train.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TrainControllerImplTest {

    TrainControllerImpl controller;

    @Before
    public void before() {
        controller = new TrainControllerImpl();
    }

    @Test
    public void getSpeedLimit() throws Exception {
        Assert.assertEquals(500, controller.getSpeedLimit());
    }

}