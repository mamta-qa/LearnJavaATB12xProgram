package StringBuffer_and_Builder;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {

        String s0 ="mamta";
        String s1  = new String("mamta");

        StringBuffer stringBuffer = new StringBuffer("mamta");
        StringBuilder stringBuilder = new StringBuilder(("mamta"));


        System.out.println(stringBuffer);
        System.out.println(stringBuilder);


        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
