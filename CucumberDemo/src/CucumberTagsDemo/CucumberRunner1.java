package CucumberTagsDemo;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(tags={"@Sanity"})
public class CucumberRunner1 
{

}
