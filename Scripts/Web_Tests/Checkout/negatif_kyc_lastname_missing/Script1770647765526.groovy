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

CustomKeywords.'utils.DoLogin.loginTanpaClose'(null, null)

WebUI.click(findTestObject('Object Repository/Dashboard/btn_add_to_cart_backpack'))

WebUI.click(findTestObject('Object Repository/Dashboard/btn_cart'))

WebUI.click(findTestObject('Object Repository/Dashboard/btn_checkout'))

WebUI.setText(findTestObject('Object Repository/Dashboard/field_checkout_firstname'), 'rival')

WebUI.setText(findTestObject('Object Repository/Dashboard/field_checkout_lastname'), '')

WebUI.setText(findTestObject('Object Repository/Dashboard/field_checkout_zip'), '15416')

WebUI.click(findTestObject('Object Repository/Dashboard/btn_checkout_continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Dashboard/error_kyc'), 'Error: Last Name is required')

WebUI.closeBrowser()