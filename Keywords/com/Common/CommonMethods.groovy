package com.Common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import internal.GlobalVariable
import com.github.javafaker.Faker as Faker

public class CommonMethods {

	Faker faker = new Faker()

	/**
	 * EmployeeID generator
	 *
	 */
	@Keyword
	def getEmployeeId(){
		String empID = faker.regexify("[1-9][1-9]+[1-99]")
		return empID
	}

	/**
	 * FirstName generator
	 *
	 */
	@Keyword
	def getFirstName(){
		String fName = faker.name().firstName()
		return fName
	}
	/**
	 * LastName generator
	 *
	 */
	@Keyword
	def getLastName(){
		String lName = faker.name().lastName()
		return lName
	}
	/**
	 * Random date generator
	 *
	 */
	@Keyword
	public static String getDateStringForDateBefore(String format="dd MMM yyy"){
		int maxDayDifference=20000
		LocalDate date=LocalDate.now()
		Random rand = new Random()
		int days = rand.nextInt(maxDayDifference)
		System.out.println('days :: ' + days)
		LocalDate randomDate=date.minusDays(10000+days)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		String formattedDateTime = randomDate.format(formatter);
		return formattedDateTime
	}
	/**
	 * Email address generator
	 *
	 */
	@Keyword
	def getEmailAddress(){
		((firstName + '.') + lastName) + '@vistraqatest.com'
	}
}
