package defpackage;

import java.util.Arrays;

/* renamed from: dfb  reason: default package */
/* compiled from: PG */
public final class dfb {
    public dfa a;
    private final String b;
    private final dfa c;

    public /* synthetic */ dfb(String str) {
        dfa dfa = new dfa((byte) 0);
        this.c = dfa;
        this.a = dfa;
        this.b = (String) dgx.a(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        dfa dfa = this.c.b;
        String str = "";
        while (dfa != null) {
            Object obj = dfa.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            dfa = dfa.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
