package com.login
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import internal.GlobalVariable


class Login {
	/**
	 * Login to application external user
	 * @param applicationURL
	 * @param username
	 * @param password
	 */
	@Keyword
	def static void loginIntoApplicationExternal(String applicationURL,String username,String password) {
		def a
		def b
		WebUI.openBrowser(applicationURL)
		WebUI.verifyElementPresent(findTestObject('OR_OsC/OsC_external_login/external_Login_username'), 10)
		WebUI.setText(findTestObject('OR_OsC/OsC_external_login/external_Login_username'), username)
		WebUI.verifyElementPresent(findTestObject('OR_OsC/OsC_external_login/external_Login_password'), 10)
		WebUI.setText(findTestObject('OR_OsC/OsC_external_login/external_Login_password'), password)
		WebUI.delay(5)
		WebUI.click(findTestObject('OR_OsC/OsC_external_login/btn_login'))
		WebUI.delay(1)
	}

	/**
	 * Login to application Internal user
	 * @param applicationURL
	 * @param username
	 * @param password
	 */
	@Keyword
	def static void loginIntoApplicationInternal(String applicationURL,String authPath) {

		WebUI.openBrowser(applicationURL)
		Thread.sleep(1000)

		Runtime.getRuntime().exec(authPath)
	}
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
}