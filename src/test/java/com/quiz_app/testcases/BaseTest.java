package com.quiz_app.testcases;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public static AppiumDriverLocalService server;
	public static final Logger log = LogManager.getLogger(BaseTest.class);

	public static void setInstance() {
		HashMap<String, String> env = new HashMap<String, String>(System.getenv());
		env.put("ANDROID_HOME", "C:\\Users\\Lenovo\\AppData\\Local\\Android\\Sdk");
		env.put("JAVA_HOME", "C:\\Program Files\\Java\\jdk-17");
		String nodeJSPath = "C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
		String nodeExePath = "C:\\Program Files\\nodejs\\node.exe";

		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		builder.withAppiumJS(new File(nodeJSPath)).usingDriverExecutable(new File(nodeExePath))
				.withIPAddress("127.0.0.1").usingPort(4723).withEnvironment(env).withTimeout(Duration.ofSeconds(300));

		server = AppiumDriverLocalService.buildService(builder);
	}

	public static AppiumDriverLocalService getInstance() {
		if (server == null) {
			setInstance();
		}
		return server;
	}

	@BeforeSuite
	public static void startAppiumServer() {
		getInstance().start();
		log.info("appium server started");
		log.info("URl: " + server.getUrl());
		log.info("is server running: " + server.isRunning());
	}

	@BeforeTest
	public void setUp() throws Exception {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setCapability("automationName", "UIAutomator2");
		options.setCapability("avd", "Pixel_7_API_31");
		options.setCapability("deviceName", "Pixel 7 API 31");
	//	options.setCapability("appPackage",
	//			"com.example.quiz_app_riverpod");
	//	options.setCapability("appActivity", "com.example.quiz_app_riverpod.MainActivity");
		options.setCapability("app", "build/app/outputs/flutter-apk/app-debug.apk");
	//	options.setCapability("app", "C:\\Users\\Lenovo\\Downloads\\quiz flutter app.apk");
		options.setCapability("settings[ignoreUnimportantViews]", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		log.info("Application started successfully");
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterSuite
	public void stopAppiumServer() {
		if (server != null) {
			getInstance().stop();
		}
		log.info("appium server stopped");
	}
}
