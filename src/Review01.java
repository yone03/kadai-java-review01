
public class Review01 {

    public static void main(String[] args) {
        int price = 1500; // 商品価格
        int tax = 10; // 税率
        int result = tax(price, tax); // 消費税額
        int total = price + result; // 税込価格

        System.out.println(price + "円の商品の税込価格は"
        + total + "円（消費税は" + result + "円）です。");
    }

    public static int tax(int price, int tax) {
        return (int) (price * (tax * 0.01));
    }

}
