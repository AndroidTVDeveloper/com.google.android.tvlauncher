package defpackage;

/* renamed from: wp  reason: default package */
/* compiled from: PG */
final class wp implements Appendable {
    private final Appendable a;
    private boolean b = true;

    public wp(Appendable appendable) {
        this.a = appendable;
    }

    private static final CharSequence a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public final Appendable append(char c) {
        boolean z = false;
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        if (c == 10) {
            z = true;
        }
        this.b = z;
        this.a.append(c);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        CharSequence a2 = a(charSequence);
        append(a2, 0, a2.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence a2 = a(charSequence);
        boolean z = false;
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        if (a2.length() > 0 && a2.charAt(i2 - 1) == 10) {
            z = true;
        }
        this.b = z;
        this.a.append(a2, i, i2);
        return this;
    }
}
