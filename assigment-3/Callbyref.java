public class ref {
    int a = 20;
    void call(ref x) {
        x.a = x.a+20;
    }
        public static void main(String[] args) {

        ref x = new ref();
		System.out.println("Before call-by-reference: " + x.a);

        // passing the object as a value using pass-by-reference
        x.call(x);
        System.out.println("After call-by-reference: " + x.a);                
    }
}