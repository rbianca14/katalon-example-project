import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('Object Repository/API/POST_Login', [
	('email') : '123',
	('password') : 'cityslicka'
]))
WS.verifyResponseStatusCode(response, 400)
WS.containsString(response, "user not found", false)