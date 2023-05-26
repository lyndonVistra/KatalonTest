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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String name = faker.name().fullName( // Miss Samanta Schmidt
	)

String firstName = faker.name().firstName( // Emory"
	)

String lastName = faker.name().lastName( // Barton
	)
String DOB = CustomKeywords.'com.Common.CommonMethods.getDateStringForDateBefore'()

String streetAddress = faker.address().streetAddress( // 60018 Sawayn Brooks Suite 449
	)
String zipCode = faker.address().zipCode()
String city = faker.address().city()


String Account_name = 'VistraQA-' + faker.address().zipCode()

String Email_address = ((firstName + '.') + lastName) + '@vistraqatest.com'


String abc = faker.regexify("[1-9][1-9]")

System.out.println(abc)
System.out.println('DOB   === ' + DOB)
System.out.println(Email_address)
System.out.println(firstName)
System.out.println(lastName)
System.out.println(streetAddress)
System.out.println(Account_name)
System.out.println(zipCode)
System.out.println(city)

empid = CustomKeywords.'com.Common.CommonMethods.getEmployeeId'().toString()

System.out.println('empid ::: '+ empid)




