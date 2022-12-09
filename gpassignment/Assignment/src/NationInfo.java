import java.util.*;
import java.io.*;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class NationInfo implements DefaultModel {
    List<String> nations = new ArrayList<String>(Arrays.asList("USA", "JAPAN", "CHINA", "VIETNAM")); // 컬렉션 프레임워크 사용

    public String select_nation() {
        String nation;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Choose the country(USA, JAPAN, CHINA, VIETNAM). If you don't want any information, type NO: ");
            nation = sc.nextLine();
            nation.toUpperCase();
            if (nations.contains(nation)) {
                System.out.println(String.format("You chose %s", nation));
                System.out.println("##############################################");
                break;
            } else if (nation.equals("NO")) {
                System.out.println("Closing system");
                break;
            } else {
                System.out.println("Please choose again");
                System.out.print("Choose the country(USA, JAPAN, CHINA, VIETNAM): ");
                nation = sc.nextLine();
            }
            sc.close();
        }
        return nation;
    }

    public void info(String nation) {
        BufferedReader reader = null;
        String cur_path = System.getProperty("user.dir");
        String input = null;
        if (nation.equals("USA")) {
            cur_path += "/assignment/src/USA_stats.txt";
            try {
                reader = new BufferedReader(new FileReader(cur_path)); // 파일 입출력
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
            try {
                while ((input = reader.readLine()) != null) {
                    System.out.println(input); // 파일 입출력
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (nation.equals("JAPAN")) {
            cur_path += "/assignment/src/Japan_stats.txt";
            try {
                reader = new BufferedReader(new FileReader(cur_path)); // 파일 입출력
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
            try {
                while ((input = reader.readLine()) != null) {
                    System.out.println(input); // 파일 입출력
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (nation.equals("CHINA")) {
            cur_path += "/assignment/src/China_stats.txt";
            try {
                reader = new BufferedReader(new FileReader(cur_path)); // 파일 입출력
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
            try {
                while ((input = reader.readLine()) != null) {
                    System.out.println(input); // 파일 입출력
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (nation.equals("VIETNAM")) {
            cur_path += "/assignment/src/Vietnam_stats.txt";
            try {
                reader = new BufferedReader(new FileReader(cur_path)); // 파일 입출력
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
            try {
                while ((input = reader.readLine()) != null) {
                    System.out.println(input); // 파일 입출력
                }
            } catch (IOException e) { // 예외처리
                e.printStackTrace();
            }
        }
    }

    public void show_graph(String nation) {
        Image image = null;
        try {
            URL url = new URL("http://res.heraldm.com/content/image/2022/03/03/20220303000679_0.jpg");
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame();
        frame.setSize(1024, 663);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }

    public void setImage(String nation) { }

    public void showImage(String nation) { }
}
