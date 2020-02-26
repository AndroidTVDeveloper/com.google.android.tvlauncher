package p000;

import java.util.Arrays;

/* renamed from: dfb */
/* compiled from: PG */
public final class dfb {

    /* renamed from: a */
    public dfa f8441a;

    /* renamed from: b */
    private final String f8442b;

    /* renamed from: c */
    private final dfa f8443c;

    public /* synthetic */ dfb(String str) {
        dfa dfa = new dfa((byte) 0);
        this.f8443c = dfa;
        this.f8441a = dfa;
        this.f8442b = (String) dgx.m6401a(str);
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
        sb.append(this.f8442b);
        sb.append('{');
        dfa dfa = this.f8443c.f8440b;
        String str = "";
        while (dfa != null) {
            Object obj = dfa.f8439a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            dfa = dfa.f8440b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
