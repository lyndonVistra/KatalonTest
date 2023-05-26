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

WebUI.waitForElementPresent(findTestObject('Object Repository/OR_OsC/Payroll/payrollselect_arrow'), 10)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/payrollselect_arrow'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR_OsC/Payroll/payrollselectsearch'), 10)

WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/payrollselectsearch'), 'TestAuto2')

WebUI.sendKeys(findTestObject('Object Repository/OR_OsC/Payroll/payrollselectsearch'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/OR_OsC/Payroll/payrollselectsearch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/btn_confirm'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/addEmployeeLink'))
WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('OR_OsC/Payroll/enablePayroll'))
WebUI.delay(5)
WebUI.check(findTestObject('OR_OsC/Payroll/enablePayroll'))
WebUI.delay(5)
WebUI.verifyElementVisible(findTestObject('OR_OsC/Payroll/enableExpenseReporting'))
WebUI.check(findTestObject('OR_OsC/Payroll/enableExpenseReporting'))
WebUI.delay(5)
WebUI.verifyElementVisible(findTestObject('OR_OsC/Payroll/selectExpenseApprover'))
WebUI.selectOptionByIndex(findTestObject('OR_OsC/Payroll/selectExpenseApprover'), 3)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/btn_saveEnablement'))

/* Personal Details*/
empFName = CustomKeywords.'com.Common.CommonMethods.getFirstName'()
empLName = CustomKeywords.'com.Common.CommonMethods.getLastName'()
empEmail = ((empFName + '.') + empLName) + '@vistraqatest.com'
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtFirstName'), empFName)
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtEmployeeID'), CustomKeywords.'com.Common.CommonMethods.getEmployeeId'())
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtLastName'), empLName)
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtDOB'), CustomKeywords.'com.Common.CommonMethods.getDateStringForDateBefore'())
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtEmailAddress'), empEmail)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/btnSavePersonal'))
WebUI.delay(5)

/* Contact Details*/
WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/btnSaveContact'))
WebUI.delay(5)

/* Employment Details*/
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtJobTitle'), 'Test Analyst')
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/OR_OsC/Payroll/selectLocation'), 2)
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/OR_OsC/Payroll/selectDepartment'), 2)
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtHireDate'), '02 Jan 2022')
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/btnSaveEmployment'))
WebUI.delay(5)

/*Compensation Details*/
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtAnnualSalaryDate'), '02 Jan 2022')
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/OR_OsC/Payroll/txtAnnualSalary'), '100000')
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/OR_OsC/Payroll/btnSaveCompensation'))
WebUI.delay(5)


