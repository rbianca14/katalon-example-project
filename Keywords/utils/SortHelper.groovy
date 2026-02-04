package utils

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
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement

import internal.GlobalVariable

public class SortHelper {

    @Keyword
    def verifyPriceSorting(TestObject priceObject, String sortOrder) {
        // 1. Ambil semua elemen harga dari halaman
        List<WebElement> elements = WebUI.findWebElements(priceObject, 10)
        
        // 2. Bersihkan teks (buang simbol $) dan ubah ke tipe numerik (Double)
        List<Double> actualPrices = new ArrayList<>()
        for (WebElement element : elements) {
            String priceText = element.getText().replace('$', '').trim()
            actualPrices.add(Double.parseDouble(priceText))
        }

        // 3. Buat salinan list untuk diurutkan secara otomatis sebagai pembanding
        List<Double> expectedPrices = new ArrayList<>(actualPrices)
        
        if (sortOrder.equalsIgnoreCase('Ascending')) {
            Collections.sort(expectedPrices) // Rendah ke Tinggi
        } else {
            Collections.sort(expectedPrices, Collections.reverseOrder()) // Tinggi ke Rendah
        }

        // 4. Bandingkan hasil di web dengan hasil urutan sistem
        if (actualPrices.equals(expectedPrices)) {
            KeywordUtil.markPassed("Validasi Berhasil: Harga terurut secara " + sortOrder)
        } else {
            KeywordUtil.markFailedAndStop("Validasi Gagal! \nUrutan di Web: " + actualPrices + "\nEkspektasi: " + expectedPrices)
        }
    }
}