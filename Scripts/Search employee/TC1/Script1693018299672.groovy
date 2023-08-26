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

WebUI.setText(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/input_Username_txtPassword'), 'Y9Cw+KxBZipQjZECzG8hMA==')

WebUI.click(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/b_PIM'))

WebUI.setText(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/input_Employee Name_empsearchemployee_nameempName'), 
    EmpName)

WebUI.click(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/input_Id_empsearchid'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/select_Current Employees OnlyCurrent and Pa_5c2d89'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/input_Sub Unit__search'))

WebUI.click(findTestObject('Object Repository/New Folder (5)/Page_OrangeHRM/td_A Van'))

WebUI.closeBrowser()

