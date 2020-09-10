
import com.sun.javafx.iio.ImageStorage.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import com.google.zxing.qrcode.QRCodeWriter;




public class qr_code
{
    public static void main(String arr[]) throws Exception
    {
        String details="Hi Am benitto from ece";
        ByteArrayOutputStream out;
        out = QRCode.from(details).to(ImageType.JPG).stream();
        
        File f = new File("qrcode.img");
        FileOutputStream fos = new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush(); //need libary function to implement this:
        
    }
}
