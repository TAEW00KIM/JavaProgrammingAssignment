public class App {
    public static void main(String[] args) {
        NationInfo info = new NationInfo();
        String nation;

        nation = info.select_nation();
        info.info(nation);
        
        NationImage imageShow = new NationImage();
        imageShow.setImage(nation);
        imageShow.showImage(nation);

        System.out.println("Showing Hallyu graph:");
        info.show_graph(nation);
    }
}

// 과제 설명: 사용자로부터 리스트에 있는 나라들 중 한류 관련 정보를 알고 싶은 나라를 입력 받은 후, 해당 나라에서의 한류에 대한 설명을 출력한다.
//          그리고 해당 나라의 한류 관련 이미지를 보여준 후, 현재 한류의 상승세 그래프를 보여주는 프로그램이다.