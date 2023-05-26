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

GlobalVariable.payrollDefName = CustomKeywords.'com.OsC.Login.generatePayrollDef'()

WebUI.setText(findTestObject('Object Repository/OR_OsC/PAT/customer_entity_search'), 'HSP Engineering - USA')

WebUI.sendKeys(findTestObject('Object Repository/OR_OsC/PAT/customer_entity_search'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/OR_OsC/PAT/customer_entity_search'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.focus(findTestObject('Object Repository/OR_OsC/PAT/btn_Add'))

WebUI.click(findTestObject('Object Repository/OR_OsC/PAT/btn_Add'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/OR_OsC/PAT/payrollDefinition.name'), GlobalVariable.payrollDefName)

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Object Repository/OR_OsC/PAT/payrollDefinition.name'), Keys.chord(Keys.TAB))

WebUI.delay(10)

WebUI.selectOptionByLabel(findTestObject('Object Repository/OR_OsC/PAT/select_Affiliate'), 'QALSP 1 US', false)

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Object Repository/OR_OsC/PAT/select_Affiliate'), Keys.chord(Keys.TAB))

WebUI.delay(10)

WebUI.selectOptionByLabel(findTestObject('Object Repository/OR_OsC/PAT/payroll_type'), 'Salaried Employees', false)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OR_OsC/PAT/btn_save'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OR_OsC/PAT/btn_cliententity_continue'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OR_OsC/PAT/btn_configuredata_continue'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/OR_OsC/PAT/confusage_selectedfields'), 'Gross to Net Calculation', 
    false)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OR_OsC/PAT/btn_confusage_saveconfusage'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OR_OsC/PAT/btn_confusage_continue'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR_OsC/PAT/btn_uploadfile'), 0)

WebUI.delay(10)

WebUI.uploadFile(findTestObject('OR_OsC/PAT/btn_uploadfile'), filePath)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OR_OsC/PAT/btn_completesetup'))
WebUI.delay(5)

if (findTestObject('Object Repository/OR_OsC/PAT/success_toastmsg')) {
	WebUI.switchToWindowIndex(0)
	WebUI.callTestCase(findTestCase('OsC/TC03_OsC_launch_payroll'), [('payroll_Name') : GlobalVariable.payrollDefName], FailureHandling.STOP_ON_FAILURE)

}




