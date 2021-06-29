package Strings;

public class StringImmutableWhy {
    private int i;

    StringImmutableWhy(int i)
    {
        this.i = i;
    }

     StringImmutableWhy modify(int i)
    {
        if(this.i == i)
        {
            return this;
        }
        else
        {
            return new StringImmutableWhy(i);

        }

    }

    public static void main(String[] args) {
        StringImmutableWhy st1 = new StringImmutableWhy(10);
        StringImmutableWhy st2 = st1.modify(100);
        StringImmutableWhy st3 = st1.modify(10);

        System.out.println(st1 == st2);
        System.out.println(st1 == st3);


    }
}
