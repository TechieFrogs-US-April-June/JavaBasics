package Strings;

public class StrBufferMutable {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("java");

        sb.append("language");

        System.out.println(sb);
        //Once we create string buffer obj we can perform any changes in that obj.It is mutable(changeable)
        //So this changeable behaviour is nothing but mutability.

    }

}
