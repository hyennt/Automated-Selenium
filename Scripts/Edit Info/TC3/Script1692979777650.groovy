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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/orangehrm-4.5/symfony/web/index.php/auth/login')

WebUI.click(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/form_LOGIN Panel                           _b98207'))

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_Username_txtPassword'), 'Y9Cw+KxBZipQjZECzG8hMA==')

WebUI.click(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/b_My Info'))

WebUI.click(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input__personaltxtEmpFirstName'))

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input__personaltxtEmpFirstName'), FName)

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_Middle Name_personaltxtEmpMiddleName'), 
    MName)

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input__personaltxtEmpLastName'), LName)

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_Employee Id_personaltxtEmployeeId'), 
    Id)

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_Other Id_personaltxtOtherID'), OId)

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_concat(Driver, , s License Number)_pe_642123'), 
    '12345')

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_License Expiry Date_personaltxtLicExpDate'), 
    '2023-01-01')

WebUI.click(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_Gender_personaloptGender'))

WebUI.setText(findTestObject('Object Repository/New Folder (3)/Page_OrangeHRM/input_Date of Birth_personalDOB'), '2002-08-20')

WebUI.click(findTestObject('New Folder (3)/Page_OrangeHRM/span_Required'))

WebUI.closeBrowser()

