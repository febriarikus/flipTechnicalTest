package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class FAQPage extends PageObject {

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(1) > a > span.blocks-item-title")
    WebElement webButton;

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(2) > a > span.blocks-item-title")
    WebElement bigFlipButton;

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(3) > a > span.blocks-item-title")
    WebElement apiBigFlipButton;

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(4) > a > span.blocks-item-title")
    WebElement layananKirimUangButton;

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(5) > a > span.blocks-item-title")
    WebElement informasiUmumButton;

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(6) > a > span.blocks-item-title")
    WebElement verifikasiDanPengaturanAkunButton;

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(7) > a > span.blocks-item-title")
    WebElement kirimUangButton;

    @FindBy(css = "body > main > div > section.section.knowledge-base > section > ul > li:nth-child(8) > a > span.blocks-item-title")
    WebElement pulsaDanPaketDataButton;


    public void ISeeButtonWeb(){
        Assert.assertEquals("Button text should be : 'Web'","Web",webButton.getText());
    }
    public void ISeeButtonBigFlip(){
        Assert.assertEquals("Button text should be :'Big Flip'","Big Flip",bigFlipButton.getText());
    }
    public void ISeeButtonAPIBigFlip(){
        Assert.assertEquals("Button text should be :'API Big Flip'","API Big Flip",apiBigFlipButton.getText());
    }
    public void ISeeButtonLayananKirimUang(){
        Assert.assertEquals("Button text should be :'Layanan Kirim Uang (Didukung Big Flip)'","Layanan Kirim Uang (Didukung Big Flip)",layananKirimUangButton.getText());
    }
    public void ISeeButtonInformasiUmum(){
        Assert.assertEquals("Button text should be :'Informasi Umum'","Informasi Umum",informasiUmumButton.getText());
    }
    public void ISeeButtonVerifikasidanPengaturanAkun(){
        Assert.assertEquals("Button text should be :'Verifikasi dan Pengaturan Akun'","Verifikasi dan Pengaturan Akun",verifikasiDanPengaturanAkunButton.getText());
    }
    public void ISeeButtonKirimUang(){
        Assert.assertEquals("Button text should be :'Kirim Uang'","Kirim Uang",kirimUangButton.getText());
    }
    public void ISeeButtonPulsanPaketData(){
        Assert.assertEquals("Button text should be :'Pulsa dan Paket Data'","Pulsa dan Paket Data",pulsaDanPaketDataButton.getText());
    }

}
