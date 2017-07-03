package mii.marke.cucumber.stepdefs;

import mii.marke.MarkeApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MarkeApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
