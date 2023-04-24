package day51_Map;

public class TestEnum {
    public static void main(String[] args) {
        Browser browser=Browser.SAFARI;

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;
            case SAFARI:
                System.out.println("safari");
                break;
            case OPERA:
                System.out.println("opera");
                break;
            case EDGE:
                System.out.println("edge");
                break;
            default:
                System.out.println("google");

        }

        System.out.println("-------------------------");

        Season season=Season.SUMMER;
    }
}
