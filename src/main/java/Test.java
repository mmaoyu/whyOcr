import cn.easyproject.easyocr.ImageType;
import java.io.File;

/**
 * Created by wupiaoyu on 2017/10/23.
 */
public class Test {
    public static void main(String[] args) {

        EasyOCR ocr = new EasyOCR();
        ocr.setTesseractOptions(EasyOCR.OPTION_LANG_ENG);
        File f = new File("D:\\2.jpg");
        System.out.println(ocr.discernAndAutoCleanImage(f, ImageType.CAPTCHA_INTERFERENCE_LINE,1,1.3));
    }
}
