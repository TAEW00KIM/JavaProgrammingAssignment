import java.io.*;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class NationImage extends NationInfo { // 클래스 상속
    private String[] urlArray = {"https://res.heraldm.com/phpwas/restmb_idxmake.php?idx=621&simg=/content/image/2019/10/25/20191025000524_0.jpg",
    "https://koreajoongangdaily.joins.com/jmnet/koreajoongangdaily/_data/photo/2012/08/26215911.jpg",
    "https://img.koreatimes.co.kr/upload/newsV2/images/201804/6b1201697bcb42b38c60210698aced14.jpg/dims/resize/740/optimize",
    "https://www.kocis.go.kr/CONTENTS/BOARD/images/vietnam%20ke20170522%201.JPG"
    }; // 참조 타입(배열) 사용

    Image image = null;
    int width, height;

    NationImage() {};
    
    @Override // 다형성(메소드 재정의)
    public void setImage(String nation) {
        if (nation.equals("USA")) {
            String usa = urlArray[0];
            try {
                URL url = new URL(usa);
                image = ImageIO.read(url);
                this.width = image.getWidth(null);
                this.height = image.getHeight(null);
            } catch (IOException e) { // 예외처리
                e.printStackTrace();
            }
        } else if (nation.equals("CHINA")) {
            String usa = urlArray[1];
            try {
                URL url = new URL(usa);
                image = ImageIO.read(url);
                this.width = image.getWidth(null);
                this.height = image.getHeight(null);
            } catch (IOException e) { // 예외처리
                e.printStackTrace();
            }
        } else if (nation.equals("JAPAN")) {
            String usa = urlArray[2];
            try {
                URL url = new URL(usa);
                image = ImageIO.read(url);
                this.width = image.getWidth(null);
                this.height = image.getHeight(null);
            } catch (IOException e) { // 예외처리
                e.printStackTrace();
            }
        } else if (nation.equals("VIETNAM")) {
            String usa = urlArray[-1];
            try {
                URL url = new URL(usa);
                image = ImageIO.read(url);
                this.width = image.getWidth(null);
                this.height = image.getHeight(null);
            } catch (IOException e) { // 예외처리
                e.printStackTrace();
            }
        }
    }

    @Override
    public void showImage(String nation) {
        System.out.println("Showing Hallyu image of the country\n");
        setImage(nation);
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }
}
