import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*CustomKeywords.'com.OsC.Login.loginIntoApplicationInternal'(GlobalVariable.internalUrl, GlobalVariable.autoit_authDetails)
WebUI.delay(20)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR_OsC/Dashboard/span_OverseasConnect'), 30)
WebUI.delay(10)*/
println('launch payroll with payroll name :  ' + GlobalVariable.payrollDefName)

WebUI.navigateToUrl('https://osc-stg.vistra.com/web/#/company/596/entity/1893/overview')

WebUI.delay(10)

WebUI.click(findTestObject('OR_OsC/Dashboard/li_PAYROLL'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('OR_OsC/Payroll/launchPayroll'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OR_OsC/Payroll/launchPayroll'))

WebUI.callTestCase(findTestCase('OsC/TC06_OsC_Payroll_Add Employee'), [:], FailureHandling.STOP_ON_FAILURE)

