package com.quiz_app.pageObjectModel;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class ScienceQuiz {
	public WebDriver driver;
	private By username = AppiumBy.xpath("//android.view.View[@content-desc=\"Hii Pamela\"]");
	private By scienceQuizSection = AppiumBy.androidUIAutomator("new UiSelector().index(3)");

	String firstQuestionOptions[] = { "Scalar", "Vector", "Both a and b", "None of Above" };
	Random random = new Random();

	// Generate a random index within the array's bounds
	int randomIndex = random.nextInt(firstQuestionOptions.length);

	// Retrieve the randomly selected string
	String randomfirstQuestionOption = firstQuestionOptions[randomIndex];

	private By first_question_option = AppiumBy.accessibilityId(randomfirstQuestionOption);

	private By scalarOption = AppiumBy.accessibilityId("Scalar");
	private By vectorOption = AppiumBy.accessibilityId("Vector");
	private By bothAandBOption = AppiumBy.accessibilityId("Both a and b");
	private By noneOfAboveOption = AppiumBy.accessibilityId("None of Above");

	private By nextButton = AppiumBy.accessibilityId("NEXT");
	private By explanation_for_question_one = AppiumBy
			.accessibilityId("Distance is a Scalar quantity because we couldn't consider direction");

	String secondQuestionOptions[] = { "when a body at rest starts moving", "when a moving body stops",
			"when moving body changes its direction", "All of the above" };

	// Generate a random index within the array's bounds
	int randomIndex1 = random.nextInt(secondQuestionOptions.length);

	// Retrieve the randomly selected string
	String randomSecondQuestionOption = secondQuestionOptions[randomIndex1];
	private By second_question_option = AppiumBy.accessibilityId(randomSecondQuestionOption);

	private By firstOptionOfSecondQuestion = AppiumBy.accessibilityId("when a body at rest starts moving");
	private By secondOptionOfSecondQuestion = AppiumBy.accessibilityId("when a moving body stops");
	private By thirdOptionOfSecondQuestion = AppiumBy.accessibilityId("when moving body changes its direction");
	private By fourthOptionOfSecondQuestion = AppiumBy.accessibilityId("All of the above");
	private By explanation_for_question_two = AppiumBy.accessibilityId(
			"Force can be defined as an external effort in the form of push or pull which: (i) Produces or tries to produce motion in a resting body (ii) Stops or tries to stop a moving body (iii) Changes or tries to change the direction of motion of the body");

	String thirdQuestionOptions[] = { "when a body at rest starts moving", "when a moving body stops",
			"when moving body changes its direction", "All of the above" };

	// Generate a random index within the array's bounds
	int randomIndex2 = random.nextInt(thirdQuestionOptions.length);

	// Retrieve the randomly selected string
	String randomThirdQuestionOption = thirdQuestionOptions[randomIndex2];
	private By third_question_option = AppiumBy.accessibilityId(randomThirdQuestionOption);

	private By firstOptionOfThirdQuestion = AppiumBy.accessibilityId("when a body at rest starts moving");
	private By secondOptionOfThirdQuestion = AppiumBy.accessibilityId("when a moving body stops");
	private By thirdOptionOfThirdQuestion = AppiumBy.accessibilityId("when moving body changes its direction");
	private By fourthOptionOfThirdQuestion = AppiumBy.accessibilityId("All of the above");
	private By explanation_for_question_three = AppiumBy.accessibilityId(
			"Force can be defined as an external effort in the form of push or pull which: (i) Produces or tries to produce motion in a resting body (ii) Stops or tries to stop a moving body (iii) Changes or tries to change the direction of motion of the body");
	private By gradeD = AppiumBy.androidUIAutomator("new UiSelector().index(2)");
	private By gradeB = AppiumBy.androidUIAutomator("new UiSelector().index(2)");
	private By gradeA = AppiumBy.androidUIAutomator("new UiSelector().index(2)");

	private By gradeDPercent = AppiumBy.androidUIAutomator("new UiSelector().index(6)");
	private By gradeBPercent = AppiumBy.androidUIAutomator("new UiSelector().index(6)");
	private By gradeAPercent = AppiumBy.androidUIAutomator("new UiSelector().index(6)");

	private By solved_questions = AppiumBy.accessibilityId("3");
	private By correct_answer0 = AppiumBy.accessibilityId("0");
	private By correct_answer1 = AppiumBy.accessibilityId("1");
	private By correct_answer2 = AppiumBy.accessibilityId("2");
	private By correct_answer3 = AppiumBy.accessibilityId("3");
	private By homeButton = AppiumBy.accessibilityId("Go to Home Screen");

	public ScienceQuiz(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement checkUsername() {
		return driver.findElement(username);
	}

	public WebElement clickOnScienceQuizSection() {
		return driver.findElement(scienceQuizSection);
	}

	public WebElement clickOnFirstQuestionOption() {
		return driver.findElement(first_question_option);
	}

	public WebElement clickOnScalarOption() {
		return driver.findElement(scalarOption);
	}

	public WebElement clickOnVectorOption() {
		return driver.findElement(vectorOption);
	}

	public WebElement clickOnBothAandBOption() {
		return driver.findElement(bothAandBOption);
	}

	public WebElement clickOnNoneOfAboveOption() {
		return driver.findElement(noneOfAboveOption);
	}

	public WebElement clickOnNextButton() {
		return driver.findElement(nextButton);
	}

	public WebElement clickOnSecondQuestionOption() {
		return driver.findElement(second_question_option);
	}

	public WebElement checkExplanationForQuestionOne() {
		return driver.findElement(explanation_for_question_one);
	}

	public WebElement clickOnthirdQuestionOption() {
		return driver.findElement(third_question_option);
	}

	public WebElement clickOnFirstOptionOfSecondQuestion() {
		return driver.findElement(firstOptionOfSecondQuestion);
	}

	public WebElement clickOnSecondOptionOfSecondQuestion() {
		return driver.findElement(secondOptionOfSecondQuestion);
	}

	public WebElement clickOnThirdOptionOfSecondQuestion() {
		return driver.findElement(thirdOptionOfSecondQuestion);
	}

	public WebElement clickOnFourthOptionOfSecondQuestion() {
		return driver.findElement(fourthOptionOfSecondQuestion);
	}

	public WebElement checkExplanationForQuestionTwo() {
		return driver.findElement(explanation_for_question_two);
	}

	public WebElement clickOnFirstOptionOfThirdQuestion() {
		return driver.findElement(firstOptionOfThirdQuestion);
	}

	public WebElement clickOnSecondOptionOfThirdQuestion() {
		return driver.findElement(secondOptionOfThirdQuestion);
	}

	public WebElement clickOnThirdOptionOfThirdQuestion() {
		return driver.findElement(thirdOptionOfThirdQuestion);
	}

	public WebElement clickOnFourthOptionOfThirdQuestion() {
		return driver.findElement(fourthOptionOfThirdQuestion);
	}

	public WebElement checkExplanationForQuestionThree() {
		return driver.findElement(explanation_for_question_three);
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

	public WebElement checkCorrectAnswers3() {
		return driver.findElement(correct_answer3);
	}

	public WebElement checkGradeD() {
		return driver.findElement(gradeD);
	}

	public WebElement checkGradeB() {
		return driver.findElement(gradeB);
	}

	public WebElement checkGradeA() {
		return driver.findElement(gradeA);
	}

	public WebElement checkGradeDPercent() {
		return driver.findElement(gradeDPercent);
	}

	public WebElement checkGradeBPercent() {
		return driver.findElement(gradeBPercent);
	}

	public WebElement checkGradeAPercent() {
		return driver.findElement(gradeAPercent);
	}

	public WebElement clickOnHomeButton() {
		return driver.findElement(homeButton);
	}
}
