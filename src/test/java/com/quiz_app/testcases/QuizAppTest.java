package com.quiz_app.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.quiz_app.pageObjectModel.MathQuiz;
import com.quiz_app.pageObjectModel.ScienceQuiz;

public class QuizAppTest extends BaseTest {
	public static final Logger log = LogManager.getLogger(QuizAppTest.class);

	@Test(priority = 1)
	public void verifyMathQuiz() throws InterruptedException {
		int count = 0;
		MathQuiz mq = new MathQuiz(driver);
		String name = mq.checkUsername().getAttribute("content-desc");
		Assert.assertEquals(name, "Hii Pamela", "Invalid name");
		log.info(name + " username found");
		Thread.sleep(2000);
		mq.clickOnMathQuizSection().click();
		log.info("clicked on math section quiz");
		Thread.sleep(2000);

		mq.clickOnFirstQuestionOption().click();
		log.info("clicked on first question option");
		Thread.sleep(2000);

		if (mq.clickOnFirstQuestionOption().getAttribute("content-desc").equals("false")) {
			count++;
		}

		String explanation_for_question_first = mq.checkExplanationForQuestionOne().getAttribute("content-desc");
		Assert.assertEquals(explanation_for_question_first,
				"Distance is a Scalar quantity because we couldn't consider direction",
				"Invalid explanation for question one");

		mq.clickOnNextButton().click();
		log.info("clicked on next button");
		Thread.sleep(2000);

		mq.clickOnSecondQuestionOption().click();
		log.info("clicked on second question option");
		Thread.sleep(2000);

		if (mq.clickOnSecondQuestionOption().getAttribute("content-desc")
				.equals("when moving body changes its direction")) {
			count++;
		}

		String explanation_for_question_second = mq.checkExplanationForQuestionTwo().getAttribute("content-desc");
		Assert.assertEquals(explanation_for_question_second,
				"Force can be defined as an external effort in the form of push or pull which: (i) Produces or tries to produce motion in a resting body (ii) Stops or tries to stop a moving body (iii) Changes or tries to change the direction of motion of the body",
				"Invalid explanation for question two");

		mq.clickOnNextButton().click();
		log.info("clicked on next button");
		Thread.sleep(2000);

		System.out.println(count);
		String newCount = String.valueOf(count);

		int maxRetries = 3;
		int retryCount = 0;

		while (retryCount < maxRetries) {
			try {
				if (newCount.equals("0") || newCount.equals("1")) {
					String gradeD_check = mq.checkGradeD().getAttribute("content-desc");
					log.info(gradeD_check);
					Assert.assertEquals(gradeD_check.startsWith("D"), true, "Invalid grade");
				} else if (newCount.equals("2")) {
					String gradeA_check = mq.checkGradeA().getAttribute("content-desc");
					log.info(gradeA_check);
					Assert.assertEquals(gradeA_check.startsWith("A"), true, "Invalid grade");
				} else {
					log.info("Incorrect grade");
				}
				break;
			} catch (NoSuchElementException e) {
				// Handle the exception or log it
				log.info("Element not found. Retrying...");
				retryCount++;
			}
		}

		int maxRetries1 = 3;
		int retryCount1 = 0;

		while (retryCount1 < maxRetries1) {
			try {
				if (newCount.equals("0")) {
					String gradeDPercent_check = mq.checkGradeDPercent().getAttribute("content-desc");
					log.info(gradeDPercent_check);
					Assert.assertEquals(gradeDPercent_check, "0%", "Invalid grade");
				} else if (newCount.equals("1")) {
					String gradeDPercent_check = mq.checkGradeDPercent().getAttribute("content-desc");
					log.info(gradeDPercent_check);
					Assert.assertEquals(gradeDPercent_check, "25%", "Invalid grade");
				} else if (newCount.equals("2")) {
					String gradeAPercent_check = mq.checkGradeAPercent().getAttribute("content-desc");
					log.info(gradeAPercent_check);
					Assert.assertEquals(gradeAPercent_check, "50%", "Invalid grade");
				} else {
					log.info("Incorrect grade percent");
				}
				break;
			} catch (NoSuchElementException e) {
				// Handle the exception or log it
				log.info("Element not found. Retrying...");
				retryCount1++;
			}
		}

		if (newCount.equals("0")) {
			String correct_answer0 = mq.checkCorrectAnswers0().getAttribute("content-desc");
			log.info(correct_answer0 + " checked solved correct answers");
			Assert.assertEquals(correct_answer0, newCount, "Invalid correct answer number");
		} else if (newCount.equals("1")) {
			String correct_answer1 = mq.checkCorrectAnswers1().getAttribute("content-desc");
			log.info(correct_answer1 + " checked solved correct answers");
			Assert.assertEquals(correct_answer1, newCount, "Invalid correct answer number");
		} else if (newCount.equals("2")) {
			String correct_answer2 = mq.checkCorrectAnswers2().getAttribute("content-desc");
			log.info(correct_answer2 + " checked solved correct answers");
			Assert.assertEquals(correct_answer2, newCount, "Invalid correct answer number");
		} else {
			log.info("Incorrect correct answer number");
		}

		String solved_questions = mq.checkSolvedQuestions().getAttribute("content-desc");
		log.info(solved_questions + " checked solved questions");
		Assert.assertEquals(solved_questions, "2", "Invalid solved question number");

		mq.clickOnHomeButton().click();
		log.info("clicked on go to home button");
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void verifyScienceQuiz() throws InterruptedException {
		int count = 0;
		ScienceQuiz mq = new ScienceQuiz(driver);
		String name = mq.checkUsername().getAttribute("content-desc");
		Assert.assertEquals(name, "Hii Pamela", "Invalid name");

		Thread.sleep(2000);
		mq.clickOnScienceQuizSection().click();
		log.info("clicked on science section quiz");
		Thread.sleep(2000);

		mq.clickOnFirstQuestionOption().click();
		log.info("clicked on first question option");
		Thread.sleep(2000);

		if (mq.clickOnFirstQuestionOption().getAttribute("content-desc").equals("Scalar")) {
			count++;
		}

		String explanation_for_question_first = mq.checkExplanationForQuestionOne().getAttribute("content-desc");
		Assert.assertEquals(explanation_for_question_first,
				"Distance is a Scalar quantity because we couldn't consider direction",
				"Invalid explanation for question one");

		mq.clickOnNextButton().click();
		log.info("clicked on next button");
		Thread.sleep(2000);

		mq.clickOnSecondQuestionOption().click();
		log.info("clicked on second question option");
		Thread.sleep(2000);

		if (mq.clickOnSecondQuestionOption().getAttribute("content-desc").equals("when a body at rest starts moving")) {
			count++;
		}

		String explanation_for_question_second = mq.checkExplanationForQuestionTwo().getAttribute("content-desc");
		Assert.assertEquals(explanation_for_question_second,
				"Force can be defined as an external effort in the form of push or pull which: (i) Produces or tries to produce motion in a resting body (ii) Stops or tries to stop a moving body (iii) Changes or tries to change the direction of motion of the body",
				"Invalid explanation for question two");

		mq.clickOnNextButton().click();
		log.info("clicked on next button");
		Thread.sleep(2000);

		mq.clickOnthirdQuestionOption().click();
		log.info("clicked on third question option");
		Thread.sleep(2000);

		if (mq.clickOnthirdQuestionOption().getAttribute("content-desc")
				.equals("when moving body changes its direction")) {
			count++;
		}

		String explanation_for_question_third = mq.checkExplanationForQuestionThree().getAttribute("content-desc");
		Assert.assertEquals(explanation_for_question_third,
				"Force can be defined as an external effort in the form of push or pull which: (i) Produces or tries to produce motion in a resting body (ii) Stops or tries to stop a moving body (iii) Changes or tries to change the direction of motion of the body",
				"Invalid explanation for question two");

		mq.clickOnNextButton().click();
		log.info("clicked on next button");
		Thread.sleep(2000);

		System.out.println(count);
		String newCount = String.valueOf(count);

		int maxRetries = 3;
		int retryCount = 0;

		while (retryCount < maxRetries) {
			try {
				if (newCount.equals("0") || newCount.equals("1")) {
					String gradeD_check = mq.checkGradeD().getAttribute("content-desc");
					log.info(gradeD_check);
					Assert.assertEquals(gradeD_check.startsWith("D"), true, "Invalid grade");
				} else if (newCount.equals("2")) {
					String gradeB_check = mq.checkGradeB().getAttribute("content-desc");
					log.info(gradeB_check);
					Assert.assertEquals(gradeB_check.startsWith("B"), true, "Invalid grade");
				} else if (newCount.equals("3")) {
					String gradeA_check = mq.checkGradeA().getAttribute("content-desc");
					log.info(gradeA_check);
					Assert.assertEquals(gradeA_check.startsWith("A"), true, "Invalid grade");
				} else {
					log.info("Incorrect grade");
				}
				break;
			} catch (NoSuchElementException e) {
				// Handle the exception or log it
				log.info("Element not found. Retrying...");
				retryCount++;
			}
		}

		int maxRetries1 = 3;
		int retryCount1 = 0;

		while (retryCount1 < maxRetries1) {
			try {
				if (newCount.equals("0")) {
					String gradeDPercent_check = mq.checkGradeDPercent().getAttribute("content-desc");
					log.info(gradeDPercent_check);
					Assert.assertEquals(gradeDPercent_check, "0%", "Invalid grade");
				} else if (newCount.equals("1")) {
					String gradeDPercent_check = mq.checkGradeDPercent().getAttribute("content-desc");
					log.info(gradeDPercent_check);
					Assert.assertEquals(gradeDPercent_check, "25%", "Invalid grade");
				} else if (newCount.equals("2")) {
					String gradeBPercent_check = mq.checkGradeBPercent().getAttribute("content-desc");
					log.info(gradeBPercent_check);
					Assert.assertEquals(gradeBPercent_check, "50%", "Invalid grade");
				} else if (newCount.equals("3")) {
					String gradeAPercent_check = mq.checkGradeAPercent().getAttribute("content-desc");
					log.info(gradeAPercent_check);
					Assert.assertEquals(gradeAPercent_check, "75%", "Invalid grade");
				} else {
					log.info("Incorrect grade percent");
				}
				break;
			} catch (NoSuchElementException e) {
				// Handle the exception or log it
				log.info("Element not found. Retrying...");
				retryCount1++;
			}
		}

		if (newCount.equals("0")) {
			String correct_answer0 = mq.checkCorrectAnswers0().getAttribute("content-desc");
			log.info(correct_answer0 + " checked solved correct answers");
			Assert.assertEquals(correct_answer0, newCount, "Invalid correct answer number");
		} else if (newCount.equals("1")) {
			String correct_answer1 = mq.checkCorrectAnswers1().getAttribute("content-desc");
			log.info(correct_answer1 + " checked solved correct answers");
			Assert.assertEquals(correct_answer1, newCount, "Invalid correct answer number");
		} else if (newCount.equals("2")) {
			String correct_answer2 = mq.checkCorrectAnswers2().getAttribute("content-desc");
			log.info(correct_answer2 + " checked solved correct answers");
			Assert.assertEquals(correct_answer2, newCount, "Invalid correct answer number");
		} else if (newCount.equals("3")) {
			String correct_answer3 = mq.checkCorrectAnswers3().getAttribute("content-desc");
			log.info(correct_answer3 + " checked solved correct answers");
			Assert.assertEquals(correct_answer3, newCount, "Invalid correct answer number");
		} else {
			log.info("Incorrect correct answer number");
		}

		String solved_questions = mq.checkSolvedQuestions().getAttribute("content-desc");
		log.info(solved_questions + " checked solved questions");
		Assert.assertEquals(solved_questions, "3", "Invalid solved question number");

		mq.clickOnHomeButton().click();
		log.info("clicked on go to home button");
		Thread.sleep(2000);
	}
}
