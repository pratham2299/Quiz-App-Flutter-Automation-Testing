package com.quiz_app.pageObjectModel;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;

public class MathQuiz {
	public WebDriver driver;
	String firstQuestionOptions[] = { "true", "false" };
	Random random = new Random();

	// Generate a random index within the array's bounds
	int randomIndex = random.nextInt(firstQuestionOptions.length);

	// Retrieve the randomly selected string
	String randomfirstQuestionOption = firstQuestionOptions[randomIndex];

	private By username = AppiumBy.xpath("//android.view.View[@content-desc=\"Hii Pamela\"]");
	private By mathQuizSection = AppiumBy.androidUIAutomator("new UiSelector().index(2)");
	private By trueOption = AppiumBy.accessibilityId("true");
	private By firstQuestionOption = AppiumBy.accessibilityId(randomfirstQuestionOption);
	private By falseOption = AppiumBy.accessibilityId("false");
	private By explanation_for_question_one = AppiumBy
			.accessibilityId("Distance is a Scalar quantity because we couldn't consider direction");
	private By nextButton = AppiumBy.xpath("//android.widget.Button[@content-desc=\"NEXT\"]");

	String secondQuestionOptions[] = { "when a body at rest starts moving", "when a moving body stops",
			"when moving body changes its direction", "All of the above" };

	// Generate a random index within the array's bounds
	int randomIndex1 = random.nextInt(secondQuestionOptions.length);

	// Retrieve the randomly selected string
	String randomSecondQuestionOption = secondQuestionOptions[randomIndex1];

	private By secondQuestionOption = AppiumBy.accessibilityId(randomSecondQuestionOption);
	private By firstOption = AppiumBy.accessibilityId("when a body at rest starts moving");
	private By secondOption = AppiumBy.accessibilityId("when a moving body stops");
	private By thirdOption = AppiumBy.accessibilityId("when moving body changes its direction");
	private By fourthOption = AppiumBy.accessibilityId("All of the above");
	private By explanation_for_question_two = AppiumBy.accessibilityId(
			"Force can be defined as an external effort in the form of push or pull which: (i) Produces or tries to produce motion in a resting body (ii) Stops or tries to stop a moving body (iii) Changes or tries to change the direction of motion of the body");

	private By gradeD = AppiumBy.androidUIAutomator("new UiSelector().index(2)");
	private By gradeA = AppiumBy.androidUIAutomator("new UiSelector().index(2)");
	private By gradeDPercent = AppiumBy.androidUIAutomator("new UiSelector().index(6)");
	private By gradeAPercent = AppiumBy.androidUIAutomator("new UiSelector().index(6)");
	private By solved_questions = AppiumBy.accessibilityId("2");

	private By correct_answer0 = AppiumBy.accessibilityId("0");
	private By correct_answer1 = AppiumBy.accessibilityId("1");
	private By correct_answer2 = AppiumBy.accessibilityId("2");
	private By homeButton = AppiumBy.accessibilityId("Go to Home Screen");

	public MathQuiz(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement checkUsername() {
		return driver.findElement(username);
	}

	public WebElement clickOnMathQuizSection() {
		return driver.findElement(mathQuizSection);
	}

	public WebElement clickOnFirstQuestionOption() {
		return driver.findElement(firstQuestionOption);
	}

	public WebElement clickOnSecondQuestionOption() {
		return driver.findElement(secondQuestionOption);
	}

	public WebElement clickOnTrueOption() {
		return driver.findElement(trueOption);
	}

	public WebElement clickOnFalseOption() {
		return driver.findElement(falseOption);
	}

	public WebElement clickOnFirstOption() {
		return driver.findElement(firstOption);
	}

	public WebElement clickOnSecondOption() {
		return driver.findElement(secondOption);
	}

	public WebElement clickOnThirdOption() {
		return driver.findElement(thirdOption);
	}

	public WebElement clickOnFourthOption() {
		return driver.findElement(fourthOption);
	}

	public WebElement checkExplanationForQuestionOne() {
		return driver.findElement(explanation_for_question_one);
	}

	public WebElement checkExplanationForQuestionTwo() {
		return driver.findElement(explanation_for_question_two);
	}

	public WebElement clickOnNextButton() {
		return driver.findElement(nextButton);
	}

	public WebElement checkGradeD() {
		return driver.findElement(gradeD);
	}

	public WebElement checkGradeA() {
		return driver.findElement(gradeA);
	}
	
	public WebElement checkGradeDPercent() {
		return driver.findElement(gradeDPercent);
	}

	public WebElement checkGradeAPercent() {
		return driver.findElement(gradeAPercent);
	}

	public WebElement checkSolvedQuestions() {
		return driver.findElement(solved_questions);
	}

	public WebElement checkCorrectAnswers0() {
		return driver.findElement(correct_answer0);
	}

	public WebElement checkCorrectAnswers1() {
		return driver.findElement(correct_answer1);
	}

	public WebElement checkCorrectAnswers2() {
		return driver.findElement(correct_answer2);
	}

	public WebElement clickOnHomeButton() {
		return driver.findElement(homeButton);
	}
}